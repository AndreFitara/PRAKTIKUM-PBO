/**
* MapTest.java 06/06/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

import java.util.*;

public class LambdaHashMap {
    public static void main(String[] args) {
        Map<String, String> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("24060121120029", "Joko");
        mahasiswaMap.put("24060121130033", "Bara");
        mahasiswaMap.put("24060121140123", "Dodi");
        mahasiswaMap.put("24060121130456", "Nia");

        mahasiswaMap.forEach((nim, nama) -> System.out.println("NIM: " + nim + " Nama: " + nama ));
    }
}
