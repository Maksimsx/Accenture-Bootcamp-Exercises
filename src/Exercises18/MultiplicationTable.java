package Exercises18;

public class MultiplicationTable {
    public static void arrayCaluclator(){

        String[][] values = new String[10][10];

        for(int i = 1; i<10; i++){
            for(int j = 1; j <10; j++){
                System.out.println(values[i][j] = (i+1)+" * " + (j+1)+" = " + ((i+1)*(j+1)));
            }
        }
    }
}