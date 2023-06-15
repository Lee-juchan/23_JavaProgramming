package lecture.ch10_Exception.AutoClose;

import java.io.Closeable;
import java.io.IOException;

public class AutoCloseObj implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("close");
    }
}
