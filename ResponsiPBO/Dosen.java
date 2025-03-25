public class Dosen extends Karyawan {
    private Fakultas fakultas;
    private static int counterDosen = 0;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        this.gajiPokok = fakultas.getGajiPokok();
        counterDosen++;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (gajiPokok * 0.01 * getMasaKerja());
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Dosen: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNip());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("Gaji: Rp" + String.format("%.2f", hitungGaji()));
    }

    public static int getCounterDosen() {
        return counterDosen;
    }
}