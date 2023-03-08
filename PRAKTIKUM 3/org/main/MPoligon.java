/**
* MPoligon.java 08/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
* Deskripsi : driver class untuk poligon dan persegi panjang
*
*/

package org.main;

import org.bangundatar.*;

public class MPoligon{
	public static void main(String[] args){
		PersegiPanjang persegi = new PersegiPanjang(10,10,4);
		persegi.printInfo();
		System.out.println("Luas Persegi Panjang : "+persegi.hitungLuas() );
		
		Segitiga segitiga = new Segitiga(14, 14, 6);
		segitiga.printInfo();
		System.out.printIln("Luas Segitiga : "+segitiga.hitungLuas());
	}
}
