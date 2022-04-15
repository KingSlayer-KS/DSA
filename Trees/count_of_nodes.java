/*
Time Complexity=O(n)
*/

package Trees;

public class count_of_nodes {
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

    public static int countOfNodes(Node root) {
        if(root == null) {
            return 0;
        }
  
        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);
        return leftNodes + rightNodes + 1;
    }
 
    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        System.out.println(countOfNodes(root));
    }

}
