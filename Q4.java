//4.Write a Java program to remove all of the elements from a hash set
import java.util.HashSet;
public class Q4
{
    public static void main(String[] args)
    {
        HashSet<String> obj=new HashSet<>();
        obj.add("Apple");
        obj.add("Orange");
        obj.add("Pineapple");
        obj.add("Banana");
        System.out.println("The elements are: "+obj);
        obj.removeAll(obj);
        System.out.println("After removing: "+obj);

    }
}
