package DZ3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileHelper {
    private FileException fe;
    private Path path;

    public FileHelper(String path) {
        this.path = Paths.get(path);
    }

    public String readLine() throws FileException {
        try {
            return Files.readString(path);
        } catch (NoSuchFileException e) {
            throw new FileException("Файл не найден");
        } catch (IOException e) {
            throw new FileException("Ошибка чтения из файла " + e.getMessage());
        }

    }

    public void writeLine(String line) throws FileException {
        try {
            Files.write(path, line.getBytes(), StandardOpenOption.APPEND);
        } catch (NoSuchFileException e) {
            throw new FileException("Файл не найден");
        } catch (IOException e) {
            throw new FileException("Ошибка записи в файл " + e.getMessage());
        }

    }

}
