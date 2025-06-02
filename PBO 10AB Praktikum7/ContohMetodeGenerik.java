public class ContohMetodeGenerik {
    public static <T> void tampilkanDatum(Datum<T> datum) {
        System.out.println("Isi datum adalah: " + datum.getIsi().toString());
    }
}
