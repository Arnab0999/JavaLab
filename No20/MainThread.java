public class MainThread {
    public static void main(String[] args) throws Exception {
        Printer p = new Printer();
        EvenThread e = new EvenThread(p);
        OddThread o = new OddThread(p);
        o.start();
        e.start();
    }
}
