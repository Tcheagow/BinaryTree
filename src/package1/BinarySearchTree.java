package package1;

public class BinarySearchTree extends ArvoreBinaria {
    
    public BinarySearchTree(int key) {
        super(key);
    }

    public void insert(int key) {
        No aux = this.getRoot();
        No parent = null;

        while(aux != null) {
            parent = aux;
            if(key < aux.getKey()) {
                aux = aux.getLeft();
            } else if (key > aux.getKey()) {
                aux = aux.getRight();
            }
        }

        if(key < parent.getKey()) {
            No newNode = new No(key);
            parent.setLeft(newNode);
        }
        else if(key > parent.getKey()) {
            No newNode = new No(key);
            parent.setRight(newNode);
        }
    }
}
