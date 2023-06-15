package lecture.ch11_FileStream.App;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;

// 문자 단위 스트림 FileReader (입력)
public class FileReaderText {
    public static void readFile(String filePath) {
        try (FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8)) { // 인코딩 방식 명시
            System.out.println("start -------------");
            
            int ch;
            while((ch = fr.read()) != -1) {
                System.out.printf("[%c]\n", (char) ch);
            }

            System.out.println("end ---------------");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        readFile("C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text/ENG.txt");
        readFile("C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text/KOR.txt");
    }
}
