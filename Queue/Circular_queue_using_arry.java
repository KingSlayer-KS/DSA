package Queue;

//fron tis the first elemnt of the queue
//rear is the last by default it is at -1 index in arrays
public class Circular_queue_using_arry {
    static class Queue {
        static int arr[];
         int size;
        static int rear = -1;
        static int front = -1;

        Queue(int  size) {
            this.size = size;
            arr = new int[size];
            
        }
 
        // mt or not
        public  Boolean is_mt() {
            return rear == -1 && front == -1;
        }

        //is full
        public  Boolean is_ful() {
            return (rear + 1)%size ==  front;
        }
        
        // adding
        public void add(int val) {
            if (is_ful()) {
                System.out.println("Is full");
                return;
            }
            if(front==-1){
                front=0;
                
            }
            rear=(rear+1)%size;// updating rear
            arr[rear] = val;// assigning value in arry at index (rear)

        }

        // deleting and returning
        public int remove() {
            if (is_mt()) {
                System.out.println("khali hai bro");
                return -1;
            }
            int res = arr[front];
            if(rear==front){
                rear=front=-1;
            }
            else{
                front=(front+1)%size;
            }
            return res;
        }

        // peek
        public  int peek() {
            if (is_mt()) {
                System.out.println("khali hai bro");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue(5);
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        System.out.println(qq.remove());
        qq.add(6);
        System.out.println(qq.remove());
        qq.add(7);
        while (!qq.is_mt()) {
            System.out.println( qq.peek());
            qq.remove();
        }

    }
}
