import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Queues {
    public static void main(String[] args) {

        /**
         Queue : it's a FIFO "First-In First-Out" data structure, like a line of people at a cashier, the first to enter the line
         is the first to be served and the firs tto be out of the line..

         Adding and removing elements to/from a queue is called Enqueueing/Dequeueing and it depends on the programming lannguage
         used, Fe. in java we use the method offer() to add and element to the tail of the queue, and the poll() method to remove
         an element from the head, and the peek() method to get the head of the queue without removing it!
         */

        Queue<String> cars = new LinkedList<>();
        /**
         We used new LinkedList<>() and not new Queue<>() cuz the Queue is actually an interface, thus we can't create an instance
         of it, therefore we need to use the classes that implement the Queue interface, which are ->
         ->
            1- The LinkedList class
            2- The PriorityQueue class

         */

        cars.offer("Audi");
        cars.offer("Ferrari");
        cars.offer("Bugatti");
        cars.offer("Porsche");

        System.out.println("Cars in the line : "+cars);

        System.out.println("The car of the type ["+cars.poll()+"] has been served, and it's out of the line!");

        System.out.println("Cars remaining in the line : "+cars);

        System.out.println("\nThe car of the type ["+cars.peek()+"] has been served, though still in the line!");
        System.out.println("Cars remaining in the line : "+cars);

        /**
         As the Queue interface extends the Collections class it inherited its methods, among which are ->
            isEmpty()
            size()
            contains(Object o)
         etc..
         */

        System.out.println("\nThe line is empty : "+cars.isEmpty());
        System.out.println("The number of cars remaining in the line : "+cars.size());
        System.out.println("Does the line have a car of the type Ferrari : "+cars.contains("Ferrari"));
        System.out.println("Does the line have a car of the type Mazda : "+cars.contains("Mazda"));


        /**
         Usage of the Queues ->

         1- Keyboard Buffer :
            Fe. pressing on the keyboard faster than the pc couldn't render onto the screen, thus the letters will be added to the buffer
            and be waiting in a sequence so they appear on the screen in the same order of the keyboard presses!

         2- Printer queues :
            Fe. printing pages which are supposed to be in order, first page, then the second one and so on!

         3- LinkedLists, PriorityQueues, and the Breadth-First Search algorithm

         */
    }
}
