/**
* Lingkaran.java 06/06/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}