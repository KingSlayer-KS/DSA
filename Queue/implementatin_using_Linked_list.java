package Queue;

//fron tis the first elemnt of the queue
//rear is the last by default it is at -1 index in arrays
public class implementatin_using_Linked_list {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;

        }

    }

    static class Queue {
        static Node head = null;
        static Node tail = null;
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        // mt or not
        public  Boolean is_mt() {
            return head == null && tail == null;
        }

        // adding
        public  void add(int val) {
            Node newnode = new Node(val);
            if (tail == null) {
                head = tail = newnode;
            }

            tail.next = newnode;
            tail = newnode;

        }

        // deleting and returning
        public  int remove() {
            if (is_mt()) {
                System.out.println("khali hai bro");
                return -1;
            }

            int front = head.val;
            if (head == tail) {
                tail = null;
            }
            head = head.next;
            return front;
        }

        // peek
        public  int peek() {
            
            return head.val;
        }
    }

    public static void main(String[] args) {
        Queue qq = new Queue();
        qq.add(1);
        qq.add(2);
        qq.add(3);
        qq.add(4);
        qq.add(5);
        qq.remove();
       
        while (!qq.is_mt()) {
            System.out.println(qq.peek());
            qq.remove();
        }

    }
}
