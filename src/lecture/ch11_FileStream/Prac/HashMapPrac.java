package lecture.ch11_FileStream.Prac;

import java.util.HashMap;

// HashMap 연습
public class HashMapPrac {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("a", 1);
        hm.put("a", 2); // 나중에 입력된 값으로 덮어씌워짐

        System.out.println(hm.get("a"));
    }
}
