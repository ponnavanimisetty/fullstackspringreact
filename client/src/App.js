import React from 'react';
import Contacts from './components/Contacts';
import './App.css';

function App() {
  return (
    
      <div className="container-fluid">
        <nav>
         
        <div className="nav-wrapper left-align grey darken-4" >
          <a herf="/" className="brand-logo center">CONTACTS MAINTENANCE</a>

        </div>
        </nav>
        <div className="row">
          <Contacts />
        </div>
      </div>

    

  );
}

export default App;
