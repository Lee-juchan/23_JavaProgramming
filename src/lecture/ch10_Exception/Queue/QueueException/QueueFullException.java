package lecture.ch10_Exception.Queue.QueueException;

public class QueueFullException extends Exception {
    public QueueFullException() {
        super("buffer is Full");
    }
}