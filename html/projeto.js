function somar(){
    const n1 = parseFloat(document.getElementById("num1").values);
    const n2 = parseFloat(document.getElementById("num2").values);
    const resultado= n1 + n2;
    document.getElementById("resultado").innerText="resultado:" + resultado;
}