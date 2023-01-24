// import logo from './logo.svg';
import './App.css';
import Header from './components/Header';
import Cheader from './components/CHeader';
import Channel from './components/Channel';
import FunctionClick from './components/FunctionClick';
import CfunctionClick from './components/CfunctionClick'; 



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
     <Header name="pratik" last="devnal">
      <p>he is good boy</p>
     </Header>
     <Cheader/>
     <Channel/>
     <FunctionClick/>
     <CfunctionClick/>
    </div>
  );
}

export default App;
