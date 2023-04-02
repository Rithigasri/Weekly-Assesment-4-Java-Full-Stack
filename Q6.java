//6.Write a Java program to retrieve and remove the last element of a tree set.
import java.util.TreeSet;
public class Q6
{
    public static void main(String[] args)
    {
        TreeSet<Integer> set1=new TreeSet<>();
        set1.add(21);
        set1.add(72);
        set1.add(63);
        set1.add(47);
        set1.add(59);

        System.out.println("Last element before removing: "+set1.last());
        System.out.println(set1.remove(set1.last()));
        System.out.println("Last element after removing: "+set1.last());
    }
}
