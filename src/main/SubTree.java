package main;

public class SubTree {
    private Integer value;
    private SubTree left;
    private SubTree right;

    public SubTree(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public SubTree getLeft() {
        return left;
    }

    public void setLeft(SubTree left) {
        this.left = left;
    }

    public SubTree getRight() {
        return right;
    }

    public void setRight(SubTree right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "" + value;
    }
}
