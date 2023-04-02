//5.Write a Java program to compare two hash set
import java.util.HashSet;
public class Q5
{
    public static void main(String[] args)
    {
        HashSet<String>set1=new HashSet<>();
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Orange");
        set1.add("Pineapple");
        HashSet<String>set2=new HashSet<>();
        set2.add("Watermelon");
        set2.add("Orange");
        set2.add("Grapes");
        set2.add("Banana");
        for(String str:set1)
        {
            System.out.print(str+": ");
            System.out.println(set2.contains(str)?"Yes":"No");
        }
    }

}
