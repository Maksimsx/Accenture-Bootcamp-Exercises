package Exercises19.InputOutput;

import java.io.IOException;

public class IOMain {
    public static void main(String[] args) throws IOException {


        IOTasks ioTasks = new IOTasks();

        ioTasks.readFromDirectory();
        ioTasks.readFromDirectoryExtensions();
        ioTasks.checkIfPathNameExists();
        ioTasks.checkReadWritePermissions();
        ioTasks.checkIfDirectoryOrFile();
        ioTasks.compareLexicographically();
        ioTasks.lastModifiedTime();
        ioTasks.readInputFromJavaConsole();
        ioTasks.getFileSize();

    }


}
