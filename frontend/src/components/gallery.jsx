import { useEffect, useState } from "react";
import { getGalleryData } from "../data/dataService";
import { Image } from "./image";

export const Gallery = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getGalleryData()
      .then((r) => {
        setApiData(r.data);
      })
      .catch((e) => {
        console.log("Gallery retrival failed!");
      });
  }, []);

  return (
    <div id="portfolio" className="text-center">
      <div className="container">
        <div className="section-title">
          <h2>Gallery</h2>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed
            dapibus leonec.
          </p>
        </div>
        <div className="row">
          <div className="portfolio-items">
            {apiData
              ? apiData.map((d) => (
                  <div key={d.id} className="col-sm-6 col-md-4 col-lg-4">
                    <Image
                      title={d.title}
                      largeImage={d.largeImage}
                      smallImage={d.smallImage}
                    />
                  </div>
                ))
              : "Loading..."}
          </div>
        </div>
      </div>
    </div>
  );
};
