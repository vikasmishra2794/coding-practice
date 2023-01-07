import React, { useContext, useState } from "react"
import { MyContext } from "./App";
import useDocTitle from './useDocTitle';
const B = (props) => {
  const [count1, setCount1] = useState(0);
  useDocTitle(count1);
  const incrementOne = () => {
    setCount1(count1 + 1);
  }

  return (
    <div>
        <button onClick={incrementOne}>CounterB - {count1}</button>
    </div>
  )
};

export default React.memo(B);
