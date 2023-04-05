/**
* AngkaSial.java 05/04/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + " bukan angka sial");
    }
    
    public static void main(String[] args) {
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            //method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");
        }
    }
}

/*-----------------------------------PERTANYAAN-------------------------------------------
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
 * Apakah baris 21 pada AngkaSial.java di atas dieksekusi
 * 
 *------------------------------------JAWABAN---------------------------------------------
 * Tidak
 * Iya
 */
