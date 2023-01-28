import React, {Suspense} from "react"
import {Route, Routes, Link} from 'react-router-dom';
import ReactDOM from "react-dom";
import {useSelector, useDispatch} from 'react-redux';
import {callMe} from './actions/postAction';
const A =  React.lazy(() => import('./A'));
const B =  React.lazy(() => import('./B'));

const App = () => {
  // const posts = useSelector(state => state.postReducer.posts);
  // const dispatch = useDispatch();
  // // console.log(ReactDOM.findDOMNode('button'));
  // console.log('State Data:====', posts);
  // const updatePosts = () => {
  //   console.log("Inside of button click!");
  //   dispatch(callMe(1));
  // }
  return (
    <>
      <nav>
        <ul>
          <li><Link to={"/"}>Home</Link></li>
          <li><Link to={"/books"}>Books</Link></li>
        </ul>
      </nav>
      <Suspense fallback = {<div>Loading</div>}>
        <Routes>
          <Route path="/" element={<A />}></Route>
          <Route path="/books" element={<B />}></Route>
        </Routes>
      </Suspense>
    </>
  )
};

export default App;
