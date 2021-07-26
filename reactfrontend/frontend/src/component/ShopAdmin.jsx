import React, {Component} from "react"
import AdminPageService from "../service/AdminPageService";

class ShopAdmin extends Component{
    constructor(props) {
        super(props);

        this.state={
                admin: ""
        }
    }
    componentDidMount() {

        AdminPageService.getIndexPage().then(res => console.log(res));

        }


    render(){

        return(
        <div>
            <h1>{this.state.admin}</h1>
            <h1>Hi</h1>
        </div>
    );
 }
}export default ShopAdmin;
