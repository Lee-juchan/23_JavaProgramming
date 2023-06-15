package lecture.ch10_Exception.Queue.QueueException;

public class QueueEmptyException extends Exception {
    public QueueEmptyException() {
        super("buffer is Empty");
    }
}
