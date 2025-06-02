public class Kucing extends Anabul {
    private String nama;

    public Kucing(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getBunyi() {
        return "Meong";
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}
