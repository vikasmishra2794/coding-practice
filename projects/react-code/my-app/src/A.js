import React, { useState, useMemo } from "react";
import useDocTitle from "./useDocTitle";
import B from './B';

const A = (props) => {
  const [count1, setCount1] = useState(0);
  useDocTitle(count1);
  const incrementOne = () => {
    setCount1(count1 + 1);
  }

  return (
    <div>
      Inside of A component.
        {/* <button onClick={incrementOne}>CounterA - {count1}</button> */}
    </div>
  )
};

export default React.memo(A);
