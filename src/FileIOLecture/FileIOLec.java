package FileIOLecture;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileIOLec {

    public void readFileAndOutput (Path pathToFile) {
        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(pathToFile);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
//        Path path = Paths.get("src");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

//        Path path = Paths.get("src","FileIOLec.java");
//        System.out.println(path);
//        System.out.println(path.toAbsolutePath());

        Path toOurDataPlace = Paths.get("src/data");
//        System.out.println(toOurDataPlace);
        Path toOurDataFile = Paths.get(String.valueOf(toOurDataPlace), "data.txt");

//        Create directory
        try {
            if (Files.notExists(toOurDataPlace)) {
                Files.createDirectories(toOurDataPlace);
            }else {
                System.out.println("The " + toOurDataPlace + " directory already exists.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Create file
        try {
            if (Files.notExists(toOurDataFile)) {
                Files.createFile(toOurDataFile);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

//        Write to a file

        List<String> romanEmpresses = Arrays.asList("Livia", "Agrippina", "Messaline", "Julia Domna");


//        2 arguments for Files.write
//        The path to our file, the data we want to write
//        try {
//            Files.write(toOurDataFile, romanEmpresses);
//        }catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        Read from a file
//
////        Create a place to put information we read from the file
//        List<String> currentList = new ArrayList<>();
//
////        read the information from the file
//        try {
//            currentList = Files.readAllLines(toOurDataFile);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        loop through the array list and output each item
//        for (String line: currentList){
//            System.out.println(line);
//        }

        FileIOLec io = new FileIOLec();
//        io.readFileAndOutput(toOurDataFile);

//        Append a single item to our list

        try {
            Files.writeString(toOurDataFile, "Julia Maesa\n", StandardOpenOption.APPEND);
        }catch (IOException e) {
            e.printStackTrace();
        }

        io.readFileAndOutput(toOurDataFile);
//
////        Append a list to a list
//
//        List<String> lateRomanEmpress = new ArrayList<>();
//        lateRomanEmpress.add("Galla Placidia");
//        lateRomanEmpress.add("Theodora");
//        lateRomanEmpress.add("Licinia Eudoxia");
//
//        try {
//            Files.write(toOurDataFile, lateRomanEmpress, StandardOpenOption.APPEND);
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//
//        io.readFileAndOutput(toOurDataFile);

        List<String> currentList = new ArrayList<>();
        try {
            currentList = Files.readAllLines(toOurDataFile);
        }catch (IOException e){
            e.printStackTrace();
        }

        Iterator<String> listIterator = currentList.iterator();
        while (listIterator.hasNext()) {
            String empress = listIterator.next();
            if (empress.equals("Messaline")) {
                listIterator.remove();
            }
        }
        try {
            Files.write(toOurDataFile, currentList);
        }catch (IOException e){
            e.printStackTrace();
        }
        io.readFileAndOutput(toOurDataFile);

    }

}
