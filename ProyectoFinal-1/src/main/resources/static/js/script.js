//Método pause play vídeo
let video = document.getElementById("miVideo")
video.addEventListener('click', pausePlay)

function pausePlay() {
	if (this.paused) {
		this.play()
	} else {
		this.pause()
	}
}

//Método ver más y ver menos en el catálogo de productos
let botonVerMas = document.getElementById('btnVerMas')
let masCartas = document.getElementById('mas')

function verMas() {
	masCartas.style.display = "inline-block"
}

function verMenos() {
	masCartas.style.display = "none"
}