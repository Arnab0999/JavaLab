import java.util.*;
public class Complex{
    float real;
    float imaginary;
    public Complex()
    {
        real=0;
        imaginary=0;
    }
    public Complex(float r)
    {
        real=r;
        imaginary=0;
    }
    public Complex(float r,float i)
    {
        real=r;
        imaginary=r;
    }
    public Complex add(Complex Comp1,Complex Comp2)
    {
        Complex C = new Complex();
        C.real=Comp1.real+Comp2.real;
        C.imaginary=Comp1.imaginary+Comp2.imaginary;
        return C;
    } 
    public Complex multiply(Complex Comp1,Complex Comp2)
    {     
        Complex C= new Complex();
        C.real=Comp1.real*Comp2.real-Comp1.imaginary*Comp2.imaginary;
        C.imaginary=Comp1.real*Comp2.imaginary+Comp1.imaginary*Comp2.real;
        return C;
    }
     public static void main(String []args){

        Complex C1 = new Complex(4,5);
        Complex C2 = new Complex(1,2);
        Complex Cadd = new Complex();
        Cadd = C1.add(C1,C2);
        Complex Cmul = new Complex();
        Cmul = C1.multiply(C1,C2);
        System.out.println("The Sum of the two complex number is:"+Cadd.real+"+"+Cadd.imaginary+"i");
        System.out.println("The product of the two complex number is:"+Cmul.real+"+"+Cmul.imaginary+"i");
     }
}
