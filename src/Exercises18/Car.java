package Exercises18;

import java.util.Random;

public class Car extends Vehicle{


    String [] arr = {"Car is driving forward", "Car is turning left", "Car is turning right"};
    Random random = new Random();

    int pace = 10;
    public void carAccelarating(){
        System.out.println("Car is speeding up! " + pace + "km/h");
        pace += 20;
    }

    public void carSteering(){

        int select = random.nextInt(arr.length);
        System.out.println(arr[select]);
    }


}
