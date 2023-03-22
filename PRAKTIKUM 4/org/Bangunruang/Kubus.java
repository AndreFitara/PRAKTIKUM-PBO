/**
* Kubus.java 22/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

package org.bangunruang;


import org.bangundatar.BujurSangkar;

public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi * panjangSisi;
    }
    public double hitungLuasAlas(){
        return permukaan.hitungLuas();
    }

}
