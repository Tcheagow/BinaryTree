import package1.*;

public class App {
    public static void main(String[] args) throws Exception {
        ArvoreBinaria binaryTree = new ArvoreBinaria('+');
        No no2 = new No('*');
        No no3 = new No('-');
        No no4 = new No('a');
        No no5 = new No('b');
        No no6 = new No('/');
        No no7 = new No('c');
        No no8 = new No('d');
        No no9 = new No('e');

        binaryTree.getRoot().setLeft(no4);
        binaryTree.getRoot().setRight(no2);

        no2.setLeft(no5);
        no2.setRight(no3);

        no3.setLeft(no6);
        no3.setRight(no9);

        no6.setLeft(no7);
        no6.setRight(no8);

        binaryTree.simetricTraversal(binaryTree.getRoot());
    }
}
