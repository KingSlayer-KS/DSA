/*
Pre_order_traversal rules states that 
[x]first of all travel to ROOT 
[x]then to LEFT SUBTREE 
[x]and lastly to the RIGHT SUBTREE


this is a resurcive technique



Time Complexity=O(n)

*/

package Trees;

public class Pre_order_traversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index = -1;// for traversal

        public Node buildtree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }

            Node new_node = new Node(nodes[index]);
            new_node.left = buildtree(nodes);
            new_node.right = buildtree(nodes);

            return new_node;
        }

    }

    public static void preaorder_traversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preaorder_traversal(root.left);
        preaorder_traversal(root.right);

    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        preaorder_traversal(root);
    }

}
