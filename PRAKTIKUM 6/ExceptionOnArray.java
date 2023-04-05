/**
* ExceptionOnArray.java 05/04/23
* Penulis : Andre Fitara Agun Ni'am Muta'ali
*/

public class ExceptionOnArray {
    public static void main(String[] args) {
        //instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            exception.printStackTrace();
        }finally{
            System.out.println("clean up code...");
        }
    }
}
