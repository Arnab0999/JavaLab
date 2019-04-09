import java.util.*;

public class EvenThread extends Thread{
    int n=0;
    Printer pref = new Printer();
    public EvenThread(Printer p)
    {
        pref = p;
    }
    @Override
    synchronized public void run()
    {
        while(n<9)
        {
            n=n+2;
            if(n>=9)
                break;
            pref.print(n);
        }
    }   
}
