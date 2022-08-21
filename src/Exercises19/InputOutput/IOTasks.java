package Exercises19.InputOutput;

import java.io.*;
import java.util.Date;

public class IOTasks {

    public void readFromDirectory() {
        File directoryPath = new File("C:/Users/livma/Desktop/Programmesanas lietas");
        //List of all files and directories
        File filesList[] = directoryPath.listFiles();
        System.out.println("List of files and directories in the specified directory:");
        for (File file : filesList) {
            System.out.println("File name: " + file.getName());
            System.out.println("File path: " + file.getAbsolutePath());
            System.out.println("Size :" + file.getTotalSpace());
            System.out.println(" ");
        }
    }

    public void readFromDirectoryExtensions() {

    File file = new File("C:/Users/livma/Desktop/Programmesanas lietas");
    String[] list = file.list(new FilenameFilter() {
        @Override
        public boolean accept(File dir, String name) {
            if (name.toLowerCase().endsWith(".txt")) {
                return true;
            } else {
                return false;
            }
        }
    });
        for(String f:list){
        System.out.println(f);
        }
    }

    public void checkIfPathNameExists(){
        File file = new File("C:/Users/livma/Desktop/Programmesanas lietas/stiligs cover latter.txt");
        System.out.println(file.exists());
    }

    public void checkReadWritePermissions(){
        File file = new File("C:/Users/livma/Desktop/Programmesanas lietas/stiligs cover latter.txt");
        if(file.canWrite()) {
            System.out.println("File can write");
        } else{
            System.out.println("File can't write");
        }
        if (file.canRead()){
            System.out.println("File can read");
        }else{
            System.out.println("File can't read");
        }
    }

    public void checkIfDirectoryOrFile(){
        File file = new File("C:/Users/livma/Desktop/Programmesanas lietas/");
        if(file.isFile()){
            System.out.println("It's a file");
        }else{
            System.out.println("It's a directory");
        }
    }

    public void compareLexicographically(){
        File file = new File("C:/Users/livma/Desktop/Programmesanas lietas/stiligs cover latter.txt");
        File file2 = new File("C:/Users/livma/Desktop/Programmesanas lietas/doks.txt");

        if (file.compareTo(file2) == 0) {
            System.out.println("Both the paths are lexicographically equal");
        } else {
            System.out.println("Both the paths are lexicographically not equal");
        }
    }
    public void lastModifiedTime(){
        File file = new File("C:/Users/livma/Desktop/Programmesanas lietas/stiligs cover latter.txt");
        long lastModified = file.lastModified();
        Date date = new Date(lastModified);
        System.out.println(date);
    }

    public void readInputFromJavaConsole() throws IOException {
        BufferedReader R = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input your name: ");
        String name = R.readLine();
        System.out.println("Your name is: " + name);
    }

    public void getFileSize(){
        File file = new File("C:/Users/livma/Desktop/Programmesanas lietas/stiligs cover latter.txt");
        if(file.exists())
        {
            System.out.println(filesize_in_Bytes(file));
            System.out.println(filesize_in_kiloBytes(file));
            System.out.println(filesize_in_megaBytes(file));
        }
        else
            System.out.println("File doesn't exist");

    }

    private static String filesize_in_megaBytes(File file) {
        return (double) file.length()/(1024*1024)+" mb";
    }

    private static String filesize_in_kiloBytes(File file) {
        return (double) file.length()/1024+"  kb";
    }

    private static String filesize_in_Bytes(File file) {
        return file.length()+" bytes";

    }

}


