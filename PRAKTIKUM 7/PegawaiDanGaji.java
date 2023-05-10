/**
* PegawaiDanGaji.java 10/05/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class PegawaiDanGaji{
	public static void main(String[] args){
		Pegawai pegawai1 = new Programmer("Andre");
		Pegawai pegawai2 = new Manajer("Roy");
		Pegawai pegawai3 = new Manajer("Kiano");
		
		Payroll payroll = new Payroll();
		payroll.cetakGaji(pegawai1);
		payroll.cetakGaji(pegawai2);
		payroll.cetakGaji(pegawai3);
	}
}
