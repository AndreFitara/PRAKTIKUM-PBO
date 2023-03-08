/**
* Titik.java 01/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
* Deskripsi : program class OperasiTitik
*
*/

public class OperasiTitik{
	private void refleksiSumbuX(Titik titik){
		double ordinat = titik.getOrdinat();
		ordinat = ordinat * -1;
		titik.setOrdinat(ordinat);
	}
	
	private void refleksiSumbuY(Titik titik){
		double absis = titik.getAbsis();
		absis = absis * -1;
		titik.setAbsis(absis);
	}
	
	 public void refleksiX(Titik titik){
        refleksiSumbuX(titik);
        return;
    }    

    public void refleksiY(Titik titik){
        refleksiSumbuY(titik);
        return;
    }
}