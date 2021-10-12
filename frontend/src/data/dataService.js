import axios from "axios";

const baseURL = process.env.REACT_APP_BACKEND_URL + "/api";

export async function getHeaderData() {
  return await axios.get(`${baseURL}/header`);
}

export async function getFeaturesData() {
  return await axios.get(`${baseURL}/feature`);
}

export async function getAboutData() {
  return await axios.get(`${baseURL}/about`);
}

export async function getServicesData() {
  return await axios.get(`${baseURL}/service`);
}

export async function getGalleryData() {
  return await axios.get(`${baseURL}/gallery`);
}

export async function getTestimonialsData() {
  return await axios.get(`${baseURL}/testimonial`);
}

export async function getTeamData() {
  return await axios.get(`${baseURL}/team`);
}

export async function getContactData() {
  return await axios.get(`${baseURL}/contact`);
}
