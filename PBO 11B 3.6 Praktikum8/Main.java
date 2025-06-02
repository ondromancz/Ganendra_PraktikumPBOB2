import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int jenis = rand.nextInt(3);
            switch (jenis) {
                case 0:
                    koleksiAnabul.add(new Kucing("Kucing" + (i + 1)));
                    break;
                case 1:
                    koleksiAnabul.add(new Anjing("Anjing" + (i + 1)));
                    break;
                case 2:
                    koleksiAnabul.add(new Burung("Burung" + (i + 1)));
                    break;
            }
        }

        koleksiAnabul.showAll();
    }
}
