package latihanMedium;

public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public int isiPeluru(int jumlahPeluru) {
        int currentPeluru = senjata.getPeluru();
        int peluruBaru = currentPeluru + jumlahPeluru;
        senjata.setPeluru(peluruBaru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
        return peluruBaru;
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        senjata.menembak(jumlah);
    }

    public String menusuk() {
        return senjata.menusuk();
    }

    public void pasangBayonet() {
        senjata.pasangBayonet();
    }
}
