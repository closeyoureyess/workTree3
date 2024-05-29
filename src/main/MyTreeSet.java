package main;

public class MyTreeSet implements MySet {
    private int counter;
    private Integer value;
    private StringBuilder stringBuilder = new StringBuilder();
    private StringBuilder stringBuilder2 = new StringBuilder();
    private SubTree peak;
    private SubTree newSubTreeL;
    private SubTree oldNewSubTreeL;
    private SubTree newSubTreeR;
    private SubTree oldNewSubTreeR;
    private SubTree subTree;

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


        /*subTree = new SubTree(value);
        if (peak == null) {
            peak = subTree;
            ++counter;
            System.out.println("Вершина " + peak.getValue());
        } else if (newSubTreeL == null & value < peak.getValue()) { //Первый элемент слева
            newSubTreeL = subTree;
            oldNewSubTreeL = newSubTreeL;
            peak.setLeft(newSubTreeL);
            stringBuilder.append(newSubTreeL);
            stringBuilder.append(", ");
            ++counter;
            System.out.println("Первый if " + counter + " Значение слева первое: " + oldNewSubTreeL.getValue());
        } else if (newSubTreeR == null & value > peak.getValue()) { // Первый элемент справа
            newSubTreeR = subTree;
            oldNewSubTreeR = newSubTreeR;
            peak.setRight(newSubTreeR);
            stringBuilder2.append(newSubTreeR);
            stringBuilder2.append(", ");
            ++counter;
            System.out.println("Второй if " + counter + " Значение справа первое: " + oldNewSubTreeR.getValue());
        } else if (value < peak.getValue()) { // Дальнейшие левые элементы
            logicLeftTreeElements(value);
            ++counter;
        } else { // Дальнейшие правые элементы
            System.out.println("Дальнейшие правые элементы");
            logicRightTreeElements(value);
            ++counter;
        }
        System.out.println("END, " + counter);*/

    }

    public SubTree getPeak() {
        return peak;
    }

    /*private void logicLeftTreeElements(Integer value) {
        System.out.println("Левые: " + counter + " Значение value: " + value);
        SubTree forCycle = peak;
        SubTree forCycle2 = peak;
        for (int i = 1; i <= counter; i++) {
            forCycle = forCycle.getLeft();
            System.out.println("Итерация цикла: " + i);
            if (forCycle != null) {
                forCycle2 = forCycle;
            }
            if (forCycle == null & value < Integer.valueOf(forCycle2.toString())) {
                System.out.println(forCycle2);
                newSubTreeL = subTree;
                oldNewSubTreeL.setLeft(newSubTreeL);
                oldNewSubTreeL = newSubTreeL;
                stringBuilder.append(newSubTreeL);
                stringBuilder.append(", ");
                System.out.println("If 1 в цикле ЛЕВОМ " + oldNewSubTreeL.getLeft());
                break;
            } else if (forCycle == null & value > Integer.valueOf(forCycle2.toString())) {
                System.out.println(forCycle2);
                newSubTreeL = subTree;
                oldNewSubTreeL.setRight(newSubTreeL);
                oldNewSubTreeL = newSubTreeL;
                stringBuilder.append(newSubTreeL);
                stringBuilder.append(", ");
                System.out.println("If 2 в цикле ЛЕВОМ " + oldNewSubTreeL.getValue());
                break;
            }
        }
        System.out.println("КОНЕЦ ЦИКЛА ЛЕВЫЙ");
    }*/

  /*  private void logicRightTreeElements(Integer value) {
        System.out.println("Правые: " + counter);
        SubTree forCycle = peak;
        SubTree forCycle2 = peak;
        for (int i = 1; i <= counter; i++) {
            forCycle = forCycle.getRight();
            System.out.println("Итерация цикла: " + i);
            if (forCycle != null) {
                forCycle2 = forCycle;
            }
            if (forCycle == null & value < Integer.valueOf(forCycle2.toString())) {
                newSubTreeR = subTree;
                oldNewSubTreeR.setLeft(newSubTreeR);
                oldNewSubTreeR = newSubTreeR;
                stringBuilder2.append(newSubTreeR);
                stringBuilder2.append(", ");
                System.out.println("If 1 в цикле ПРАВОМ " + oldNewSubTreeR.getValue());
                break;
            } else if (forCycle == null & value > Integer.valueOf(forCycle2.toString())) {
                newSubTreeR = subTree;
                oldNewSubTreeR.setRight(newSubTreeR);
                oldNewSubTreeR = newSubTreeR;
                stringBuilder2.append(newSubTreeR);
                stringBuilder2.append(", ");
                System.out.println("If 2 в цикле ПРАВОМ " + oldNewSubTreeR.getValue());
                break;
            }
        }
        System.out.println("КОНЕЦ ЦИКЛА ПРАВЫЙ");
    }*/

    public String toString() {
        stringBuilder.insert(0, peak + ", ");
        stringBuilder.append(stringBuilder2);
        stringBuilder.deleteCharAt(stringBuilder.length() - 2);
        return "" + stringBuilder;
    }
}
