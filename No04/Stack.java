import java.util.*;
public class Stack
{
        int top;
        int data[];
        public Stack(int size)
        {
                top=-1;
                data= new int[size];
        }
        public void push(int item)
        {
                if(top==10)
                {
                        System.out.println("Stack is full");
                        return;
                }
                data[top+1]=item;
                top++;
                System.out.println("Element pushed "+data[top]);
        }
        public void pop()
        {
                if(top==-1)
                {
                        System.out.println("Stack is Empty");
                        return;
                }
                System.out.println("Element popped "+data[top]);
                data[top]=0;
               data[top]=0;
                top--;
        }
        public void print()
        {
                System.out.println("Elements in stack:");
                for(int i=0;i<=top;i++)
                {
                        System.out.print(" "+data[i]);
                }
                System.out.print("\n");
        }
        public static void main(String[] args)
        {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the size of the stack: ");
                int size = sc.nextInt();
                Stack S = new Stack(size);
                S.push(10);
                S.push(20);
                S.push(30);
                S.push(15);
                S.push(9);
                S.print();
                S.pop();
                S.pop();
                S.pop();
                S.print();
        }
}
