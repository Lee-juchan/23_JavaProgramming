package lecture.ch10_Exception.UserDefinedException;

// 사용자 정의 예외
public class IDFormatException extends Exception {
    public IDFormatException(String message) {
        super(message);
    }
}