import java.util.*;
public class Student {
    Random rand = new Random();
    String Name = new String();
    int roll;
    String[] Subjects  = new String[5];
    protected String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }
    public Student()
    {
        roll = rand.nextInt(100);
        Name = getSaltString();
        for (int i = 0; i < 5; i++) {
            Subjects[i] = getSaltString();
        }
    }
}
