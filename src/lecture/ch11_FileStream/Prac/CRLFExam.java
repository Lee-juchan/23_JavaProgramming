package lecture.ch11_FileStream.Prac;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;

// \r, \n 개별 출력 (차이 확인)
public class CRLFExam {
    public static void main(String[] args) {
        String filePath = "C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text/oldManAndTheSea.txt";

        try(FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8)) {
            int ch;
            while((ch = fr.read()) != -1) {
                if(ch == '\s') {
                    System.out.println("\n>> Space");
                    continue;
                } else if(ch == '\r') {
                    System.out.println("\n>> Carriage return");
                    continue;
                } else if(ch == '\n') {
                    System.out.println("\n>> Line feed");
                    continue;
                } else {
                    System.out.print((char) ch);
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
