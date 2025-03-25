public class Fakultas {
    private String nama;
    private double tarifUKT;
    private double gajiPokok;

    public Fakultas(String nama, double tarifUKT, double gajiPokok) {
        this.nama = nama;
        this.tarifUKT = tarifUKT;
        this.gajiPokok = gajiPokok;
    }

    public String getNama() {
        return nama;
    }

    public double getTarifUKT() {
        return tarifUKT;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public static int getCounterFakultas() {
        return counterFakultas;
    }

    public void tampilkanInfoFakultas() {
        System.out.println("Nama Fakultas: " + nama);
        System.out.println("Tarif UKT: Rp" + tarifUKT);
        System.out.println("Gaji Pokok: Rp" + gajiPokok);
    }
}