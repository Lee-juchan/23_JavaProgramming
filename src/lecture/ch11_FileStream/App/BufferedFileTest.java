package lecture.ch11_FileStream.App;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.nio.charset.StandardCharsets;

public class BufferedFileTest {

    // Reader/Writer만 이용해서 파일 읽고 쓰기
    public static void simpleCopy(String fileDir) {
        try(FileReader fr = new FileReader(fileDir + "/oldManAndTheSea.txt", StandardCharsets.UTF_8);
            FileWriter fw = new FileWriter(fileDir + "/copy1.txt", StandardCharsets.UTF_8, false);
            ) {
                fw.write("FileReader/FileWriter\n\n");

                // 파일 읽고 다른 파일에 쓰기
                int ch;
                while((ch = fr.read()) != -1) {
                    fw.write((char) ch);
                }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    // BufferedReader/Writer 이용해서 파일 읽고 쓰기
    public static void bufferedCopy(String fileDir) {
        try(FileReader fr = new FileReader(fileDir + "/oldManAndTheSea.txt", StandardCharsets.UTF_8);
            FileWriter fw = new FileWriter(fileDir + "/copy2.txt", StandardCharsets.UTF_8, false);
            BufferedReader br = new BufferedReader(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            ) {
                bw.write("bufferedReader/Writer\n\n");

                // 파일 읽고 다른 파일에 쓰기
                int ch;
                while((ch = br.read()) != -1) {
                    bw.write((char) ch);
                }
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        long start;
        long end;

        // Reader/Writer 시간 측정
        start = System.currentTimeMillis();
        bufferedCopy("C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text");
        end = System.currentTimeMillis();
        System.out.printf("Reader/Writer : %d ms\n", (end-start));

        // BufferedReader/Writer 시간 측정
        start = System.currentTimeMillis();
        simpleCopy("C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text");
        end = System.currentTimeMillis();
        System.out.printf("BufferedReader/Writer : %d ms\n", (end-start));

    }
}