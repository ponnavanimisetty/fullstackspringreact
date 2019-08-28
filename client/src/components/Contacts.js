import React, { Component } from 'react';
import SingleContact from './SingleContact';
import AddContacts from './AddContacts';

export default class Contacts extends Component{

    constructor(props){
        super(props);
        this.state= { contacts: [] };
    }

    componentDidMount() {
        fetch("http://localhost:8888/api/contacts")
        .then(response => response.json())
        .then(data => this.setState( {contacts : data}))

    }

    render(){
        return(
            <div>
                <div className="row">
                < AddContacts />
                </div>
                <div className="row">
                <table className="striped">
                <thead className="white-text teal darken-1">
                <tr>
                <th>First Name</th>
                <th>Email</th>
                <th>Action</th>
                </tr>
                </thead>
                    { this.state.contacts.map((item)=>(
                        <SingleContact key={item.id} item={item}/>
                    ))
                    }
                
                </table>
                </div>
            </div>
        ) 
    }

}