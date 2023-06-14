package lecture.ch09_EnumAndCollection.Collection;

import java.util.ArrayList;

public class MemberArrayList {
    private ArrayList<Member> memberList;

    public MemberArrayList() {
        memberList = new ArrayList<>();
    }

    // member 추가
    public void addMember(Member member) {
        memberList.add(member);
    }

    // member 삭제
    public boolean removeMember(int id) {
        for(Member member : memberList) { // value 찾아서 제거
            if(member.getId() == id) {
                memberList.remove(member);
                return true;
            }
        }
        // for(int i=0; i<memberList.size(); i++) { // key 찾아서 제거 (_prof)
        //     Member member = memberList.get(i);
        //     if(member.getId() == id) {
        //         memberList.remove(i);
        //         return true;
        //     }
        // }
        return false;
    }

    // memberList 출력
    public void showMember() {
        System.out.println("------------------------");

        for(Member member : memberList) {
            System.out.println(member.toString());
        }

        System.out.println("------------------------");
    }
}
