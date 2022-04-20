import logo from './logo.svg';
import './App.css';
import { Button } from './components/Button'

function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <Button color="primary">Testing</Button>
      </header>
    </div>
  );
}

export default App;