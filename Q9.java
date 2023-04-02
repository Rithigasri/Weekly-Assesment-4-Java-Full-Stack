//9.Write a Java program to get a set view of the keys contained in this map
import java.util.HashMap;
public class Q9 {
    public static void main(String[] args)
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"A");
        map.put(2,"B");
        map.put(3,"C");
        map.put(4,"D");
        map.put(5,"E");
        System.out.println(map.keySet());
    }
}
