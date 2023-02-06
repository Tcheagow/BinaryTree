package package1;

public class ArvoreBinaria {
    private No root;

    public ArvoreBinaria(int key) {
        this.root = new No(key);
    }
    
    public void simetricTraversal(No root) {
        if(root.getLeft() != null) {
            simetricTraversal(root.getLeft());
        }
        System.out.println(root.getKey());
        if(root.getRight() != null) {
            simetricTraversal(root.getRight());
        }
    }

    public No getRoot() {
        return root;
    }
}
