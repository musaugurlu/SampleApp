import { useEffect, useState } from "react";
import { getHeaderData } from "../data/dataService";

export const Header = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getHeaderData()
      .then((res) => {
        setApiData(res.data[0]);
      })
      .catch((e) => {
        console.log("Failed to retrieve header data!");
      });
  }, []);

  return (
    <header id="header">
      <div className="intro">
        <div className="overlay">
          <div className="container">
            <div className="row">
              <div className="col-md-8 col-md-offset-2 intro-text">
                <h1>
                  {apiData ? apiData.title : "Loading"}
                  <span></span>
                </h1>
                <p>{apiData ? apiData.paragraph : "Loading"}</p>
                <a
                  href="#features"
                  className="btn btn-custom btn-lg page-scroll"
                >
                  Learn More
                </a>{" "}
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>
  );
};
