import React, {useState} from 'react'

export default function TextForm (props) {
    const handleUpClick=()=>{
        // console.log("uppercase was clicked" + text)
        let newText = text.toUpperCase();
        setText(newText)
        props.showAlert("Converted to Uppercase","success")
    }

    const handleloClick=()=>{
        // console.log("uppercase was clicked" + text)
        let newText = text.toLowerCase();
        setText(newText)
        props.showAlert("Converted to Lowercase","success")
    }

    const handleCopy = ()=>{
        var text = document.getElementById("myBox");
        text.select();
        navigator.clipboard.writeText(text.value);
        props.showAlert("Copied","success")
    }

    const handleExtraSpaces = () =>{
        let newText = text.split(/[ ]+/);
        setText(newText.join(" "))
        props.showAlert("Removed extra spaces","success")
    }

    const handleClearClick=()=>
    {
        setText("")
        props.showAlert("Cleared text area","success")
    }
    const [text,setText] = useState('');
    
    const handleOnChange=(event)=>{
        // console.log("OnChange")
        setText(event.target.value)
    }
  return (
    <>
    <div className='container' style={{color: props.mode==='dark'?'white':'#042743'}}>
        <h1>{props.heading}</h1>
        <div className="mb-3">
            <textarea className="form-control" 
            style={{backgroundColor: props.mode==='light'?'white':'#042743', color: props.mode==='dark'?'white':'#042743' }}
            id="myBox" rows="8" value={text}  onChange={handleOnChange}></textarea>
        </div>
        <button className="btn btn-primary mx-1" onClick={handleUpClick}>Convert to UpperCase ⬆</button>
        
        <button className="btn btn-primary mx-1" onClick={handleloClick}>Convert to LowerCase ⬇</button>
        
        <button className="btn btn-primary mx-1" onClick={handleExtraSpaces}>Remove Extra Spaces</button>

        <button className="btn btn-primary mx-1" onClick={handleCopy}>Copy</button>
        
        <button className="btn btn-danger mx-1" onClick={handleClearClick}>Clear 🗑</button>

    </div>
    
    <div className="container my-4 " style={{Color: props.mode==='dark'?'white':'#042743', color: props.mode==='dark'?'white':'#042743'}}>
        <h1>Your Text Summary</h1>
        <p><b>{text.split(" ").length-1} words, {text.length} characters</b></p>
        <h1>Preview</h1>
        <p>{text.length>0?text:'Enter text Above'}</p>
    </div>

    </>
  )
}
