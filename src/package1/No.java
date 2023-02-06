package package1;

public class No {
    private int key;
    private No left;
    private No right;

    public No(int key) {
        this.setKey(key);
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public No getLeft() {
        return left;
    }

    public void setLeft(No left) {
        this.left = left;
    }
    
    public No getRight() {
        return right;
    }
    
    public void setRight(No right) {
        this.right = right;
    }
}
