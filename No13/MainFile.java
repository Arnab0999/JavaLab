import java.util.*;

class Person {
    int age;
    float weight;
    float height;
    Date db;
    Random r = new Random();
    String adress = new String();
    Person() throws Exception {
        age = r.nextInt(50);
        weight = 100 * r.nextFloat();
        height = 10*r.nextFloat();
        db = GenerateRandDate();
        adress = getSaltString();
    }
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { 
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
    public Date GenerateRandDate()
    {
        Random  rnd;
        Date    dt;
        long    ms;
        rnd = new Random();
        ms = -946771200000L + (Math.abs(rnd.nextLong()) % (70L * 365 * 24 * 60 * 60 * 1000));
        dt = new Date(ms);
        return dt;
    }
    @Override
    public String toString() {
        return age+"\t"+height+"\t"+weight+"\t"+db;
    }
}
class Employee extends Person {
    float salary;
    Date dateOfJoining;
    int experience;
    Employee() throws Exception
    {
        salary = 1000000*r.nextFloat();
        dateOfJoining = GenerateRandDate();
        experience = r.nextInt(10);

    }
    @Override
    public String toString() {
        return salary+"\t"+dateOfJoining+"\t"+experience; 
    }
}
class Student extends Person {
    int roll;
    String[] listOfSubs = new String[6];
    int[] marks=new int[6];
    char[] grade=new char[6];
    public void GenerateGrade()
    {
        for (int i = 0; i < 6; i++) {
            if(marks[i]<40)
                grade[i]='F';
            else if(marks[i]>40&&marks[i]<50)
                grade[i]='E';
            else if(marks[i]>50&&marks[i]<60)
                grade[i]='D';
            else if(marks[i]>60&&marks[i]<70)
                grade[i]='C';
            else if(marks[i]>70&&marks[i]<80)
                grade[i]='B';
            else if(marks[i]>80&&marks[i]<90)
                grade[i]='A';
            else if(marks[i]>90&&marks[i]<=100)
                grade[i]='S';
        }
    }
    Student() throws Exception
    {
        roll = r.nextInt(100);
        for (int i = 0; i < 6; i++) {
            listOfSubs[i] = getSaltString();
            marks[i] = r.nextInt(100);
        }
    }
    public void print() {
        System.out.println("RollNumber-"+roll);
        System.out.println("Subjects\tMarks\tGrades");
        System.out.println("----------------------------------");
        for (int i = 0; i < 6; i++) {
            System.out.println(listOfSubs[i]+"\t"+marks[i]+"\t"+grade[i]);
        }
    }
}
class Professor extends Employee {
    String[] courses = new String[3];
    String[] advice = new String[3];
    int Courseindex =-1;
    int adviseindex =-1;
    Professor() throws Exception
    {
        for (int i = 0; i < 3; i++) {
            courses[i] = getSaltString();
            Courseindex++;
            advice[i] = getSaltString();
            adviseindex++;
        }
    }
    public void addCourses(String str)
    {
        Courseindex++;
        if(Courseindex>=3)
        {
            System.out.println("Courses are full.");
            return;
        }
        courses[Courseindex]=str;
    }
    public void addAdvise(String str)
    {
        adviseindex++;
        if(adviseindex>=3)
        {
            System.out.println("Advices are Full.");
            return;
        }
        advice[adviseindex]=str;
    }
    public void removeCourses(int index) {
        if(index>=3||index<0)
        {
            System.out.println("Wrong Index");
            return;
        }
        courses[index]="\0";
        Courseindex--;
    }
    public void removeAdvice(int index) {
        if(index>=3||index<0)
        {
            System.out.println("Wrong Index");
            return;
        }
        advice[index]="\0";
        adviseindex--;
    }
    public void print()
    {
        System.out.println("Courses\tAdvices");
        System.out.println("----------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(courses[i]+"\t"+advice[i]);
        }
    }

}
class Technician extends Employee {
    String dept = new String();
    Technician() throws Exception
    {
        dept = getSaltString();
    }
    @Override
    public String toString() {
        return dept;
    }
}
public class MainFile {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        Employee e = new Employee();
        Student s = new Student();
        Professor pro = new Professor();
        Technician t = new Technician();
        System.out.println("Age\tHeight\t        Weight\t         DOB");
        System.out.println("-------------------------------------------------------------");
        System.out.println(p.toString());
        System.out.println("Salary\t\tDateofJoining\t\tExperience");
        System.out.println("--------------------------------------------------------------");
        System.out.println(e.toString());
        s.GenerateGrade();
        s.print();
        pro.removeCourses(2);
        pro.addCourses("Java");
        pro.removeAdvice(2);
        pro.addAdvise("Go Study");
        pro.print();
        System.out.println("Technician Department:"+t.toString());
    }
}
