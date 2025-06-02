import java.util.ArrayList;
import java.util.List;

public class Koleksi<T extends Anabul> {
    private List<T> list;

    public Koleksi() {
        list = new ArrayList<>();
    }

    public void add(T item) {
        list.add(item);
    }

    public void showAll() {
        for (T item : list) {
            System.out.println("Nama : " + item.getNama());
            System.out.println("Bunyi : " + item.getBunyi());
            System.out.print("Gerak : ");
            item.gerak();
            System.out.println();
        }
    }
}
