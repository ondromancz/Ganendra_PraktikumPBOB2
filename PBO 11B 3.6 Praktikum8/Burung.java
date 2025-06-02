public class Burung extends Anabul {
    private String nama;

    public Burung(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getBunyi() {
        return "Cuit";
    }

    @Override
    public void gerak() {
        System.out.println("Terbang");
    }
}
