package lecture.ch11_FileStream.App;

import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

// 문자 단위 스트림 FileReader (출력)
public class FileWriterTest {
    public static void writeFile(String filePath) {
        try(FileWriter fw = new FileWriter(filePath, StandardCharsets.UTF_8, false)) {
            String msg = null;

            // 유니코드표 출력
            for(int i=0; i<200; i++) {
                msg = String.format("[%d] : %c\n", i, (char) i);
                fw.write(msg);
            }

        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        writeFile("C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text/Unicode.txt");
    }
}
