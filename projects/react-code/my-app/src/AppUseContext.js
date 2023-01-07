import logo from './logo.svg';
import './App.css';
import { useEffect, useState, createContext, useContext } from 'react';
const themes = {
  light: {
    foreground: "#000000",
    background: "#eeeeee"
  },
  dark: {
    foreground: "#ffffff",
    background: "#222222"
  }
};
const MyContext = createContext(themes.light);

function App() {
  const [count, setCount] = useState(0);
  return (
    <MyContext.Provider value={themes.dark}>
      <ToolBar />
    </MyContext.Provider>
  );
}
function ToolBar() {
  return <div>
      <ThemedButton />
    </div>
}
function ThemedButton() {
  const theme = useContext(MyContext);
  console.log("theme:====", theme);
    return (
    <button style={{ background: theme.background, color: theme.foreground }}>
      I am styled by theme context!
    </button>
  );
}
export default App;
