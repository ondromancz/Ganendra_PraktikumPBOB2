public class Main {
    public static void main(String[] args) {
        //Fakultas
        Fakultas FSM = new Fakultas("Sains dan Matematika", 8500000, 10000000);

        //Mahasiswa
        Mahasiswa mahasiswa = new Mahasiswa("Ganendra", "ganendra@jimel.com", "146", 2, FSM);

        //Dosen
        Dosen dosen = new Dosen("Dr. Gaza", "gazaganteng@jimel.com", "D01", 3, FSM);

        //Tendik
        Tendik tendik = new Tendik("Kimil", "kimil23@example.com", "T01", 4);

        //Menampilkan Informasi
        System.out.println("--- Informasi Mahasiswa ---");
        mahasiswa.tampilkanInformasi();

        System.out.println("\n--- Informasi Dosen ---");
        dosen.tampilkanInformasi();

        System.out.println("\n--- Informasi Tendik ---");
        tendik.tampilkanInformasi();

        // Menampilkan Counter
        System.out.println("\n--- Jumlah Civitas Akademika ---");
        System.out.println("Jumlah Mahasiswa: " + Mahasiswa.getCounterMahasiswa());
        System.out.println("Jumlah Dosen: " + Dosen.getCounterDosen());
        System.out.println("Jumlah Tendik: " + Tendik.getCounterTendik());

    }
}
