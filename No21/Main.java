import java.util.*;
class AddAll extends Thread {
	double sum=0;
        public double returnResult()
        {
                return sum;
        }
        @Override
        synchronized public void run() {
        	for(int i=0;i<10;i++)
        	{
        		Denominator d = new Denominator(i);
        		d.start();
        		try {
					d.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
        		sum+=1/d.returnResult();
        	}
        }
}
class Denominator extends Thread {
        double fact;
        int n;
        Denominator(int x)
        {
        	n=x;
        }
        public int returnsFactorial(int n)
        {
                if(n==1||n==0)
                        return 1;
                else
                        return n*returnsFactorial(n-1);
        }
        public double returnResult()
        {
                return fact;
        }
        @Override
        synchronized public void run()
        {
                fact =(double)returnsFactorial(n);
        }
}
public class Main {
        public static void main(String args[]) throws Exception {
                AddAll a = new AddAll();
                a.start();
                a.join();
                double sum = a.returnResult();
                System.out.println("Sum:"+sum);
        }
}
