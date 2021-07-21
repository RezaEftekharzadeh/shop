import React from "react";
import ReactDOM from "react-dom";



class TestComponent extends React.Component {
    constructor(props) {
        super(props);
        this.state = {
            name: ""
        };
    }

    handleName = e => this.setState({ name: e.target.value });
    render() {
        const { name } = this.state;
        return (
            <div>
                <h3>Demo of how to use state value</h3>
                <input
                    type="text"
                    onChange={this.handleName}
                    placeholder="Enter you name"
                />
                <br />
                <label>{name}</label>
            </div>
        );
    }
}
export default TestComponent;

