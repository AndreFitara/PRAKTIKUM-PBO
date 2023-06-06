/**
* ArrayListTest.java 06/06/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

import java.util.ArrayList;

public class ArrayListTest{
	public static void main(String[] args){
		//inisialisasi ArrayList yang hanya dapat berisi objek String
		ArrayList<String> strings = new ArrayList<String>();
		//menambah elemen
		strings.add("Praktikum");
		strings.add("Collection");
		strings.add("dan Generics");
		//menghapus elemen
		strings.remove("Praktikum");
		//iterasi pada keseluruhan ArrayList
		for(String s : strings){
			System.out.print(s+" ");
		}
	}
}