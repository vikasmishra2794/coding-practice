import React, { useState } from 'react';
import MyForm from './components/CustomerDetails';
import CssBaseline from '@mui/material/CssBaseline';
import Box from '@mui/material/Box';
import Container from '@mui/material/Container';
import './App.css';
import Header from './components/Header';
import Divider from '@mui/material/Divider';

function App() {
  const [isFormEditable, setFormEditable] = useState(false);
  const changeFormState = () => {
    setFormEditable(!isFormEditable);
  }
  return (
    <React.Fragment>
    <CssBaseline />
      <Container maxWidth="md">
        <Box sx={{ bgcolor: '#0000', height: '100vh', border: '1px solid black' }}>
          <Header 
          changeFormState={changeFormState}
          />
          <Divider />
          <MyForm
          isFormEditable={isFormEditable}
          />
        </Box>
      </Container>
    </React.Fragment>
  );
}

export default App;
