public class ThreadHandling {
    public static void main(String[] args) {
        myTask M = new myTask();
        M.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("Within Main Thread.");   
        }
    }
}
