public class Room
{
        float length;
        float width;
        float height;
        public Room(float l,float w,float h)
        {
                length=l;
                width=w;
                height=h;
        }
        public float volume()
        {
                return length*width*height;
        }
}
