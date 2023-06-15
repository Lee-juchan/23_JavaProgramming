package lecture.ch11_FileStream.Prac;

// char 배열을 String으로 변환 (빈 요소(0)는 변환되지 않음)
public class CharToString {
    public static void main(String[] args) {
        char[] c = {'a', 'b', 0, 0};
        String s = new String(c);

        System.out.println(s + "|end");
    }
}
