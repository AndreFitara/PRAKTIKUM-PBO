/**
* BujurSangkar.java 22/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

package org.bangundatar;

import org.poligon.Poligon;

public class BujurSangkar extends Poligon{ 
	private double panjangSisi; 
  
	public BujurSangkar(double panjangSisi){ 
		this.jumlahSisi = 4; 
		this.panjangSisi = panjangSisi; 
	} 
  
	public double hitungLuas(){ 
		return panjangSisi * panjangSisi; 
	} 
  
	public double getPanjangSisi(){ 
		return this.panjangSisi; 
	} 
}