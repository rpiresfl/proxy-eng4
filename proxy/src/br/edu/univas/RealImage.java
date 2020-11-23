package br.edu.univas;

public class RealImage implements Image{
	private String fileName;
	
	public RealImage(String fileName){
		this.fileName = fileName;
		fetchImage(fileName);
	}

	@Override
	public void openImage() {
		System.out.println("Displaying " + fileName + "\n");
	}
	   
	private void fetchImage(String fileName){
		System.out.println("Fetching image: " + fileName);
	}
}
