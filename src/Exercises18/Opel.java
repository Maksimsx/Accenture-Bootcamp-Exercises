package Exercises18;

public class Opel extends Car{

    int opelGears = 5;
    int gear = 1;

    public void changingGears(){
        for(int i = 0; i < opelGears; i++){
            System.out.println(gear + " gear is switched on...");
            gear++;
            carAccelarating();
            carSteering();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

        }
    }
}
