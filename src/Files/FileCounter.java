package Files;


import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.NotDirectoryException;
import java.nio.file.Path;

public class FileCounter {
    private static final File DIRECTORY = new File("C:\\Users\\ilya.kavalenka\\Documents\\Test documents");
    static int counter=0;
    static int  directoryCounter=0;
    static  int[] arrayCounter = new int[2];
    public static int[] testCounterFile(File file){
        if (file.isFile()){
            counter++;
        }else {
            directoryCounter++;
            File[] files=file.listFiles();
            for (File fileOne:files){
                testCounterFile(fileOne);
            }
        }
        arrayCounter[0]=counter;
        arrayCounter[1]=directoryCounter;
        return arrayCounter;
    }

    public static void directoryValidation (String directory){
        if (DIRECTORY.isDirectory()){
            for (File file: DIRECTORY.listFiles()){
                if (file.isDirectory()){
                    System.out.println("Folder: " + file.getName());
                }else {
                    System.out.println("File: " + file.getName());
                }
            }
        }
    }
    public static int countForFolderAndFile(Path directory) throws IOException, NotDirectoryException {
        int count =0;
        if (Files.isDirectory(directory)){
            try (DirectoryStream<Path> files = Files.newDirectoryStream(directory)){
                for (Path file: files){
                    if (Files.isRegularFile(file)||Files.isSymbolicLink(file)){
                        count++;
                    }
                }
            }
        }else
            throw new NotDirectoryException(directory + " wrong directory");
        return count;
    }

}
