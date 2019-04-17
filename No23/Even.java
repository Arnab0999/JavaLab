public class Even implements Runnable {
    int sum=0;
    @Override
    public void run()
    {
        for (int i = 2; i <= 100; i+=2) {
            sum+=i;
        }
    }
    public int returnResult()
    {
        return sum;
    }
}
