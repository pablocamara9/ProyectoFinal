let video = document.getElementById("miVideo")

function pausePlay(video) {
    if (video.paused) {
        video.play()
    }else{
        video.pause()
    }
}

let botonVerMas = document.getElementById('btnVerMas')
let masCartas = document.getElementById('mas')


function verMas(){
        masCartas.style.display = "inline-block"
}

function verMenos() {
        masCartas.style.display = "none"
}   
