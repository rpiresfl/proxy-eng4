package br.edu.univas;

public class Image {
	private String fileName;
	
	public Image(String fileName){
		this.fileName = fileName;
	}

	public void openImage() {
		fetchImage(fileName);
		System.out.println("Displaying " + fileName + "\n");
	}
	   
	private void fetchImage(String fileName){
		System.out.println("Fetching image: " + fileName);
	}
}
