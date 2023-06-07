public class Stack {
    public static void main(String[] args) {

        /**
         Stack : a LIFO "Last-In First-out" data structure
         it stores object in a sorta vertical tower, uses the push() method to add objects to the top, and pop() to remove them

         EX. to access the first element "the one in the bottom of the stack" we will need to pop() all the elements above the
         first element to get it!

         Stack methods :
         push()
         pop()
         peek()
         empty()
         search(Object o)
         */

        java.util.Stack<String> cars = new java.util.Stack<>();

        System.out.println("The stack is empty : "+cars.empty());

        cars.push("Audi");
        cars.push("Ferrari");
        cars.push("Bugatti");
        cars.push("Porsche");

        System.out.println(cars);

        //The pop() always remove the top element
        cars.pop();
        System.out.println(cars);

        //The pop() method also return the top object, so we can assign it to something
        String car = cars.pop(); //we are supposed to get Bugatti here
        System.out.println("\nTop car type : "+car);
        System.out.println(cars);

        //To get the top item without actually removing it from the stack we use the peek() method
        cars.push("Bugatti");
        cars.push("Porsche");
        System.out.println("\n"+cars);
        System.out.println("Top car type : "+cars.peek());

        /**
         Stack starts counting from the top element "The last element we pushed", and that element has the index of 1, instead of 0
         EX. the following code example ->
         */
        System.out.println("Index of Bugatti : "+cars.search("Bugatti"));

        /**
         And if the objected aint included in the stack, when searching for it, it will return the index of -1
         Ex. ->
         */
        System.out.println("Index of Mazda : "+cars.search("Mazda"));

        /**
         Stack can run outta memory, giving the OutOfMemoryError due to the java heap space
         Ex. ->
         */
        for (int i = 0; i < 1000000000; i++) {
            cars.push("Mazda");
        }

    }
}
