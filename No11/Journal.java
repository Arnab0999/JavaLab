public class Journal extends Publication
{
        String JournalName;
        String JournalType;
        int JournalNumber;
        Journal()
        {
                JournalName=getSaltString();
                JournalType=getSaltString();
                JournalNumber=(int)(Math.random()*100);
        }
        @Override
        public String toString()
        {
                return "JournalName= "+JournalName+"JournalType= "+JournalType+"JournalNumber= "+JournalNumber;
        }

}
