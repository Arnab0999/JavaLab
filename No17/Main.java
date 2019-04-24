import java.util.*;

class Vehicle {
    int rate;
    boolean paidStatus;
    Vehicle(String type,boolean pstat) 
    {
        if(type=="Truck")
        {
            rate = 500;
        }
        else if(type=="Car")
        {
            rate = 100;
        }
        else if(type=="Bus")
        {
            rate = 600;
        }
        else if(type=="Bike")
        {
            rate = 50;
        }
        else
        {
            rate = 200;
        }
        paidStatus = pstat;
    }
}
class ToolBooth {
    int totalAmountPaid=0;
    int totalVehicles=0;
    int VehiclesNotPaid=0;
    int moneyDue=0;
    public void calculate(Vehicle v)
    {
        if(v.paidStatus)
        {
            totalAmountPaid += v.rate;
            totalVehicles++;
        }
        else
        {
            totalVehicles++;
            VehiclesNotPaid++;
            moneyDue+=v.rate;
        }
    }
    @Override
    public String toString() {
        return "TotalVehicles:"+totalVehicles+"\tVehiclesNotPaid:"+VehiclesNotPaid+"\tTotalAmountPaid:"+totalAmountPaid+"\tTotalAmountDue:"+moneyDue;
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Truck",false);
        Vehicle v2 = new Vehicle("Car",true);
        Vehicle v3 = new Vehicle("Bike",true);
        Vehicle v4 = new Vehicle("Bus",true);
        Vehicle v5 = new Vehicle("Toto",false);
        ToolBooth t = new ToolBooth();
        t.calculate(v1);
        t.calculate(v2);
        t.calculate(v3);
        t.calculate(v4);
        t.calculate(v5);
        System.out.println(t.toString());
    }
}
