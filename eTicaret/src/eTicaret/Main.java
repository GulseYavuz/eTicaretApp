package eTicaret;

public class Main {

	public static void main(String[] args) {
		
		Musteri musteri = new Musteri();
		Satici satici = new Satici();
		
		satici.urunEkle("Elbise");
		satici.urunEkle("kıyafet", 800);

	}

}
