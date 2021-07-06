package Files;
import java.io.*;
import java.util.Arrays;

public class FileFolderCounter {
    static int counter=0;
    static int  directoryCounter=0;
    static  int[] arrayCounter = new int[2];


    public static int[] CountFolderFile(File file){
        if (file.isFile()){
            counter++;
        }else {
            directoryCounter++;
            File[] files=file.listFiles();
            for (File fileOne:files){
                CountFolderFile(fileOne);
            }
        }
        arrayCounter[0]=counter;
        arrayCounter[1]=directoryCounter;
        return arrayCounter;
    }

    public static String directoryValidation (String path) throws IOException {
        File root = new File(path);
        File[] list = root.listFiles();
        if (list == null)
            return path;
        for (File file : list){
            if (file.isDirectory()){
                directoryValidation(file.getAbsolutePath());
                System.out.println("Folder: " + file.getAbsoluteFile());
            }else {
                System.out.println("File: " + file.getAbsoluteFile());
            }
        }
        return Arrays.toString(list);
    }
}
