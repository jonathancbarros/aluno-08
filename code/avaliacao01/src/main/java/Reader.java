import com.google.common.primitives.Bytes;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Reader {

    private int read_fi(FileInputStream in, byte[] buffer, int offset) throws IOException {
        int toRead = new Random().nextInt() % (buffer.length - offset) + 1;

        if (toRead < 0) {
            throw new IOException();
        }
        return in.read(buffer, 0, toRead);
    }

    /**
     * @param file - Um arquivo contendo qualquer tipo de conteúdo.
     * @return null caso o arquivo não exista ou não foi encontrado.
     */
    public byte[] readAll(File file) {
        int size = (int) file.length();
        byte[] data = new byte[0];
        byte[] buffer = new byte[size];

        FileInputStream inputStream;

        try {
            inputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            return null;
        }

        if(size == 0) {
            return data;
        }

        while (true) {

            int result;
            try {
                result = inputStream.read(buffer);
            } catch (IOException e) {
                result = 0;
            }

            if (result == -1) {
                break;
            }

            @SuppressWarnings("Since15") byte[] read = Arrays.copyOfRange(buffer, 0, result);
            data = Bytes.concat(data, read);
        }
        return data;
    }
}
