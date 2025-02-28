/* Nama File : MTitik.java
 * Deskripsi : Berisi aplikasi file Titik.java
 * Pembuat : Ganendra Dzahwan Yulianto/24060123140146
 * Tanggal : 21-02-2025
 */

public class MTitik {
    public static void main(String[] args) {
        Titik T1 = new Titik(); 
        Titik T2 = T1; 
        T1.setAbsis(2); 
        T1.setOrdinat(3); 
        T1.printTitik(); 
        T1.geser(4, 5); 
        T1.printTitik(); 
        T2.printTitik(); 
        T1.setAbsis(10); 
        T1.setOrdinat(10); 
        T2.printTitik(); 
        System.out.println("Berada di kuadran: " + T1.getKuadran()); 
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat()); 
        System.out.println("Jarak ke pusat: " + T1.getJarak(T2)); 
        T1.setRefelksiX(); 
        T1.printTitik(); 
        T1.setRefelksiY(); 
        T1.printTitik(); 
        System.out.println("Berada di kuadran: " + T1.getKuadran()); 
        Titik reflekX = T1.getRefleksiX(); 
        reflekX.printTitik(); 
        Titik reflekY = T1.getRefleksiY(); 
        reflekY.printTitik(); 
    }
}
