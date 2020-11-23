package br.edu.univas;

public class StartApp {

	public static void main(String[] args) {
		Image image = new ProxyImage("Nebula_image.jpg");
		
		image.openImage();
		image.openImage();
	}

}
