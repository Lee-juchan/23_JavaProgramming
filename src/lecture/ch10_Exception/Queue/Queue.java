package lecture.ch10_Exception.Queue;

import lecture.ch10_Exception.Queue.QueueException.*;

public class Queue {
    private int[] buffer = null;
    private int queueSize = 10;
    private int front;
    private int rear;

    public Queue() {
        buffer = new int[queueSize];
        front = 0;
        rear = 0;
    }

    // 큐 상태 확인
    public boolean isFull() {
        return front == queueSize;
    }
    public boolean isEmpty() {
        return front == rear;
    }
    public boolean isDisable() {
        return (isFull() && isEmpty());
    }

    // 큐 삽입 (throw exception)
    public void enqueue(int item) throws QueueFullException, QueueDisableException{
        if (isFull()) {
            throw new QueueFullException();
        } else if(isDisable()) {
            throw new QueueDisableException();
        }
        
        buffer[rear++] = item;
    }

    // 큐 삭제 (throw exception)
    public int dequeue() throws QueueEmptyException, QueueDisableException {
        if (isEmpty()) {
            throw new QueueEmptyException();
        } else if(isDisable()) {
            throw new QueueDisableException();
        }

        return buffer[front++];
    }

    // 큐 출력
    public void printQueue() throws QueueEmptyException {
        if(isEmpty()) {
            throw new QueueEmptyException();
        }

        for (int i = front; i < rear; i++) {
            System.out.printf("%d ", buffer[i]);
        }
        System.out.println();
    }
}
