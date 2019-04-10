import java.util.*;
class AddAll extends Thread {
	double sum=0;
	double[] array2 = new double[10];
        Denominator d = new Denominator();
        public double returnResult()
        {
                return sum;
        }
        @Override
        synchronized public void run()
        {
		array2 = d.returnResult();
                for(int i=0;i<10;i++)
                {
                    sum+=array2[i];
		    System.out.print(array2[i]+" ");
                }
        }
}
class Denominator extends Thread {
        double fact;
        double[] array = new double[10];
        public int returnsFactorial(int n)
        {
                if(n==1||n==0)
                        return 1;
                else
                        return n*returnsFactorial(n-1);
        }
        public double[] returnResult()
        {
                return array;
        }
        @Override
        synchronized public void run()
        {
                for(int i=0;i<10;i++)
                {
                    array[i]=(double)returnsFactorial(i);
		    System.out.print(array[i]+" ");
                }
        }
}
public class Main {
        public static void main(String args[]) throws Exception {
                Denominator d = new Denominator();
                AddAll a = new AddAll();
		d.start();
		d.join();
                a.start();
                double sum = a.returnResult();
                System.out.println("Sum:"+sum);
        }
}
