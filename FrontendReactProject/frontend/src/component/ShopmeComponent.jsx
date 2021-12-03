import React,{component} from 'react'
import ShopmeService from "../service/ShopmeService";

class ShopmeComponent extends Component{
    constructor(props){
        super(props)
        this.state ={
            message: ""
        }
    }
    componentDidMount(){
        ShopmeService.getTestShopmeAdmin().this((res)=>{
            
        })
    }
    render(){
        return (
            <div>
                {this.state.message}
            </div>
        );
    }
}
export default ShopmeComponent