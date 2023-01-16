package eTicaret;

public class Satici extends uruneBak {
	private String urun;
	private String urunIsim;
	private int urunFiyat;
	
	public static String urunEkle( String urunIsim) {
		System.out.println("urun ismi: " + urunIsim);
		return urunIsim;
	}
	public static int urunEkle(String urun, int urunFiyat) {
		System.out.println("urun fiyatı: " + urunFiyat);
		return urunFiyat;
	}
	
		
		
	
 

}
