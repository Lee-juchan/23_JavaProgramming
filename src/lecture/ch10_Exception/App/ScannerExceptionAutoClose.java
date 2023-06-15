package lecture.ch10_Exception.App;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class ScannerExceptionAutoClose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = -1;
        
        System.out.printf("input num : ");

        try (input) { // 자동으로 close() 호출
            num = input.nextInt();
            System.out.printf("num : %d\n", num);

        // 다중 예외처리 (순서 중요)
        } catch(InputMismatchException e) {
            System.out.println(e);
        } catch (IllegalStateException | NoSuchElementException e) { // union type
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
