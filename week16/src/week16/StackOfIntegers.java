package week16;

import java.util.*;

public class StackOfIntegers {

    public static int secondFromTop(Stack<Integer> s) {
        int first = s.pop();
        int second = s.pop();

        s.push(second);
        s.push(first);

        return second;
    }

    public static Stack<Integer> reverseStack(Stack<Integer> reversedStack) {
        Collections.reverse(reversedStack);
        return reversedStack;
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<Integer>();

        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        System.out.println("Complete Stack " + s);

        System.out.println("The second element from the top of the stack is: " + secondFromTop(s));

        System.out.println("Reversed Stack " + reverseStack(s));
    }

}
