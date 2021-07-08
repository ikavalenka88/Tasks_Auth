package Files;
import java.io.*;

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

    public static StringBuilder directoryValidation (String path, int level) {
        File root = new File(path);
        File[] list = root.listFiles();
        StringBuilder result = new StringBuilder();
        if (list == null)
            return null;
        for (File file : list){
            if (file.isDirectory()){
                level++;
                for (int i = 0; i<level; i++) {
                    System.out.print("=");
                }
               System.out.println("Folder: " + file.getName());
                result.append("Folder: " + file.getName() +"\n");
                result.append(directoryValidation(file.getAbsolutePath(), level));
//                directoryValidation(file.getAbsolutePath(), level);
            }else {
                for (int i = 0; i<level; i++) {
                    System.out.print("-");
                }
                System.out.println("File: " + file.getName());
                result.append("File: " + file.getName() + "\n");
            }
        }
        return result;
    }
}
