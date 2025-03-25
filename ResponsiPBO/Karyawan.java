public abstract class Karyawan extends CivitasAkademika {
    private String nip;
    private int masaKerja;
    protected double gajiPokok;

    public Karyawan(String nama, String email, String nip, int masaKerja) {
        super(nama, email);
        this.nip = nip;
        this.masaKerja = masaKerja;
    }

    public abstract double hitungGaji();

    public String getNip() {
        return nip;
    }

    public int getMasaKerja() {
        return masaKerja;
    }
}