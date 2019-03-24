public class Main {
    int index = -1;
    public static void main(String[] args) {
        Student[] s = new Student[3];
        TabulationSheet[] t = new TabulationSheet[5];
        MarkSheet[] m = new MarkSheet[3];

        for (int i = 0; i < 3; i++) {
            m[i] = new MarkSheet();
            m[i].print();
        }
    }
}
