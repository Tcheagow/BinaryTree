package package1;

public class ArvoreBinaria {
    private No root;

    public ArvoreBinaria(char key) {
        this.root = new No(key);
    }
    
    public void simetricTraversal(No root) {
        if(root.getLeft() != null) {
            System.out.print('(');
            simetricTraversal(root.getLeft());
        }
        System.out.print(root.getKey());
        System.out.print(' ');
        if(root.getRight() != null) {
            simetricTraversal(root.getRight());
            System.out.print(')');
        }
    }

    public No getRoot() {
        return root;
    }
}
