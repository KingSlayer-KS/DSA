package Queue;

//fron tis the first elemnt of the queue
//rear is the last by default it is at -1 index in arrays
public class Implementation_using_array {
    static class Queue {
        static int arr[];
         int size;
        static int rear = -1;

        Queue(int size) {
            arr = new int[size];
            this.size = size;
        }

        // mt or not
        public  Boolean is_mt() {
            return rear == -1;
        }

        // adding
        public  void add(int val) {
            if (rear == size - 1) {
                System.out.println("Is full");
                return;
            }
            rear++;// updating rear
            arr[rear] = val;// assigning value in arry at index (rear)

        }

        // deleting and returning
        public  int remove() {
            if (is_mt()) {
                System.out.println("khali hai bro");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];/* reassigning/shifting the vals */

            }
            rear--;
            return front;
        }

        // peek
        public  int peek() {
            if (is_mt()) {
                System.out.println("khali hai bro");
                return -1;
            }
            return arr[0];
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue(5);
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        while (!qq.is_mt()) {
            System.out.println( qq.peek());
            qq.remove();
        }

    }
}
