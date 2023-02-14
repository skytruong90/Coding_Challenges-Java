class Node {
    String data;
    Node left, right;
    
    public Node(String item) {
        data = item;
        left = right = null;
    }
}

public class ChallengeOne {
    Node root;
    
    public BinarySearchTree() {
        root = null;
    }
    
    public void insert(String data) {
        root = insertRecursive(root, data);
    }
    
    private Node insertRecursive(Node root, String data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        
        if (data.compareTo(root.data) < 0) {
            root.left = insertRecursive(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRecursive(root.right, data);
        }
        
        return root;
    }
    
    public void printInOrder() {
        printInOrderRecursive(root);
    }
    
    private void printInOrderRecursive(Node root) {
        if (root != null) {
            printInOrderRecursive(root.left);
            System.out.print(root.data + " ");
            printInOrderRecursive(root.right);
        }
    }
    
    public static void main(String[] args) {
        String[] input = {"apple", "banana", "cherry", "date", "elderberry", "fig", "grape"};
        
        BinarySearchTree bst = new BinarySearchTree();
        
        // insert each string into the binary search tree
        for (String s : input) {
            bst.insert(s);
        }
        
        // print the binary search tree in order
        bst.printInOrder();
    }
}

