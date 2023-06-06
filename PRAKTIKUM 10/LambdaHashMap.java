/**
* MapTest.java 06/06/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

import java.util.*;

public class MapTest{
	public static void main(String[] args){
		//kunci -> integer, nilai -> string
		Map<Integer,String> map = new HashMap<Integer,String>();
		//menempatkan elemen kunci dan nilai
		map.put(1,"Satu");
		map.put(2,"Dua");
		//mengambil elemen pertama
		System.out.println(map.get(1));
		//mengambil keseluruhan kunci sebagai objek collection Set
		Set<Integer> key = map.keySet();
		//bagaimana iterasi untuk mengambil keseluruhan
		//nilai dari kunci? Tulis pada laporan anda!
		//petunjuk : gunakan iterasi seperti program ArrayListTest
		
		//jawab:
		//menggunakan for untuk mendefinisikan k sebagai elemen dari key, kemudian melakukan pencetakan ke layar dengan menggunakan k itu sendiri
        //untuk mendapatkan value dari k, dapat menggunakan operator get()
        for (Integer k : key) {
            System.out.println(map.get(k));
        }
	}
}