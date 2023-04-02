//7.Write a Java program to convert a Priority Queue elements to a string representation
import java.util.PriorityQueue;

public class Q7
{
    public static void main(String[] args)

    {
        PriorityQueue<String> que=new PriorityQueue<>();
        que.add("Avery");
        que.add("Jameson");
        que.add("Grayson");
        que.add("Toby");
        System.out.println("Priority Queue: "+que);
        String str=que.toString();
        System.out.println("String representation: "+str);
    }
}
