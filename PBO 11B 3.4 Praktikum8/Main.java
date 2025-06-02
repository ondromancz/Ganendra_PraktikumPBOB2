public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(4);
        Persegipanjang pp = new Persegipanjang(4, 6);
        Segitiga s = new Segitiga(4, 5, 3, 4, 5);

        BangunDatarGeneric<Persegi> bdPersegi = new BangunDatarGeneric<>();
        bdPersegi.set(p);
        System.out.println("Luas Persegi : " + bdPersegi.hitungLuas());
        System.out.println("Keliling Persegi : " + bdPersegi.hitungKeliling());

        BangunDatarGeneric<Persegipanjang> bdPersegipanjang = new BangunDatarGeneric<>();
        bdPersegipanjang.set(pp);
        System.out.println("Luas Persegipanjang : " + bdPersegipanjang.hitungLuas());
        System.out.println("Keliling Persegipanjang : " + bdPersegipanjang.hitungKeliling());

        BangunDatarGeneric<Segitiga> bdSegitiga = new BangunDatarGeneric<>();
        bdSegitiga.set(s);
        System.out.println("Luas Segitiga : " + bdSegitiga.hitungLuas());
        System.out.println("Keliling Segitiga : " + bdSegitiga.hitungKeliling());
    }
}
