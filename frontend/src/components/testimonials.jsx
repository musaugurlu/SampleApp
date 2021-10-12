import { useEffect, useState } from "react";
import { getTestimonialsData } from "../data/dataService";

export const Testimonials = () => {
  const [apiData, setApiData] = useState();

  useEffect(() => {
    getTestimonialsData()
      .then((r) => {
        setApiData(r.data);
      })
      .catch((e) => {
        console.log("Testimonials retrival failed!");
      });
  }, []);

  return (
    <div id="testimonials">
      <div className="container">
        <div className="section-title text-center">
          <h2>What our clients say</h2>
        </div>
        <div className="row">
          {apiData
            ? apiData.map((d) => (
                <div key={d.id} className="col-md-4">
                  <div className="testimonial">
                    <div className="testimonial-image">
                      {" "}
                      <img src={d.img} alt="" />{" "}
                    </div>
                    <div className="testimonial-content">
                      <p>"{d.text}"</p>
                      <div className="testimonial-meta"> - {d.name} </div>
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
