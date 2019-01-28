import java.util.*;
public class Date{
    int day;
    int month;
    int year;
    public Date()
    {
        day=1;
        month=1;
        year=1970;
    }
    public Date(int d)
    {
        day=d;
        month=1;
        year=1970;
    }
    public Date(int d,int m)
    {
        day=d;
        month=m;
        year=1970;
    }
    public Date(int d,int m,int y)
    {
        day=d;
        month=m;
        year=y;
    }
    public Date prev()
    {
        Date D = new Date();
        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
        {
            if(day==1&&month==1)
            {
                D.day=31;
                D.month=12;
                D.year=year-1;
            }
	    else if(day==1&&month==3&&year%4!=0)
	    {
	        D.day=28;
		D.month=month-1;
		D.year=year;
	    }
	    else if(day==1&&month==3&&year%4==0)
	    {
		D.day=29;
		D.month=month-1;
		D.year=year;
	    }
            else if(day==1)
            {
                D.day=30;
                D.month=month-1;
                D.year=year;
            }
            else
            {
                D.day=day-1;
                D.month=month;
                D.year=year;
            }
        }
        else
        {
            if(day==1)
            {
                D.month=month-1;
                D.day=31;
                D.year=year;
            }
            else if(day==1&&month==3&&year%4!=0)
            {
                D.month=month-1;
                D.day=28;
                D.year=year;
            }
            else if(day==1&&month==3&&year%4==0)
            {
                D.month=month-1;
                D.day=29;
                D.year=year;
            }
            else
            {
                D.day=day-1;
                D.month=month;
                D.year=year;
            }
        }
        return D;
    }
    public Date next()
    {
        Date D = new Date();
        if(month==4||month==6||month==9||month==11)
        {
            if(day==30)
            {
                D.day=1;
                D.month=month+1;
                D.year=year;
            }
        }
        else
        {
            if(year%4==0&&month==2&&day==29)
            {
                D.day=1;
                D.month=month+1;
                D.year=year;
            }
            else if(year%4==0&&month==2&&day==28)
            {
                D.day=day+1;
                D.month=month;
                D.year=year;
            }
            else if(year%4!=0&&month==2&&day==28)
            {
                D.day=1;
                D.month=month+1;
                D.year=year;
            }
            else if(day==31&&month==12)
            {
                D.day=1;
                D.year=year+1;
                D.month=1;
            }
            else
            {
                D.day=day+1;
                D.month=month;
                D.year=year;
            }
        }
        return D;
    }
    public void print()
    {
        System.out.println(day+"/"+month+"/"+year);
    }
    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);	
	int day,mon,year;
	System.out.print("Enter date:");
	day=sc.nextInt();
	mon=sc.nextInt();
	year=sc.nextInt();
        Date d= new Date(day,mon,year);
        Date prevd= new Date();
        Date nextd= new Date();
        prevd=d.prev();
        nextd=d.next();
	System.out.println("Previous date:");
        prevd.print();
	System.out.println("Next date:");
        nextd.print();
    }
}
