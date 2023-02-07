import package1.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria binaryTree = new ArvoreBinaria(1);
        No no2 = new No(2);
        No no3 = new No(3);
        No no4 = new No(4);
        No no5 = new No(5);
        No no6 = new No(6);
        No no7 = new No(7);
        No no8 = new No(8);
        No no9 = new No(9);

        binaryTree.getRoot().setLeft(no2);
        binaryTree.getRoot().setRight(no3);

        no3.setLeft(no4);
        no3.setRight(no5);

        no5.setLeft(no6);
        no5.setRight(no7);

        no6.setLeft(no8);
        no6.setRight(no9);

        binaryTree.inOrder(binaryTree.getRoot());
        binaryTree.postorder_traversal(binaryTree.getRoot());
        System.out.println(binaryTree.calculateHeight(binaryTree.getRoot()));
    }
}
