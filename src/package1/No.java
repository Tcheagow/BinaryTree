package package1;

public class No {
    private char key;
    private No left;
    private No right;

    public No(char key) {
        this.setKey(key);
    }

    public char getKey() {
        return key;
    }

    public void setKey(char key) {
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
