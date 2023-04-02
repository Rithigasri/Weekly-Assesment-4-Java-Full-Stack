//1.Write a Java program to join two array lists.
import java.util.ArrayList;
public class Q1
{
    public static void main(String[] args)
    {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println("Array 1: "+arr);
        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(40);
        arr1.add(50);
        arr1.add(60);
        System.out.println("Array 2: "+arr1);
        arr.addAll(arr1);
        System.out.println("Joined list: "+arr);

    }
}
