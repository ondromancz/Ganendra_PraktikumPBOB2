public class Tendik extends Karyawan {
    private static int counterTendik = 0;

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        this.gajiPokok = 4000000;
        counterTendik++;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (gajiPokok * 0.01 * getMasaKerja());
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Tendik: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIP: " + getNip());
        System.out.println("Masa Kerja: " + getMasaKerja() + " tahun");
        System.out.println("Gaji: Rp" + String.format("%.2f", hitungGaji()));
    }

    public static int getCounterTendik() {
        return counterTendik;
    }
}