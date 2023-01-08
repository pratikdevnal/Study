// import logo from './logo.svg';
import './App.css';

const name = <span>Hello React</span>;
const test =()=>{
  alert("hello");
}
const age = (a) =>{
if(a>18)
{
  return <span>adult</span>
}
else{
  return <span>not adult</span>
}
}
function App() {
  return (
    <div className="App">
     <h1>hello technical suneja, {name}</h1>
     <button onClick={test}></button>
     {age(19)}
    </div>
  );
}

export default App;
