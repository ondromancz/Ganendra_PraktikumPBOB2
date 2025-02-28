/* Nama File : Garis.java
 * Deskripsi : Berisi aplikasi file Garis.java
 * Pembuat : Ganendra Dzahwan Yulianto/24060123140146
 * Tanggal : 21-02-2025
 */

public class MGaris {
    public static void main(String[] args) {
        Garis G1 = new Garis(); 
        Garis G2 = G1; 
        Titik T2 = new Titik(3,4); 
        G1.printT1T2();
        G1.setT1Garis(new Titik(4,6));
        G1.printT1T2(); 
        G1.setT2Garis(T2); 
        G1.printT1T2(); 
        System.out.println("Panjang garis :" + G1.getPanjangGaris()); 
        System.out.println("Gradien garis :" + G1.getGradien()); 
        System.out.println("Titik tengah garis :" + G1.getTitikTengah());
        System.out.println("Apakah garis G1 dan G2 sejajar? : " + G1.isSejajar(G2)); 
        System.out.println("Apakah garis G1 dan G2 saling Tegak Lurus? : " + G1.isTegakLurus(G2)); 
        G1.printRumus(); 
    }
}
