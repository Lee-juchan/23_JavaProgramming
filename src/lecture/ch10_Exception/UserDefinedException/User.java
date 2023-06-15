package lecture.ch10_Exception.UserDefinedException;

public class User {
    private String userId;

    public void setUserId(String userId) throws IDFormatException {
        if(userId == null) {
            throw new IDFormatException("id can't be NULL");
        } else if(userId.length() < 4 || userId.length() > 20) {
            throw new IDFormatException("id range must be 8~20");
        }
        this.userId = userId;
    }

    public String getUserId() throws IDFormatException {
        if(userId == null) {
            throw new IDFormatException("id can't be NULL");
        }
        return userId;
    }
}
