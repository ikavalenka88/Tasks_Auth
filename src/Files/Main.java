package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;


public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter result = new FileWriter("RESULT.txt",false);
        int[] arrayCounter = FileFolderCounter.CountFolderFile(new File("C:\\Users\\ilya.kavalenka\\Documents\\Test documents\\SMART"));
//        System.out.println("The number of folder,number of files");
//        System.out.println(Arrays.toString(arrayCounter));

        try {
            result.write("The number of files,number of folders");
            result.write(Arrays.toString(arrayCounter) +"\n");
            result.write((Objects.requireNonNull(FileFolderCounter.directoryValidation("C:\\Users\\ilya.kavalenka\\Documents\\Test documents\\SMART", 0)).toString()));
            result.flush();
            result.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
