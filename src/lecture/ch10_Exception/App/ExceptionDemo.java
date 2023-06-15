package lecture.ch10_Exception.App;

// try-catch문 사용
public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        try {
            arr[5] = 4;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}