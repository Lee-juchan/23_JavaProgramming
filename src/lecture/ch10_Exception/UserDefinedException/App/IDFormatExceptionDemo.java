package lecture.ch10_Exception.UserDefinedException.App;

import lecture.ch10_Exception.UserDefinedException.IDFormatException;
import lecture.ch10_Exception.UserDefinedException.User;

public class IDFormatExceptionDemo {
    public static void main(String[] args) {
        String userId = "12345";
        User user1 = new User();

        // set 시도
        try {
            user1.setUserId(userId);
        } catch(IDFormatException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        // get 시도
        try {
            System.out.println(user1.getUserId());
        } catch(IDFormatException e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
