package Exercises18;

public class Main {
    public static void main(String[] args) {

        MultiplicationTable mt = new MultiplicationTable();
        ArbitaryNumbers an = new ArbitaryNumbers();
        BankAccount ba = new BankAccount(1000);
        Vehicle vh = new Vehicle();
        Opel opelCar = new Opel();

        mt.arrayCaluclator();
        //an.arbitaryArray();

        /*ba.deposit(8700);
        ba.withdraw(1500);
        ba.printBalance();
        ba.moneyTransfer(1300);
*/

        //opelCar.changingGears();


    }
}
