package org.example.queue;

public class QNode {
    int value;
    QNode next;

    public QNode(int value, QNode next) {
        this.value = value;
        this.next = next;
    }
}
