//Método pause play vídeo
let video = document.getElementById("miVideo");
video.addEventListener('click', pausePlay);

function pausePlay() {
    if (this.paused) {
        this.play();
    }else{
        this.pause();
    }
}

//Método ver más y ver menos en el catálogo de productos
let botonVerMas = document.getElementById('btnVerMas');
let botonVerMenos = document.getElementById('btnVerMenos');

botonVerMas.addEventListener('click', verMas);
botonVerMenos.addEventListener('click', verMenos);

let masCartas = document.getElementById('mas');

function verMas(){
        masCartas.style.display = "inline-block";
}

function verMenos() {
        masCartas.style.display = "none";
}   

//Para ver más cuando pinche en uniforme de batalla y accesorios para las armas en el menú desplegable del nav
/*let uniformeBatalla = document.getElementById('uniformeBatalla');
let accesioriosArmas = document.getElementById('accesioriosArmas');

uniformeBatalla.addEventListener('click', verMas);
accesioriosArmas.addEventListener('click', verMas);*/