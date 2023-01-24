import React from 'react'

function FunctionClick() {
    function changeEvent()
    {
        console.log("hello event handling");
    }
  return (
    <div><button onClick={changeEvent}>ClickMe</button></div>

  )
}

export default FunctionClick