package main;

public class MyTreeSet implements MySet {
    private int counter;
    private Integer value;
    private SubTree peak;

    @Override
    public void add(Integer value) {
        if (peak == null) {
            peak = new SubTree(value);
            ++counter;
            return;
        }
        SubTree node = getPeak();
        while (node != null) {
            if (value < node.getValue()) {
                if (node.getLeft() == null) {
                    node.setLeft(new SubTree(value));
                    break;
                }
                node = node.getLeft();
            } else if (value > node.getValue()) {
                if (node.getRight() == null) {
                    node.setRight(new SubTree(value));
                    break;
                }
                node = node.getRight();
            }
        }
    }

    public SubTree getPeak() {
        return peak;
    }
}
