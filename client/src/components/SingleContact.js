import React, { Component } from 'react';
import AddContacts from './AddContacts';

export default class SingleContact extends Component {




  editContact(event) {
    event.preventDefault();

    let contact ={
      id: this.props.item.id,
      firstName: this.props.firstName,
      lastName: this.props.lastName,
      email: this.props.email, 
    }

      fetch("http://localhost:8888/api/contacts/delete", {
            method: "PUT",
            headers : {
                "content-type" :"application/json"
            },
            body: JSON.stringify(contact)
        })
        .then(response =>response.json());

        window.location.reload();

    
  }

  deleteContact(event) {
    event.preventDefault();
    let contact ={
      id: this.props.item.id,
      firstName: this.props.firstName,
      lastName: this.props.lastName,
      email: this.props.email, 
    }

      fetch("http://localhost:8888/api/contacts/delete", {
            method: "DELETE",
            headers : {
                "content-type" :"application/json"
            },
            body: JSON.stringify(contact)
        })
        .then(response =>response.json());

        window.location.reload();
  }

  /*const SingleContact= ({item}) => (

      <div className="row">
      <div className="col s8 m6">
        <div className="card blue-grey darken-1">
          <div className="card-content white-text">
            <span className="card-title">{item.firstName} {item.lastName}</span>
          
          </div>
          <div className="card-action">
            <p> {item.email}</p>
          </div>
        </div>
      </div>
    </div>*/

 
  render() {

    return(
        <tbody>
          <tr>
            <td>{this.props.item.firstName} {this.props.item.lastName}</td>
            <td>{this.props.item.email} </td>
            <td>
              <a href="#" onClick={this.editContact.bind(this)}><i className="material-icons">edit</i></a>
              <a href="#" onClick={this.deleteContact.bind(this)}><i className="material-icons">delete</i></a>
            </td>
          </tr>
        </tbody>
      )
    }

}