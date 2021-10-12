import { useEffect, useState } from "react";
import { getAboutData } from "../data/dataService";

export const About = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getAboutData()
      .then((r) => {
        setApiData(r.data[0]);
      })
      .catch((e) => {
        console.log("About data retrival failed!");
      });
  }, []);

  return (
    <div id="about">
      <div className="container">
        <div className="row">
          <div className="col-xs-12 col-md-6">
            {" "}
            <img src="img/about.jpg" className="img-responsive" alt="" />{" "}
          </div>
          <div className="col-xs-12 col-md-6">
            <div className="about-text">
              <h2>About Us</h2>
              <p>{apiData ? apiData.paragraph : "loading..."}</p>
              <h3>Why Choose Us?</h3>
              <div className="list-style">
                <div className="col-lg-6 col-sm-6 col-xs-12">
                  <ul>
                    {apiData
                      ? apiData.reasons
                          .filter((r) => r.name === "Why")
                          .map((d) => <li key={d.id}>{d.reason}</li>)
                      : "loading"}
                  </ul>
                </div>
                <div className="col-lg-6 col-sm-6 col-xs-12">
                  <ul>
                    {apiData
                      ? apiData.reasons
                          .filter((r) => r.name === "Why2")
                          .map((d) => <li key={d.id}>{d.reason}</li>)
                      : "loading"}
                  </ul>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
