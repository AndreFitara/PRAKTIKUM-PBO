/**
* Manajer.java 10/05/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class Manajer extends Pegawai{
	// Attribute Manajer (overiding Pegawai)
	protected int tunjangan = 700000;
	
	// Method mengisi nama Manajer
	public Manajer(String name){
		nama = name;
	}
	
	// Method menampilkan nama, gaji pokok Pegawai, dan tunjangan Manajer
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok+", Tunjangan : "+tunjangan);
	}
}
