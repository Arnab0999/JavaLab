public class Odd implements Runnable {
    int sum=0;
    @Override
    public void run()
    {
        for (int i = 1; i < 100; i+=2) {
            sum+=i;
        }
    }
    public int returnResult()
    {
        return sum;
    }
}
