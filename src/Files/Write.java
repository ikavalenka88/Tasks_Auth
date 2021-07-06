//package Files;
//import java.io.*;
//
//public class Write {
//    public static void writeInFile(File file,boolean append) throws IOException{
//       FileWriter result = new FileWriter("RESULT.txt",false);
//    }
//
////        FileWriter fileWriter = null;
////        try {
////            fileWriter = new FileWriter("RESULT.txt");
////            int element = 0;
////            while (true){
////                fileWriter.write(element);
////            }
////        }finally {
////            if (fileWriter !=null){
////                fileWriter.close();
////            }
////        }
////    }
////    static String path_for_file;
////    static boolean append = false;
////
////    public Write(String path){
////        path_for_file=path;
////    }
////    public Write(String path,boolean value){
////        path_for_file=path;
////        append=value;
////    }
////    public static void fileWriter(String text) throws IOException{
////        FileWriter writeToFile = new FileWriter(path_for_file,append);
////        PrintWriter printToFile = new PrintWriter(writeToFile);
////        printToFile.printf("%s" + "%n", text);
////        printToFile.close();
////    }
//}
