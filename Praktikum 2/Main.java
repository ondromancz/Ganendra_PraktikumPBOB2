public class Main {
    public static void main(String[] args) {
        MataKuliah ALPRO = new MataKuliah("ALPRO", "Algoritma Pemrograman", 4);
        MataKuliah ASA = new MataKuliah("ASA", "Analisis dan Strategi Algoritma", 3);
        MataKuliah MBD = new MataKuliah("MBD", "Manajemen Basis Data", 3);
        Mahasiswa M1 = new Mahasiswa("40146", "Ganendra", "Informatika");
        Dosen D1 = new Dosen("123", "Ari", "Informatika");
        Kendaraan K1 = new Kendaraan("B435KZZ", "Motor");
        M1.setDosenWali(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(ALPRO);
        M1.addMatkul(ASA);
        M1.addMatkul(MBD);
        M1.printDetailMhs();
    }
}