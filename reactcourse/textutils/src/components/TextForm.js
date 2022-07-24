import React, {useState} from 'react'

export default function TextForm (props) {
    const handleUpClick=()=>{
        // console.log("uppercase was clicked" + text)
        let newText = text.toUpperCase();
        setText(newText)
    }

    const handleloClick=()=>{
        // console.log("uppercase was clicked" + text)
        let newText = text.toLowerCase();
        setText(newText)
    }

    const handleOnChange=(event)=>{
        // console.log("OnChange")
        setText(event.target.value)
    }

    const handleClearClick=()=>
    {
        setText("")
    }
    const [text,setText] = useState('');
    
  return (
    <>
    <div className='container'>
        <h1>{props.heading}</h1>
        <div className="mb-3">
            <textarea className="form-control" id="myBox" rows="8" value={text}  onChange={handleOnChange}></textarea>
        </div>
        <button className="btn btn-primary mx-1" onClick={handleUpClick}>Convert to UpperCase</button>
        
        <button className="btn btn-primary mx-1" onClick={handleloClick}>Convert to LowerCase</button>

        <button className="btn btn-danger mx-1" onClick={handleClearClick}>Clear</button>
    </div>
    
    <div className="container my-4">
        <h1>Your Text Summary</h1>
        <p><b>{text.split(" ").length-1} words, {text.length} characters</b></p>
    </div>

    </>
  )
}
