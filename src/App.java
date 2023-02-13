import package1.*;

public class App {
    public static void main(String[] args) throws Exception {
        BinarySearchTree binarySearchTree = new BinarySearchTree(10);
        
        binarySearchTree.insert(20);
        binarySearchTree.insert(5);
        binarySearchTree.insert(2);
        binarySearchTree.insert(15);
        binarySearchTree.insert(200);
        binarySearchTree.insert(1);

        binarySearchTree.inOrder(binarySearchTree.getRoot());
    }
}
