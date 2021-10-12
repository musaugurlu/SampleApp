import { useEffect, useState } from "react";
import { getTeamData } from "../data/dataService";

export const Team = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getTeamData()
      .then((r) => {
        setApiData(r.data);
      })
      .catch((e) => {
        console.log("Teams retrival failed!");
      });
  }, []);

  return (
    <div id="team" className="text-center">
      <div className="container">
        <div className="col-md-8 col-md-offset-2 section-title">
          <h2>Meet the Team</h2>
          <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing elit duis sed
            dapibus leonec.
          </p>
        </div>
        <div id="row">
          {apiData
            ? apiData.map((d) => (
                <div key={d.id} className="col-md-3 col-sm-6 team">
                  <div className="thumbnail">
                    {" "}
                    <img src={d.img} alt="..." className="team-img" />
                    <div className="caption">
                      <h4>{d.name}</h4>
                      <p>{d.job}</p>
                    </div>
                  </div>
                </div>
              ))
            : "loading"}
        </div>
      </div>
    </div>
  );
};
