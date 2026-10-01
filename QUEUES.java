package queues;
 
import java.util.LinkedList;
import java.util.Queue;

public class QUEUES{
    public static void main(String[] args) {
        Queue<String> students = new LinkedList<>();

        
        students.offer("Ana");
        students.offer("Ben");
        students.offer("Carla");

        System.out.println("Initial Queue: " + students);

        
        System.out.println("\nExpected Service Order:");
        while (!students.isEmpty()) {
           
            String served = students.poll();
            System.out.println("Serving: " + served);
        }

      
        if (students.isEmpty()) {
            System.out.println("Queue is empty.");
        }
    }
}
