package Linked_list;

//scratch_implementation
public class ll {
    Node head;
    private int size;

    ll() {
        this.size = 0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }

    // add_first->adding a element in the first position
    public void add_first(String data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    // add_last -> to the last element
    public void add_last(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last_node = head;

        while (last_node.next != null) {
            last_node = last_node.next;
        }
        last_node.next = newNode;

    }

    // printing each data from each node
    public void print() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node current_node = head;
        while (current_node != null) {
            System.out.print(current_node.data + " -> ");
            current_node = current_node.next;
        }
        System.out.println("NULL");
    }

    // remove_first
    public void del_first() {
        if (head == null) {
            System.out.println("List_is_MT");
        }
        
        head = head.next;
        size--;
    }

    // remove_last
    public void del_last() {
        if (head == null) {
            System.out.println("List_is_MT");
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        
        Node sec_last_node = head;
        Node last_node = head.next;
        while (last_node.next != null) {
            last_node = last_node.next;
            sec_last_node = sec_last_node.next;
        }
        sec_last_node.next = null;

    }

    //fetching_size
    public int size() {
        return size;
    }

    
    public static void main(String[] args) {
        ll list = new ll();
        list.add_first("is");
        list.add_first("name");
        list.print();
        System.out.println(list.size());

        list.add_first("The");
        list.add_last("sirjan");
        list.print();
        System.out.println(list.size());

        list.del_first();
        list.del_last();
        list.print();
        System.out.println(list.size());
        
        list.add_first("The");
        list.add_last("sirjan");
        list.print();
        System.out.println(list.size());

    }

}
