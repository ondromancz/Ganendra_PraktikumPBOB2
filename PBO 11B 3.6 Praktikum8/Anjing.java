public class Anjing extends Anabul {
    private String nama;

    public Anjing(String nama) {
        this.nama = nama;
    }

    @Override
    public String getNama() {
        return nama;
    }

    @Override
    public String getBunyi() {
        return "Guk-guk";
    }

    @Override
    public void gerak() {
        System.out.println("Melata");
    }
}
