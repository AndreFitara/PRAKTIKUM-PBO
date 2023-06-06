/**
* BangunDatarGeneric.java 06/06/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class BangunDatarGeneric<T extends BangunDatar>{
	private T bangunDatar;
	
	public void set(T tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}
	
	public T get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

//Jika Mengubah karakter 'T' menjadi 'T2' atau karakter lain di dalam kelas BangunDatarGeneric, kode tersebut akan tetap berjalan tanpa ada masalah. 
//Karakter yang digunakan hanya sebagai nama variabel saja.