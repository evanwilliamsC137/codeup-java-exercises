package FileIOLecture;
import java.io.IOException;
import java.nio.file.*;

public class FileIOLec {
    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path path = Paths.get("src","FileIOLec.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

        Path toOurDataPlace = Paths.get("src/data");
        System.out.println(toOurDataPlace);
        try {
            if (Files.notExists(toOurDataPlace)) {
                Files.createDirectories(toOurDataPlace);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
