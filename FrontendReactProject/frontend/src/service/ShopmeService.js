import axios from 'axios';

class ShopmeService{
    getTestShopmeAdmin(){
        axios.get("http://localhost:8080/api/admin/test")
    }
}
export default new ShopmeService();