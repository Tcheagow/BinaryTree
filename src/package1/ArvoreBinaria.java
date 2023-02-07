package package1;

public class ArvoreBinaria {
    private No root;

    public ArvoreBinaria(int key) {
        this.root = new No(key);
    }
    
    public void inOrder(No root) {
        if(root.getLeft() != null) {
            inOrder(root.getLeft());
        }
        System.out.println(root.getKey());
        if(root.getRight() != null) {
            inOrder(root.getRight());
        }
    }

    public void postorder_traversal(No root) {
        if(root.getLeft() != null) {
            postorder_traversal(root.getLeft());
        }
        if(root.getRight() != null) {
            postorder_traversal(root.getRight());
        }
        System.out.println(root.getKey());
    }

    public int calculateHeight(No root) {
        int heightLeft = 0;
        int heightRight = 0;
        
        if(root.getLeft() != null) {
            heightLeft = calculateHeight(root.getLeft()); 
        }
        if(root.getRight() != null) {
            heightRight = calculateHeight(root.getRight());
        }
        if(heightRight > heightLeft) {
            return heightRight + 1;
        }
        return heightLeft+1;
    }

    public No getRoot() {
        return root;
    }
}
