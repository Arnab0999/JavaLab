import java.util.*;
public class Student
{
        String name;
        int marks[];
        public void initial(String n,int m[])
        {
                name=n;
                marks = new int[3];
                marks=m;
        }
        public float compute()
        {
                return (marks[0]+marks[1]+marks[2])/3;
        }
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                Student s1 = new Student();
                Student s2 = new Student();
                System.out.println("Enter name of the first student:");
                String n1 = sc.nextLine();
                int marks1[];
                marks1 = new int[3];
                for(int i=0;i<3;i++)
                {
                        System.out.println("Enter marks"+i+" of "+n1);
                        marks1[i]=sc.nextInt();
                }
                s1.initial(n1,marks1);
                System.out.println("Enter name of the second student:");
                String n2 = sc.nextLine();
                int marks2[];
                marks2 = new int[3];
                for(int i=0;i<3;i++)
                {
                        System.out.println("Enter marks"+i+" of "+n2);
                        marks2[i]=sc.nextInt();
                }
                s2.initial(n2,marks2);
                float avg1,avg2;
                avg1=s1.compute();
                avg2=s2.compute();
                System.out.println("Average of the first student:"+avg1);
                System.out.println("Average of the second student:"+avg2);
        }
}
