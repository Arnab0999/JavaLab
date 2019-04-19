import java.util.*;
public class Box
{
        float height,width,breadth;
        public Box(float h,float w,float b)
        {
                height=h;
                width=w;
                breadth=b;
        }
        public float getVolume()
        {
                return height*width*breadth;
        }
        public float getArea()
        {
                return 2*(height*width+width*breadth+height*breadth);
        }
        public static void main(String[] args)
        {
                Box box1= new Box(12,36,14);
                Box box2= new Box(16,18,7);
                float volume1=box1.getVolume();
                float volume2=box2.getVolume();
                float area1=box1.getArea();
                float area2=box2.getArea();
                System.out.println("Volume and surface area of the first box are :"+volume1+","+area1);
                System.out.println("Volume and surface area of the second box are "+volume2+","+area2);
        }
}
