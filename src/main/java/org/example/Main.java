package org.example;

import org.example.model.AppleTree;
import org.example.model.Pine;
import org.example.model.Tree;

public class Main {
    public static void main(String[] args) {
        Tree pine1 = new Pine(15, 4, 100000);
        System.out.println(pine1);
        pine1.grow();
        System.out.println(pine1);
        Tree appleTree = new AppleTree(11, 3, 12000);
        System.out.println(appleTree);
        appleTree.grow();
        System.out.println(appleTree);
    }
}