

import java.util.*;

public class LinkedListQueue {

    LinkedList<Integer> LLQueue = new LinkedList<Integer>();

    public void enqueue(int nodeInfo) {
        LLQueue.addLast(nodeInfo);
    }

    public int dequeue() {
        int first = LLQueue.getFirst();
        if(!LLQueue.isEmpty()) {
            LLQueue.removeFirst();
        }
        return first;
    }

    public void isEmpty() {
        if(LLQueue.isEmpty()) {
            System.out.println("List is empty");
        }else {
            System.err.println("List is not empty");
        }
    }

    public void showQueue() {
        int queueCounter = 0;
        int queueSize = LLQueue.size();

        while(queueCounter != queueSize) {
            System.out.println(LLQueue.get(queueCounter));
            queueCounter++;
        }


    }


    public static void main(String[] args) {
        LinkedListQueue LLQTest = new LinkedListQueue();

        LLQTest.enqueue(1);
        LLQTest.enqueue(2);
        LLQTest.enqueue(3);
        LLQTest.enqueue(4);
        LLQTest.enqueue(5);

        LLQTest.showQueue();

        LLQTest.dequeue();

        System.out.println(" ");

        LLQTest.showQueue();

        LLQTest.isEmpty();

    }


}


