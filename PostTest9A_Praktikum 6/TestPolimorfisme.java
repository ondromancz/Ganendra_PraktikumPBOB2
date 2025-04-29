import java.util.ArrayList;

public class TestPolimorfisme {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Programmer("Mira");
        Pegawai pegawai2 = new Manajer("Joko");
        Manajer pegawai3 = new Manajer("Argo");
        Pegawai pegawai4 = new Manajer("Ganendra");
        Pegawai pegawai5 = new Programmer("Dzahwan");

        ArrayList<Pegawai> emps = new ArrayList<>();
        emps.add(pegawai1);
        emps.add(pegawai2);
        emps.add(pegawai3);
        emps.add(pegawai4);
        emps.add(pegawai5);

        for (Pegawai emp : emps) {
            emp.tampilData();
            System.out.println();
        }
    }
}

//1. Jelaskan manfaat polimorfisme pada kasus ini.
//Jawab:
//  - Semua objek (Programmer, Manajer) disimpan dalam satu ArrayList<Pegawai>.
//  - Menambah subclass baru tanpa ubah struktur program.
//  - For-each loop cukup satu untuk semua objek, tanpa cek tipe.

//2. Apabila pada main program perlu menambahkan pegawai4 dan pegawai5! Apa permasalahan yang muncul jika diterapkan tanpa polimorfisme (inclusion)?
//Jawab:
//Jika tanpa poliformisme(inclusion), permasalahan yang muncul antara lain:
//  -Harus buat daftar (list) terpisah untuk setiap jenis pegawai (Manajer, Programmer).
//  -Harus cek satu-satu jenis objek sebelum menampilkan data.
//  -Kode jadi panjang dan rumit.
