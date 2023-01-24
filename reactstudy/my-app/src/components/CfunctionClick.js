import React, { Component } from 'react'

export class CfunctionClick extends Component {
    changeEvent(){
        console.log("hello hello")
    }
  render() {
    return (
        <div><button onClick={this.changeEvent}>ClickMeclass</button></div>
    )
  }
}

export default CfunctionClick