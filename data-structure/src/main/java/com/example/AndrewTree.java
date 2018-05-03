package com.example;

import java.util.ArrayList;
import java.util.List;

public class AndrewTree {

    private Node tree;
    private boolean preBalance;

    AndrewTree(boolean preBalance) {
        this.preBalance = preBalance;
    }

    class Node {
        int num;
        Node left;
        Node right;
        int height;

        Node(int num) {
            this.num = num;
            height = 1;
        }

        void print() {
            printTree("", true);
        }

        void printTree(String prefix, boolean isTail) {
            System.out.println(prefix + (isTail ? "╰── " : "|── ") + num + ":" + height);
            List<Node> list = new ArrayList<>();
            if (right != null)
                list.add(right);

            if (left != null)
                list.add(left);

            for (int i = 0; i < list.size() - 1; i++) {
                list.get(i).printTree(prefix + (isTail ? "    " : "|   "), false);
            }

            if (list.size() > 0) {
                list.get(list.size() - 1)
                        .printTree(prefix + (isTail ? "    " : "|   "), true);
            }
        }
    }

    void insert(int num) {
        tree = insert(tree, num);
    }

    Node insert(Node node, int num) {
        if (node == null)
            return new Node(num);

        if (num > node.num) {
            node.right = insert(node.right, num);
        } else if (num < node.num) {
            node.left = insert(node.left, num);
        } else {
            System.out.println("duplicate num found");
            return null;
        }

        node.height = 1 + max(height(node.left), height(node.right));

        if (preBalance)
            return node;

        int balance = getBalance(node);

        if (balance > 1 && num < node.left.num)
            return rightRotate(node);

        if (balance < -1 && num > node.right.num)
            return leftRotate(node);

        if (balance > 1 && num > node.left.num) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (balance < -1 && num < node.right.num) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    int height(Node node) {
        if (node == null)
            return 0;
        return node.height;
    }

    int max(int a, int b) {
        return (a > b ? a : b);
    }

    int getBalance(Node node) {
        if (node == null)
            return 0;
        return height(node.left) - height(node.right);
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return x;
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = max(height(x.left), height(x.right)) + 1;
        y.height = max(height(y.left), height(y.right)) + 1;
        return y;
    }

    void print() {
        tree.print();
    }
}
