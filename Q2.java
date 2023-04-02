//2.Write a Java program to retrieve but does not remove, the first element of a linked list
import java.util.LinkedList;
public class Q2 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("The first element is: "+list.peek());
    }
}
