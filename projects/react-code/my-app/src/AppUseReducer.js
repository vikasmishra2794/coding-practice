import logo from './logo.svg';
import './App.css';
import { useEffect, useState, createContext, useContext, useReducer, useRef } from 'react';
const initialState = {count: 0};
function reducer(state, action) {
    switch(action.type) {
        case 'increment':
            return {count: state.count + 1};
            break;
        case 'decrement':
            return {count: state.count - 1};
            break;
        default:
            throw new Error();
    }
}
function App() {
//   const [state, dispatch] = useReducer(reducer, initialState);
  const [count, setCount] = useState(0);
  return (
    <div>
    {count}
    <div>
        <button onClick={() => setCount((prevState) => {return prevState + 1})}>Increase</button>
    </div>
    </div>
  );
}
export default App;

