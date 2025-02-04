import java.util.Stack;
public class Stacking {
    public static void main(String args []){
        Stack <Integer> stack = new Stack <> ();
        // Push elements
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(22);
        stack.push(12);
        stack.push(56);
        System.out.println(stack);
        //Pop elements
        System.out.println("Popped: " + stack.pop());
        System.out.println(stack);
        //Peek element
        System.out.println("Top Element: " + stack.peek());
        //Last element
        System.out.println("Last Element: " + stack.getLast());
        //isEmpty
        System.out.println("Checking for empty stack: " + stack.isEmpty());
    }
}