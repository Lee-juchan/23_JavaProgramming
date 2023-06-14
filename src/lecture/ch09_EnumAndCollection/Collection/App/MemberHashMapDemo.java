package lecture.ch09_EnumAndCollection.Collection.App;

import lecture.ch09_EnumAndCollection.Collection.*;

public class MemberHashMapDemo {
    public static void main(String[] args) {
    MemberHashMap memberManagement = new MemberHashMap();

        Member m1 = new Member(1001, "이지원");
        Member m2 = new Member(1002, "손민국");
        Member m3 = new Member(1003, "박서원");

        memberManagement.addMember(m1.getId(), m1);
        memberManagement.addMember(m2.getId(), m2);
        memberManagement.addMember(m3.getId(), m3);
        memberManagement.showMember();
        
        memberManagement.removeMember(1002);
        memberManagement.showMember();
    }
}
