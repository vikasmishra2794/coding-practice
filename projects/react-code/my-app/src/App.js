import React, { useCallback, useEffect, useReducer, useRef, useState } from "react"
import axios from 'axios';
import A from './A';
import B from './B';
import { act } from "react-dom/test-utils";

export const MyContext = React.createContext({});
  const App = (props) => {
  const [count, setCount] = useState(0);
  const [count2, setCount2] = useState(0);
  const myRef = useRef();
  const buttonClick = () => {
    console.log("myRef.current:===", myRef.current);
    clearInterval(myRef.current);
  }
  return (
    <div>
      <div>sadjfsdgj</div>
      <div>viksdkskdksdks</div>
    </div>
  )
};

export default App;
