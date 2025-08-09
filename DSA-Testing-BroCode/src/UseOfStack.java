import java.util.Stack;

public class UseOfStack {
    public void useOfStack() {
        // Stack all operation
        Stack<String> stack = new Stack<String>();
        // LIFO Last-In-First-Out
        // use of push to add data into stack
        stack.push("Faysal");
        stack.push("ahmed");
        stack.push("shrabon");
        stack.push("russell");


        // check is the stack have data
        if (!stack.empty()) {
            //use of pop() method is to remove top data from stack
            //stack.pop();

            //use of search method is to find specific data position
            System.out.println(stack.search("Faysal"));

            //use this peek() method to see which item at the top stack
            System.out.println(stack.peek());
            System.out.println(stack.peek());

            System.out.print(stack);
        }else  {
            System.out.println("Stack is empty");
        }




    }



}
