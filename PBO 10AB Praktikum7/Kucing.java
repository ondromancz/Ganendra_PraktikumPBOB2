public class Kucing implements Anabul {
    private String nama;

    public Kucing() {
        this.nama = "Kucing Default";
    }

    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }

    @Override
    public String toString() {
        return nama;
    }
}
