
import './App.css';
import Navbar from './components/Navbar';
import TextForm from './components/TextForm';
function App() {
  return (
    <>
    <Navbar title="TextUtils" aboutText="About TextUtils"/>
    <div className="container my-4">
    <TextForm heading="Enter the Text To Analyze Below"/>
    </div>
    </>
);  
}

export default App;
