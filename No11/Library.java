public class Library
{
        Publication Pub[]=new Publication[5];
        int index=-1;
        void add(Publication P)
        {
                index++;
                Pub[index]=P;
        }
        public static void main(String[] args) {
                Library L=new Library();
                Book B[] = new Book[3];
                Journal J[] = new Journal[2];
                for (int i=0;i<3;i++) {
                        B[i]=new Book();
                        L.add(B[i]);
                }
                for (int i=0;i<2;i++) {
                        J[i]=new Journal();
                        L.add(J[i]);
                }
                L.Display();
        //System.out.println(J[0].toString());
        }
        void Display()
        {
                for (int i=0;i<5;i++ ) {
                        System.out.println(Pub[i].toString());
                }
        }

}
