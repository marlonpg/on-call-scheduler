package com.gambasoftware.oncallscheduler.application.models;

public class LinkedNode<T> {
    private Node<T> first;
    private Node<T> last;

    public void add(T object) {
        if (first == null) {
            first = new Node<>(object);
            last = first;
        } else {
            Node<T> nextNode = new Node<>(object);
            nextNode.setPrevious(last);
            last.setNext(nextNode);
            last = nextNode;
        }
    }

    public Node<T> getByObject(Object expectedObject) {
        return getByNode(first, expectedObject);
    }

    public Node<T> getFirst() {
        return first;
    }

    public Node<T> getLast() {
        return last;
    }

    public Node<T> getByNode(Node node, Object expectedObject) {
        if (node.getObject().equals(expectedObject)) {
            return node;
        }
        return getByNode(node.getNext(), expectedObject);
    }
}
