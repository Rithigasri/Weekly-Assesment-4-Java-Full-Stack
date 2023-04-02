//3.Write a Java program to check if a particular element exists in a linked list
import java.util.LinkedList;
public class Q3
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        if(list.contains(30))
        {
            System.out.println("The element is present");
        }
        else
        {
            System.out.println("The element is not present");
        }
    }
}
