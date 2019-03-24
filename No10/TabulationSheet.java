import java.util.Random;

public class TabulationSheet {
    int[] rollNo = new int[5];
    String Subject = new String();
    float[] marks = new float[5];
    Random rand = new Random();
    public TabulationSheet()
    {
        for (int i = 0; i < 5; i++) {
            rollNo[i] = rand.nextInt(100);
        }
        Subject = getSaltString();
        for (int i = 0; i < 5; i++) {
            marks[i] = rand.nextFloat();
        }
    }
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
    float addMarks()
    {
        float sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=marks[i];
        }
        return sum;
    }

}
