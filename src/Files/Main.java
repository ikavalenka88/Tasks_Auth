package Files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter result = new FileWriter("RESULT.txt",false);
        int[] arrayCounter = FileFolderCounter.CountFolderFile(new File("C:\\Users\\ilya.kavalenka\\Documents\\Test documents"));

        try {
            result.write("The number of files,number of folders");
            result.write(Arrays.toString(arrayCounter));
            result.write(String.format("%s %n",
                    (FileFolderCounter.directoryValidation("C:\\Users\\ilya.kavalenka\\Documents\\Test documents\\Clonable"))));
            result.flush();
            result.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
