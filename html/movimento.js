let input = document.getElementById("inputemail");

input.addEventListener("keydown",validate);

function validate(){
    let form =document.querySelector(".formulario");
    let senha = /^[^]+@[^]+\.[a + z]{2,3}$/;
    
    if (input.value.match(senha)){
        form.classList.add("valid");
        form.classList.remove("invalid");
    }else{
        form.classList.add("invalid");
        form.classList.remove("valid");
    }
}