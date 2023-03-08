/**
* MOperasiTitik.java 01/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
* Deskripsi : kelas yang berisi program utama yang memanfaatkan kelas titik
*
*/

public class MOperasiTitik{

    public static void main (String[] args){
        Titik t = new Titik(4.0,4.0);
        OperasiTitik o = new OperasiTitik();

        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiX(t); //hasil
        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
        o.refleksiY(t); //hasil
        System.out.println("Titik : (" + t.getAbsis()+", "+t.getOrdinat() +")");
    }
}
