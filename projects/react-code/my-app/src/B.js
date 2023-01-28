import React, { useContext, useState } from "react"
import {useParams,redirect,useNavigate} from 'react-router-dom';
import { MyContext } from "./App";
import useDocTitle from './useDocTitle';
const B = (props) => {
  let navigate = useNavigate()
  const [count1, setCount1] = useState(0);
  useDocTitle(count1);
  const incrementOne = () => {
    setCount1(count1 + 1);
    return navigate('/home');
  }
  const params = useParams();
  console.log("params:===", params);
  return (
    <div>
      Inside of B component
        <button onClick={incrementOne}>CounterB - {count1}</button>
    </div>
  )
};

export default React.memo(B);
