package lecture.ch11_FileStream.App;

import java.io.FileInputStream;

// 바이트 단위 스트림 FileInputStream
public class FileInputSteamTest {
    public static void readFile(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath)) { // try-with-resorce
            System.out.println("start -------------");
            
            int ch;
            while((ch = fis.read()) != -1) {
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
