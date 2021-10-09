import axios from 'axios'

const baseURL = process.env.REACT_APP_BACKEND_URL + "/api"

export const headerData = () => {
    axios.get(baseURL + "/header").then(res => {
        return res.data
    }
    ).catch(err => {
        console.log("Header api failed! - " + err.msg )
    })
}