package com.example;

import java.util.ArrayList;
import java.util.List;

public class AndrewTree {

    private Node tree;

    private class Node {
        int num;
        Node left;
        Node right;
        char side;

        Node(int num, char side) {
            this.num = num;
            this.side = side;
        }

        private void print() {
            printTree("", true);
        }

        private void printTree(String prefix, boolean isTail) {
            System.out.println(prefix + (isTail ? "╰── " : "|── ") + num + side);
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

    public void insert(int num) {
        tree = insert(tree, num, 'm');
    }

    private Node insert(Node node, int num, char side) {
        if (node == null)
            return new Node(num, side);

        if (num > node.num) {
            node.right = insert(node.right, num, 'r');
        } else if (num < node.num) {
            node.left = insert(node.left, num, 'l');
        } else {
            System.out.println("duplicate num found");
            return null;
        }

        return node;
    }

    public void print() {
        tree.print();
    }
}
