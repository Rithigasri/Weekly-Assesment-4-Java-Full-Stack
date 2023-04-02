//11.Write a Java program to get the least key greater than or equal to the given key.
// Returns null if there is no such key.
import java.util.Scanner;
import java.util.TreeMap;
public class Q11{
    public static void main(String args[])
    {
        TreeMap< Integer, String > map = new TreeMap < > ();
        map.put(10, "A");
        map.put(15, "B");
        map.put(17, "C");
        map.put(23, "D");
        map.put(50, "E");

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key:");
        int key=sc.nextInt();
        System.out.println("Keys greater than or equal to "+key+": " + map.ceilingKey(key));

    }
}