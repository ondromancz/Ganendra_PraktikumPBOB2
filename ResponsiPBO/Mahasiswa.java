public class Mahasiswa extends CivitasAkademika {
    private String nim;
    private int semester;
    private Fakultas fakultas;
    private static int counterMahasiswa = 0;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counterMahasiswa++;
    }

    public double hitungUKT() {

        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void tampilkanInformasi() {
        System.out.println("Nama Mahasiswa: " + getNama());
        System.out.println("Email: " + getEmail());
        System.out.println("NIM: " + nim);
        System.out.println("Semester: " + semester);
        System.out.println("Fakultas: " + fakultas.getNama());
        System.out.println("UKT: Rp" + String.format("%.2f", hitungUKT()));
    }

    public static int getCounterMahasiswa() {
        return counterMahasiswa;
    }
}