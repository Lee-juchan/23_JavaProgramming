package lecture.ch10_Exception.App;

import java.util.Scanner;
import java.util.InputMismatchException;

// try-catch-finally 사용
public class ScannerExceptionDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        System.out.printf("input num : ");

        try {
            num = input.nextInt();
            System.out.printf("num : %d\n", num);
            
        } catch(InputMismatchException e) {
            System.out.println("catch " + e);
        } finally {
            // close
            if(input != null) {
                System.out.println("finally close");
                input.close();
            }
        }
    }
}
