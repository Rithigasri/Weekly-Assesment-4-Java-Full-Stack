//8.Write a Java program to get a collection view of the values contained in this map
import java.util.HashMap;
public class Q8
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1,"a");
        m.put(2,"b");
        m.put(3,"f");
        m.put(4,"z");
        m.put(5,"g");
        m.put(6,"l");
        m.put(7,"m");
        System.out.println("Collection View: "+m.values());
    }
}
