public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiKarakter = new Koleksi<>();

        koleksiKarakter.add('A');
        koleksiKarakter.add('B');
        koleksiKarakter.add('C');
        koleksiKarakter.add('D');
        koleksiKarakter.add('E');
        koleksiKarakter.add('F');
        koleksiKarakter.add('G');
        koleksiKarakter.add('H');
        koleksiKarakter.add('I');
        koleksiKarakter.add('J');

        System.out.print("Isi Koleksi Karakter: ");
        koleksiKarakter.showAll();
    }
}
