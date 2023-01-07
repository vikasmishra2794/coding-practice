import logo from './logo.svg';
import './App.css';
import { useEffect, useState, createContext, useContext, useReducer, useMemo, createRef } from 'react';
// const initialState = {count: 0};
// function reducer(state, action) {
//     switch(action.type) {
//         case 'increment':
//             return {count: state.count + 1};
//             break;
//         case 'decrement':
//             return {count: state.count - 1};
//             break;
//         default:
//             throw new Error();
//     }
// }

function App() {
const inputEl = createRef(null);
const focusInputBox = () => {
    console.log("inputEl.current:==", inputEl.current);
    inputEl.current.focus();
}
  return (
    <div>
    <input type="text" ref={inputEl}></input>
    <div>
        <button onClick={() => focusInputBox()}>Increase</button>
    </div>
    </div>
  );
}
export default App;
