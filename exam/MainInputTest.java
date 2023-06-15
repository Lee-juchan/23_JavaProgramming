package exam;

// main함수에 전달된 인자 사용
public class MainInputTest {
    public static void main(String[] args) {
        int sum = 0;

        for(int i=0; i<args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }

        System.out.printf("sum : %d\n", sum);
    }
}