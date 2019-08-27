import React from 'react';

const SingleContact= ({item}) => (
/*
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

  <tbody>
    <tr>
      <td>{item.firstName} {item.lastName}</td>
      <td>{item.email} </td>
      <td>Edit / Delete</td>
    </tr>
  </tbody>


);

export default SingleContact;