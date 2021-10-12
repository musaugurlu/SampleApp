import { useEffect, useState } from "react";
import { getFeaturesData } from "../data/dataService";

export const Features = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getFeaturesData()
      .then((r) => {
        setApiData(r.data);
      })
      .catch((e) => {
        console.log("Features retrival failed!");
      });
  }, []);

  return (
    <div id="features" className="text-center">
      <div className="container">
        <div className="col-md-10 col-md-offset-1 section-title">
          <h2>Features</h2>
        </div>
        <div className="row">
          {apiData
            ? apiData.map((d) => (
                <div key={d.id} className="col-xs-6 col-md-3">
                  {" "}
                  <i className={d.icon}></i>
                  <h3>{d.title}</h3>
                  <p>{d.text}</p>
                </div>
              ))
            : "Loading..."}
        </div>
      </div>
    </div>
  );
};
