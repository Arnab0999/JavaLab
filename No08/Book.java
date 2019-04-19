import java.util.*;
public class Book {
        String title;
        String[] authors;
        int NumberofPages;
        float price;
        String publisher;
        public Book()
        {
                Scanner sc= new Scanner(System.in);
                authors = new String[2];
                 System.out.println("Enter the title of the book:");
                 title=sc.nextLine();
                 System.out.println("Enter the authors of the book:");
                 authors[0]=sc.nextLine();
                 authors[1]=sc.nextLine();
                 System.out.println("Enter the price:");
                 price=sc.nextFloat();
                 System.out.println("Enter the number of pages:");
                 NumberofPages=sc.nextInt();
                 System.out.println("Enter the publisher name:");
                 publisher=sc.nextLine();
                 publisher=sc.nextLine();

        }
        public void display()
        {
                System.out.println(title+"\t\t"+authors[0]+"\t\t"+NumberofPages+"\t\t"+price+"\t\t"+publisher);
                System.out.println("\t\t"+authors[1]);
                System.out.println("-----------------------------------------------------------");
        }
}
