package tests;

import main.MyTreeSet;
import main.SubTree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTreeSetTest {

    MyTreeSet myTreeSet = new MyTreeSet();
    SubTree subTree;

    @Test
    public void testAdd() {

        //1
        myTreeSet.add(30);
        subTree = myTreeSet.getPeak();
        Assertions.assertEquals(30, subTree.getValue());

        //2 -
        myTreeSet.add(15);
        Assertions.assertEquals(15, Integer.valueOf(String.valueOf(subTree.getLeft())));

        //3
        myTreeSet.add(35);
        Assertions.assertEquals(35, Integer.valueOf(String.valueOf(subTree.getRight())));

        //4 L - L
        myTreeSet.add(14);
        subTree = myTreeSet.getPeak();
        Assertions.assertEquals(14, Integer.valueOf(String.valueOf(subTree.getLeft().getLeft())));

        //6 L - R
        myTreeSet.add(16);
        subTree = myTreeSet.getPeak();
        subTree = subTree.getLeft().getRight();
        Assertions.assertEquals(16, Integer.valueOf(String.valueOf(subTree)));

        //5 R - L
        myTreeSet.add(34);
        subTree = myTreeSet.getPeak();
        subTree = subTree.getRight().getLeft();
        Assertions.assertEquals(34, Integer.valueOf(String.valueOf(subTree)));

        myTreeSet.add(40);
        Assertions.assertEquals(40, Integer.valueOf(String.valueOf(subTree.getRight().getRight())));

    }

}