//Método valdiación de formulario
let formulario = document.getElementById("registerForm");
formulario.addEventListener('submit', validarFormulario);

function validarFormulario() {
    let password = document.getElementById("password").value;
    let repeatPassword = document.getElementById("repeatPassword").value;
    let mensajeError = document.getElementById("passwordError");
    
    if (password !== repeatPassword) {
      mensajeError.style.display = "inline-block";
      return event.preventDefault();
    }else{
        return document.getElementById("registerForm").action = "portada.html";
    }

  }