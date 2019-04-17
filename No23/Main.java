public class Main {
    public static void main(String[] args) throws Exception{
        Even even = new Even();
        Odd odd = new Odd();
        Thread t1 = new Thread(even);
        Thread t2 = new Thread(odd);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        int sum = even.returnResult()+odd.returnResult();
        System.out.println("Sum:"+sum);
    }
}
