/**
* BangunDatar.java 29/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
* Deskripsi : kelas abstrak, berisi abstraksi bangun datar
*/

public abstract class BangunDatar{
    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double l){
        luas = l;
    }

    public double getLuas(){
        return luas;
    }
}