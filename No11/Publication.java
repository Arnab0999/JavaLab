import java.util.*;
public abstract class Publication
{
        int noOfPages;
        float price;
        String publisherName;
        protected static String getSaltString()
        {
                String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                StringBuilder salt = new StringBuilder();
                Random rnd = new Random();
                while (salt.length() < 18)
                {
                        int index = (int) (rnd.nextFloat() * SALTCHARS.length());
                        salt.append(SALTCHARS.charAt(index));
                }
                String saltStr = salt.toString();
                return saltStr;
        }
        Publication()
        {
                noOfPages=(int)(Math.random()*100);;
                price=(float)(Math.random()*100);
                publisherName=getSaltString();
        }
}
