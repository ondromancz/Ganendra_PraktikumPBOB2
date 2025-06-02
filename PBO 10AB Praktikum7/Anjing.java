public class Anjing implements Anabul {
    private String nama;

    public Anjing() {
        this.nama = "Anjing Default";
    }

    public Anjing(String nama) {
        this.nama = nama;
    }

    @Override
    public void Gerak() {
        System.out.println(nama + " bergerak dengan melata");
    }

    @Override
    public void Bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }

    @Override
    public String toString() {
        return nama;
    }
}
