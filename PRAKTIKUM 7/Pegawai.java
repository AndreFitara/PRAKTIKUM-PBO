/**
* Pegawai.java 10/05/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class Pegawai{
	// Atribute Pegawai
	protected String nama;
	protected int gajiPokok = 5000000;
	
	// Method memberi nama Pegawai
	public void setNama(String name){
		nama = name;
	}
	
	// Method menampilkan nama dan gaji pokok pegawai
	public void tampilData(){
		System.out.println("Nama = "+nama+", Gaji pokok : "+gajiPokok);
	}
}
