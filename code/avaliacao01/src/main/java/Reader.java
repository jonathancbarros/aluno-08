import java.io.*;
import java.util.Arrays;
import com.google.common.primitives.Bytes;

public class Reader {

    public byte[] readAll(File file) throws IOException {
        int size = (int) file.length();
        byte[] data = new byte[0];
        byte[] buffer = new byte[size];

        FileInputStream inputStream = new FileInputStream(file);

        while (true) {
            int result = inputStream.read(buffer);

            if (result == -1)
                break;

            @SuppressWarnings("Since15") byte[] read = Arrays.copyOfRange(buffer, 0, result);
            data = Bytes.concat(data, read);
        }
        return data;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Arrays.toString(new Reader().readAll(new File("src/test/resources/arquivo.txt"))));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
