/**
* Titik.java 01/03/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
* Deskripsi : kelas yang berisi program utama yang memanfaatkan kelas titik
*
*/

class Titik {
	
		private double absis;
		private double ordinat;
		private static int counterTitik;
		
		public Titik(){
			absis = 0;
			ordinat = 0;
			counterTitik++;
		}
		
		public Titik(double a, double o){
			absis = a;
			ordinat = o;
			counterTitik++;
		}
			
		public void setAbsis(double a){
			absis=a;
		}
		
		public void setOrdinat(double a){
			ordinat=a;
		}
		
		public double getAbsis(){
			return absis;
		}
		
		public double getOrdinat(){
			return ordinat;
		}
		
		public static int getCounterTitik(){
			return counterTitik;
		}
}