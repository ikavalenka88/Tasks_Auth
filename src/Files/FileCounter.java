package Files;


import java.io.File;

public class FileCounter {
    private static final File DIRECTORY = new File("C:\\Users\\ilya.kavalenka\\Documents\\Test documents");
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
}
