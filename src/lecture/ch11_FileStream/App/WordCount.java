package lecture.ch11_FileStream.App;

import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

// 파일을 읽고 사용된 단어 + 사용된 횟수 출력
// StringBuilder, HashMap<단어, 횟수>
public class WordCount {
    public static void main(String[] args) {
        String filePath = "C:/workspace/java/23_Java_Programming/src/lecture/ch11_FileStream/Text/oldManAndTheSea.txt";
        HashMap<String, Integer> wordList = new HashMap<>(); // <단어, 횟수>
        StringBuilder temp = new StringBuilder(); // 단어 임시저장
        String word;

        // 단어 단위로 단어리스트에 저장
        try(FileReader fr = new FileReader(filePath, StandardCharsets.UTF_8)) {
            int ch;
            while((ch = fr.read()) != -1) {
                temp.append((char) ch); // StringBuilder에 추가
                
                // space 나오면 결과를 단어리스트에 저장하고 StringBuilder 초기화
                if(ch == '\s') {
                    word = temp.toString().toLowerCase().replaceAll("[^0-9a-z]", ""); // 특수문자 공백 치환

                    if(wordList.get(word) == null) { // 없으면 횟수 1로 저장
                        wordList.put(word, 1); 
                    } else {
                        wordList.put(word, wordList.get(word) + 1); // 있으면 횟수 +1 후에 저장
                    }

                    temp.setLength(0); // Stringbuilder 초기화
                }
            }
        } catch(Exception e) {
            System.out.println(e);
        }

        // 단어 리스트 출력
        for(Map.Entry<String, Integer> entry : wordList.entrySet()) { //Map.Entry / entrySet() 사용
            System.out.printf("%s : (%d)\n", entry.getKey(), entry.getValue());
        }
    }
}
