package week16;


public class ArrayQueue {
    int front,back;
    Object[] array;
    public static final int MAX=100;

    int size = back;

    public ArrayQueue(){
        front=0;
        back=0;
        array = new Object[MAX];
    }

    public Object head() {
        return array[front];
    }

    public Object tail() {
        return array[back-1];
    }

    public void leave(){
        front++;
        if(front==MAX) {
            front=0;
        }
        size = back -1;
    }


    public void join(Object obj){
        array[back++]=obj;
        if(back==MAX) {
            back=0;
        }
        size = back;
    }

    public boolean isEmpty(){
        return front==back;
    }

    public int size(){
        return size;
    }
}

