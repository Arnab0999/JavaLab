import java.util.*;
public class Employee {
        String name;
        int id;
        String adress;
        float salary;
        public void getEmployee()
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter name:");
                name=sc.nextLine();
                System.out.println("Enter ID:");
                id=sc.nextInt();
                System.out.println("Enter adress:");
                adress=sc.nextLine();
                adress=sc.nextLine();
                System.out.print("Enter Salary:");
                salary=sc.nextFloat();
        }
        public void display()
        {
                System.out.println(name+"\t"+id+"\t"+adress+"\t"+salary);
        }
}
