import java.sql.SQLOutput;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueues {
    public static void main(String[] args) {

        /**
         The PriorityQueue is a FIFO data structure, which differs from the casual Queues in the way it serves the elements

         -> The PriorityQueue serves the element based on the priority, the highest first, all the way down to the lowest!
         */

        //Let's take a look at the following random prices queue
        Queue<Integer> carPrices = new LinkedList<>();
        carPrices.offer(20000);
        carPrices.offer(44500);
        carPrices.offer(15000);
        carPrices.offer(3800);
        carPrices.offer(9755);

        System.out.println("Prices of the cars in the queue : ");
        while (!carPrices.isEmpty()) {
            System.out.println(carPrices.poll());
        }

        //Let's do the same, though now using the PriorityQueue
        Queue<Integer> carPricesPQ = new PriorityQueue<>();
        carPricesPQ.offer(20000);
        carPricesPQ.offer(44500);
        carPricesPQ.offer(15000);
        carPricesPQ.offer(3800);
        carPricesPQ.offer(9755);

        System.out.println("\nPrices of the cars in the PriorityQueue : ");
        while (!carPricesPQ.isEmpty()) {
            System.out.println(carPricesPQ.poll());
        }

        //To get the elements in a reverse order, we need to use the reverseOrder() method from the Collections class
        Queue<Integer> carPricesPQReversed = new PriorityQueue<>(Collections.reverseOrder());
        carPricesPQReversed.offer(20000);
        carPricesPQReversed.offer(44500);
        carPricesPQReversed.offer(15000);
        carPricesPQReversed.offer(3800);
        carPricesPQReversed.offer(9755);

        System.out.println("\nPrices of the cars in the reversed PriorityQueue : ");
        while (!carPricesPQReversed.isEmpty()) {
            System.out.println(carPricesPQReversed.poll());
        }

        //For strings, it prints the elements out in the alphabetical order
        Queue<String> names = new PriorityQueue<>();
        names.offer("Jackson");
        names.offer("Alex");
        names.offer("Amy");
        names.offer("Laura");
        names.offer("Johnathon");

        System.out.println("\nNames of the people in the PriorityQueue : ");
        while (!names.isEmpty()) {
            System.out.println(names.poll());
        }

        //For a reversed order, we do the same as we did for the carPricesPQ;)
    }
}
