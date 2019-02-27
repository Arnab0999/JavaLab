public class Book extends Publication
{
        String AuthorName;
        String BookNumber;
        int SetNumber;
        Book()
        {
                AuthorName=getSaltString();
                BookNumber=getSaltString();
                SetNumber=(int)(Math.random()*100);
        }
        @Override
        public String toString()
        {
                return "AuthorName= "+AuthorName+" BookNumber= "+BookNumber+" SetNumber = "+SetNumber;
        }

}
