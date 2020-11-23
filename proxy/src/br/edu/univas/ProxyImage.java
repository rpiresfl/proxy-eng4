package br.edu.univas;

public class ProxyImage implements Image{
	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void openImage() {
		if(realImage == null){
			realImage = new RealImage(fileName);
		} else {
			System.out.println("Fetching from cache: " + fileName);			
		}
		realImage.openImage();
	}
}
