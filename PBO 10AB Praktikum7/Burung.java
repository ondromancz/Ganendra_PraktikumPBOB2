public class Burung implements Anabul {
    private String nama;

    public Burung() {
        this.nama = "Burung Default";
    }

    public Burung(String nama) {
        this.nama = nama;
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan terbang");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: Cuit!");
    }

    @Override
    public String toString() {
        return nama;
    }
}
