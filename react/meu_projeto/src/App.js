
import './App.css';
import HelloWorld from'./components/Helloworld';


function App() {

const name = "matheus"
const newname=name.toUpperCase()


function sum(a,b) {
  return a + b
}
  const url ="https://via.placeholder.com/150"


  return (
    <div className="App"> 
      <h2>alterando o jsx</h2>
      <p>olá , {newname}</p>
      <p>soma:{sum(1,2)}</p>
      <img src={url} alt="minha imagem"/>
      <HelloWorld/>
    </div>
  );
}

export default App;
