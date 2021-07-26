import axios from "axios";

class AdminPageService {

    getIndexPage(){
        return axios.get("http://localhost:8080/ShopmeAdmind/get");
    }
}
export default new AdminPageService();