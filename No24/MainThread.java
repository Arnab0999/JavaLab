import java.util.*;

class SearchNumber extends Thread {
    int array[];
    int num;
    NumberGenerator n = new NumberGenerator();
    @Override
    public void run()
    {
        int first=0,last=9;
        array = n.arrayGenerator();
        num = n.intGenerator();
        System.out.println("Element to be found: "+num);
        System.out.print("Elements: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println("\nResult:");  
        int mid = (first + last)/2;  
        while( first <= last ){  
            if ( array[mid] < num ){  
                first = mid + 1;     
            }else if ( array[mid] == num ){  
                System.out.println("Element is found at index: " + mid);  
                break;  
            }else {  
                last = mid - 1;  
               }  
            mid = (first + last)/2;  
        }  
        if ( first > last ){  
            System.out.println("Element is not found!");     
        }
    }
}
class NumberGenerator {
    public int[] arrayGenerator()
    {
        Random r = new Random();
        int array[] = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i]=r.nextInt(10);
        }
        Arrays.sort(array);
        return array;
    }
    public int intGenerator()
    {
        Random r = new Random();
        return r.nextInt(10);
    }
}
public class MainThread {
    public static void main(String[] args) throws Exception {
        int max=10;
        for (int i = 0; i < max; i++) {
            SearchNumber s = new SearchNumber();
            s.start();
            s.join();
        }
    }
}
