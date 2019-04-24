import java.util.*;

interface Fruit {
    public void hasApeel();

}
interface Vegetable {
    public void hasAroot();
}
class Tomato implements Fruit,Vegetable {
    public void hasApeel() {
        System.out.println("Mango,Banana,Orange");
    }
    public void hasAroot() {
        System.out.println("Potato,Cucumber,Cauliflower");
    }
}
public class Main {
    public static void main(String[] args) {
        Tomato t = new Tomato();
        t.hasApeel();
        t.hasAroot();
    }
}
