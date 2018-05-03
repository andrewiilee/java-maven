package com.example;

import org.junit.jupiter.api.Test;

public class TreeTest {

    @Test
    void binary_tree_test() {
        System.out.println("==== not balanced ====");
        create_binary_tree(true).print();
        System.out.println("==== balanced ====");
        create_binary_tree(false).print();

        System.out.println("==== not balanced ====");
        create_second_tree(true).print();
        System.out.println("==== balanced ====");
        create_second_tree(false).print();
    }

    AndrewTree create_binary_tree(boolean value) {
        AndrewTree testTree = new AndrewTree(value);
        testTree.insert(10);
        testTree.insert(20);
        testTree.insert(30);

        return testTree;
    }

    AndrewTree create_second_tree(boolean value) {
        AndrewTree tree = new AndrewTree(value);
        tree.insert(50);
        tree.insert(100);
        tree.insert(25);
        tree.insert(30);
        tree.insert(300);
        tree.insert(400);
        tree.insert(500);
        return tree;
    }
}
