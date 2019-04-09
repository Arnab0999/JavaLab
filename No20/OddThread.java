import java.util.*;

public class OddThread extends Thread {
    int n=1;
    Printer pref = new Printer();
    public OddThread(Printer p)
    {
        pref  = p;
    }
    @Override
    public void run()
    {
        synchronized(this) {
            while(n<9)
            {
                pref.print(n);
                n+=2;
            }
        }
    }
}
