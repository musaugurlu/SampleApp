import { useEffect, useState } from "react";
import { getServicesData } from "../data/dataService";

export const Services = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getServicesData()
      .then((r) => {
        setApiData(r.data);
      })
      .catch((e) => {
        console.log("Services retrival failed!");
      });
  }, []);

  return (
    <div id="services" className="text-center">
      <div className="container">
        <div className="section-title">
          <h2>Our Services</h2>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed
            dapibus leonec.
          </p>
        </div>
        <div className="row">
          {apiData
            ? apiData.map((d) => (
                <div key={d.id} className="col-md-4">
                  {" "}
                  <i className={d.icon}></i>
                  <div className="service-desc">
                    <h3>{d.name}</h3>
                    <p>{d.text}</p>
                  </div>
                </div>
              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};
