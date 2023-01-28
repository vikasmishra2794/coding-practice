import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import reportWebVitals from './reportWebVitals';
// import {BrowserRouter} from 'react-router-dom';
import {createStore, applyMiddleware} from 'redux';
import { Provider } from 'react-redux';
import reducer from './reducers/index';
import thunkMiddleware from "redux-thunk";
import {BrowserRouter} from 'react-router-dom';

const middleWare = applyMiddleware(thunkMiddleware);
const store = createStore(reducer, middleWare);
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <App />
    </BrowserRouter>
    {/* <Provider store={store}> */}
    {/* </Provider> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
