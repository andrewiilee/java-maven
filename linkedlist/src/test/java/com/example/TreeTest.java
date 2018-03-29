package com.example;

import org.junit.jupiter.api.Test;

public class TreeTest {

    @Test
    void binary_tree_test() {

        AndrewTree tree = new AndrewTree();

        tree.insert(50);
        tree.insert(100);
        tree.insert(25);
        tree.insert(30);
        tree.insert(10);
        tree.insert(200);
        tree.insert(500);
        tree.print();
    }
}
