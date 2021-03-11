
public class ArrayStackDemo {

    public static void main(String[] args) {

        ArrayStack s = new ArrayStack();

        s.push(0);
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println("Top: " + s.top());
        System.out.println("Size = " + s.size());
        System.out.println("Empty? " + s.isEmpty());
        s.pop();

        System.out.println();

        System.out.println("Top: " + s.top());
        System.out.println("Size = " + s.size());
    }

}
