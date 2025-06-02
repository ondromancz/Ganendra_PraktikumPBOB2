public class Main {
    public static void main(String[] args) {
        Anabul[] hewan = {
            new Kucing("Mimi"),
            new Anjing("Buddy"),
            new Burung("Cici")
        };

        for (Anabul h : hewan) {
            h.Gerak();
            h.Bersuara();
            System.out.println();
        }

        System.out.println("---- Menggunakan kelas generik Datum dan metode generik ----");

        Datum<Anabul> datumKucing = new Datum<>(hewan[0]);
        Datum<Anabul> datumAnjing = new Datum<>(hewan[1]);
        Datum<Anabul> datumBurung = new Datum<>(hewan[2]);

        ContohMetodeGenerik.tampilkanDatum(datumKucing);
        ContohMetodeGenerik.tampilkanDatum(datumAnjing);
        ContohMetodeGenerik.tampilkanDatum(datumBurung);

        datumKucing.setIsi(new Kucing("Aceng"));
        datumAnjing.setIsi(new Anjing("Asep"));
        datumBurung.setIsi(new Burung("Cecep"));

        System.out.println("\nSetelah isi Datum diganti:");

        ContohMetodeGenerik.tampilkanDatum(datumKucing);
        ContohMetodeGenerik.tampilkanDatum(datumAnjing);
        ContohMetodeGenerik.tampilkanDatum(datumBurung);
    }
}
