package lecture.ch10_Exception.AutoClose.App;

import lecture.ch10_Exception.AutoClose.AutoCloseObj;

public class AutoCloseExceptionDemo {
    public static void main(String[] args) {
        AutoCloseObj obj = new AutoCloseObj();

        try (obj) { // try()에 자원 입력
            // 끝나고 자동으로 close() 호출
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("exit");
    }
}
