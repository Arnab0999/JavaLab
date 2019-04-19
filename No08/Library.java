import java.util.*;
public class Library {
        public Library()
        {
                for(int i=0;i<5;i++)
                        Books[i]=new Book();
        }
        Book[] Books=new Book[5];
        int index=-1;
        private static Scanner sc;
        public void add(Book b)
        {
                if(index==10)
                {
                        System.out.println("Library is full..");
                }
                else
                {
                        index++;
                        Books[index]=b;
                }
        }
        public void remove(Book b)
        {
                for(int i=0;i<index;i++)
                {
                        if(Books[i].title==b.title)
                        {
                                Books[i]=Books[index];
                        }
                        index--;
                }
        }
        public void print()
        {
                System.out.println("Title\tAuthors\tPages\tPrice\tPublisher");
                System.out.println("=================================================");
                for(int i=0;i<5;i++)
                {
                        Books[i].display();
                }
        }
        public float TotalPrice()
        {
                float sum=0;
                for(int i=0;i<index;i++)
                {
                        sum+=Books[i].price;
                }
                return sum;
        }
        public static void main(String[] args)
        {
                Library L=new Library();
                L.print();
        }
}
