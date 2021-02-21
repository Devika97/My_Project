
import React, { Component } from 'react';
import { Switch, Route } from "react-router-dom";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import StudentDetails from "./components/student-list.js"
class App extends Component {
  
  render() { 
    return ( 
      <div className="mcontainer">
      
          <Switch>
           <Route exact path={["/", "/students"]} component={StudentDetails} />
          
          </Switch>
        </div>
     );
  }
}
 
export default App;