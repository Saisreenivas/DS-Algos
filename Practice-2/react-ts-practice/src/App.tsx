import React from 'react';
import logo from './logo.svg';
import './App.css';
import { Button, ButtonType } from './components/Button';
import { Login } from './components/Login';

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <Button type={ButtonType.primary}>Testing</Button>
        <Login type={ButtonType.secondary} />
      </header>
    </div>
  );
}

export default App;
