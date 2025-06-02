import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        if (index >= 0 && index < nbelm) {
            return wadah.get(index);
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void setIsi(int index, T nilaiBaru) {
        if (index >= 0 && index < nbelm) {
            wadah.set(index, nilaiBaru);
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public int getSize() {
        return nbelm;
    }

    private void setSize(int size) {
        nbelm = size;
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < nbelm) {
            wadah.remove(index);
            nbelm--;
        } else {
            throw new IndexOutOfBoundsException("Index tidak valid");
        }
    }

    public void showAll() {
        for (int i = 0; i < nbelm; i++) {
            System.out.print(wadah.get(i) + " ");
        }
        System.out.println();
    }
}
