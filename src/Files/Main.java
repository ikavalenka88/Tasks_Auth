package Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        int[] arrayCounter = FileCounter.testCounterFile(new File("C:\\Users\\ilya.kavalenka\\Documents\\Test documents"));
        System.out.println("The number of folder,number of files");
        System.out.println(Arrays.toString(arrayCounter));
//        FileCounter.directoryValidation("C:\\Users\\ilya.kavalenka\\Documents\\Test documents");//need use Scanner in progress
//        FileCounter.countForFolderAndFile(Path.of("C:\\Users\\ilya.kavalenka\\Documents\\Test documents"));
    }
}
