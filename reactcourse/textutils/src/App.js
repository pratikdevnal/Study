
import { useState } from 'react';
import './App.css';
// import About from './components/About';
import Navbar from './components/Navbar';
import TextForm from './components/TextForm';
function App() {
  const [mode, setMode] = useState('light'); //whether dark is enabled or not
  const toggleMode = () => {
    if(mode=== 'light')
    {
      setMode('dark')
      document.body.style.background = '#042743'
    }
    else
    {
      setMode('light')
      document.body.style.background = 'white'
    }
  }
  return (
    <>
    <Navbar title="TextUtils" mode={mode} toggleMode={toggleMode}/>
    <div className="container my-4">
    <TextForm heading="Enter the Text To Analyze Below" mode={mode}/>
    {/* <About/> */}
    </div>
    </>
);  
}

export default App;
