import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
class Producer extends Thread{
    @Override
    public synchronized void run()
    {
        try {
            Scanner s = new Scanner(new File("FileNumber.txt"));
            while(s.hasNext())
            {
                Consumer c = new Consumer(s.nextInt());
                c.start();
                try {
                    c.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } catch(FileNotFoundException f) {
            f.printStackTrace();
        }
    }
}
class Consumer extends Thread {
    static int sum=0;
    int n;
    Consumer(int x)
    {
        n=x;
    }
    @Override
    public void run()
    {
        sum+=n;
    }
    public int name() {
        return sum;
    }
}
public class MainThread {
    public static void main(String[] args) throws Exception {
        Producer p = new Producer();
        p.start();
        p.join();
        Consumer c = new Consumer(0);
        int sum=c.name();
        System.out.println("Sum:"+sum);
    }
}
