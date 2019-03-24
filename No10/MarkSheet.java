import java.util.Random;

public class MarkSheet {
    String[] Subjects = new String[5];
    int rollNo;
    float[] marks = new float[5];
    String name = new String();
    Random rand = new Random();
    public MarkSheet()
    {
        for (int i = 0; i < 5; i++) {
            marks[i] = rand.nextFloat()*100;
        }
        rollNo = rand.nextInt(100);
        name = getSaltString();
        for (int i = 0; i < 5; i++) {
            Subjects[i] = getSaltString();
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
        float TotalMarks = 0;
        for (int i = 0; i < 5; i++) {
            TotalMarks+=marks[i];
        }
        return TotalMarks;
    }
    void print()
    {
        System.out.println("RollNumber:"+rollNo+"\tName:"+name);
        System.out.println("SubjectName\t\tMarks");
        System.out.println("---------------------------------------");
        for (int i = 0; i < 5; i++) {
            System.out.println(Subjects[i]+"\t"+marks[i]);
        }
        System.out.println("=======================================");
    }
}
