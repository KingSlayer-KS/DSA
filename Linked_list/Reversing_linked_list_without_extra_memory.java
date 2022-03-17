package Linked_list;

//scratch_implementation
public class Reversing_linked_list_without_extra_memory {
    Node head;
    private int size;

    Reversing_linked_list_without_extra_memory() {
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

    //reversing_last_iteratively
    public void reverse(){
        if (head==null||head.next==null){
            return;
        }
        

        Node prev = head;
        Node currentnode= head.next;
        while (currentnode!=null){
            Node nextnode=currentnode.next;
            currentnode.next=prev;

            //updation
            prev=currentnode;
            currentnode=nextnode;
        }//updating the first to null and last to head
        head.next=null;
        head=prev;

    }

    //recursively_reverse_linked_list
    public Node reverse_recursion(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newhead=reverse_recursion(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;

    }

    public static void main(String[] args) {
        Reversing_linked_list_without_extra_memory list = new Reversing_linked_list_without_extra_memory();
        list.add_first("is");
        list.add_first("name");
       
        list.add_first("The");
        list.add_last("sirjan");
        list.print();
        System.out.println(list.size());
       

       // list.reverse();
       // list.print();

        list.head=list.reverse_recursion(list.head);
        list.print();

    }

}
