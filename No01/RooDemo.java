import java.util.*;

public class RooDemo
{
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter length:");
                float l=sc.nextFloat();
                System.out.println("Enter width:");
                float w=sc.nextFloat();
                System.out.println("Enter height:");
                float h=sc.nextFloat();
                Room obj = new Room(l,w,h);
                float vol=obj.volume();
                System.out.println("Volume:"+vol);
        }
}
