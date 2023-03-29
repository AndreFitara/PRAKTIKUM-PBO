/**
* Lingkaran.java 29/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
* Deskripsi : Kelas implementasi IArea berupa cara menghitung luas lingkaran
*/

import static java.lang.Math.PI;

class Lingkaran implements IArea {
    private double jejari;

    public Lingkaran(double r) {
        jejari = r;
    }

    public double hitungLuas() {
        return PI * jejari * jejari;
    }
}