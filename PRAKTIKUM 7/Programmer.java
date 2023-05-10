/**
* Programmer.java 10/05/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class Programmer extends Pegawai{
	// Attribute Programmer (overiding Pegawai)
	protected int bonus = 450000;
	
	// Method mengisi nama Programmer
	public Programmer(String name){
		nama = name;
	}
	
	// Method menampilkan nama, gaji pokok Pegawai, dan bonus Programmer
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok+", Bonus : "+bonus);
	}
}
