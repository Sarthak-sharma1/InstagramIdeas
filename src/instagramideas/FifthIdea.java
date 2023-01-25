package instagramideas;

import java.util.Stack;

public class FifthIdea {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(15);
        stack.pop();
        stack.push(30);
        stack.push(20);
        stack.pop();
        stack.push(5);
        System.out.println(stack);
    }
}
