import java.util.*;
public class Dept {
        String name;
        String location;
        int count=-1;
        Employee[] emp= new Employee[5];
        public Dept(String n,String l)
        {
                name=n;
                location=l;
        }
        public void add(Employee Emp)
        {
                if(count>=4)
                {
                        System.out.println("Employee is full");
                        return;
                }
                count++;
                emp[count]=Emp;
        }
        public void remove(Employee Emp)
        {
                for(int i=0;i<5;i++)
                {
                        if(emp[i].id==Emp.id)
                        {
                                emp[i]=emp[i+1];
                                emp[i+1].id=Emp.id;
                        }
                }
        }
        public float getsalary()
        {
                float sum=0;
                for(int i=0;i<5;i++)
                {
                        sum+=emp[i].salary;
                }
                return sum;
        }
        public void print()
        {
                System.out.println("--------------"+name+"-------------");
                System.out.println(location);
                System.out.println("Name\tID\tAdress\tSalary");
                System.out.println("---------------------------------------------------------");
                for(int i=0;i<5;i++)
                {
                        emp[i].display();
                }
        }
        public static void main(String args[])
        {
                Dept d=new Dept("Information Technology","Chingrighata,Saltlake Sector-IV,Kolkata-700091");
                for(int i=0;i<5;i++)
                {
                        Employee Emp=new Employee();
                        Emp.getEmployee();
                        d.add(Emp);
                }
                d.print();
                System.out.println("Total expense:"+d.getsalary());
        }
}
