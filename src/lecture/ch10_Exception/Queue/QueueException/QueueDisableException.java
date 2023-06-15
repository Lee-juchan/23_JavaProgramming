package lecture.ch10_Exception.Queue.QueueException;

public class QueueDisableException extends Exception {
    public QueueDisableException() {
        super("buffer is Disable");
    }
}
