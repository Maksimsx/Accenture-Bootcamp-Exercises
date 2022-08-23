package Exercises23;

import Exercises19.InputOutput.IOTasks;

public class ExceptionsTasks {


    public void exercises(){

        try {
            int myInt = Integer.parseInt("1");
        }catch (NumberFormatException nfe){
            System.out.println("Should be numbers");
        }

    }


}
