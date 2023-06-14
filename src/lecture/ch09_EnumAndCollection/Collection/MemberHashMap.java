package lecture.ch09_EnumAndCollection.Collection;

import java.util.HashMap;

public class MemberHashMap {
    private HashMap<Integer, Member> memberMap;

    public MemberHashMap() {
        memberMap = new HashMap<>();
    }

    // member 추가
    public void addMember(int id, Member member) {
        if(!memberMap.containsKey(id)) { // 중복 키 방지
            memberMap.put(id, member);
        }
    }

    // member 삭제
    public boolean removeMember(int id) {
        if(memberMap.containsKey(id)) {
            memberMap.remove(id);
            return true;
        }
        return false;
    }

    // memberList 출력
    public void showMember() {
        System.out.println("------------------------");

        for(Member member : memberMap.values()) { // value를 collection으로 반환
            System.out.println(member.toString());
        }

        System.out.println("------------------------");
    }
}
