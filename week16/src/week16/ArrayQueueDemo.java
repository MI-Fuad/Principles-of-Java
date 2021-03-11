package week16;


public class ArrayQueueDemo {

    public static void main(String[] args) {

        ArrayQueue q = new ArrayQueue();

        q.join(0);
        q.join(1);
        q.join(2);
        q.join(3);
        q.join(4);

        System.out.println("Head: " + q.head());
        System.out.println("Tail: " + q.tail());
        System.out.println("Size = " + q.size());

        q.leave();

        System.out.println();
        System.out.println("Head: " + q.head());
        System.out.println("Tail: " + q.tail());
        System.out.println("Size = " + q.size());

        System.out.println("empty? " + q.isEmpty());
    }

}
