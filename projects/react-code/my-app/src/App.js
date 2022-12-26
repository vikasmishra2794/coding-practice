import logo from './logo.svg';
import './App.css';
import { useEffect, useState } from 'react';

function App() {
  const [count, setCount] = useState(0);
  useEffect(() => {
    console.log('I am inside useEffect!!');
  },[])
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <button onClick={() => setCount(count + 1)}>Click</button>
        <p>You clicked {count} times</p>
      </header>
    </div>
  );
}

export default App;
