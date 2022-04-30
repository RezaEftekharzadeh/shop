import axios from "axios";

class AdminPageService {

    getIndexPage(){
        return axios.get("http://localhost:8081/api/rest/ShopmeAdmin/get");
    }
}
export default new AdminPageService();