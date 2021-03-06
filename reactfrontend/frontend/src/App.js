import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import './App.css';
import ShopAdmin from "./component/ShopAdmin";
import TestComponent from "./component/TestComponent"

function App() {
  return (
    <div className="App">
      <Router>
        <div className="container">
          <Switch>
              <Route path= "/ShopmeAdmin" exact component ={ShopAdmin}></Route>
              <Route path= "/test" exact component ={TestComponent}></Route>

          </Switch>
        </div>
      </Router>
    </div>
  );
}

export default App;
