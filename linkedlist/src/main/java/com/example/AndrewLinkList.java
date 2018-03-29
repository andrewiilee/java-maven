package com.example;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class AndrewLinkList<T> implements List<T> {

    private Node<T> first;
    private Node<T> last;

    private static class Node<T> {
        T item;
        Node<T> next;

        Node(T element) {
            this.item = element;
        }
    }

    private void addNode(T item) {
        Node<T> newNode = new Node<>(item);

        if (first == null) {
            System.out.println("add first node: " + newNode.item);
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
            System.out.println("adding node: " + newNode.item);
        }
    }

    private Node<T> getNodeByIndex(int index) {
        //TODO check if index out of bound
        Node<T> indexNode = first;
        for (int i = 0; i < index; i++)
            indexNode = indexNode.next;
        return indexNode;
    }

    private void removeNode(Object o) {
        Node<T> indexNode = first;
        Node<T> nextNode;

        //check head
        if (indexNode.item.equals(o)) {
            first = indexNode.next;
            System.out.println("removing first node");
        }

        while (indexNode.next != null) {
            nextNode = indexNode.next;
            //check middle
            if (nextNode.item.equals(o) && nextNode.next != null) {
                indexNode.next = nextNode.next;
                System.out.println("removing node and connect");
                indexNode = indexNode.next;
            //check last
            } else if (nextNode.item.equals(o)) {
                indexNode.next = null;
                System.out.println("removing last node");
            } else
                indexNode = indexNode.next;
        }

    }

    @Override
    public String toString() {
        Node<T> indexNode = first;
        StringBuilder result = new StringBuilder();
        if (indexNode == null)
            return result.toString();
        else
            result.append(indexNode.item);

        while (indexNode.next != null) {
            indexNode = indexNode.next;
            result.append(", ");
            result.append(indexNode.item);
        }

        return result.toString();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        addNode(t);
        return true;
    }

    @Override
    public boolean remove(Object o) {
        removeNode(o);
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        return getNodeByIndex(index).item;
    }

    @Override
    public T set(int index, T element) {
        return null;
    }

    @Override
    public void add(int index, T element) {

    }

    @Override
    public T remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<T> listIterator() {
        return null;
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        return null;
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        return null;
    }

}
