package newcode;

import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void printDiceArt(int value){
    String dice1="""
                    -------
                   |       |
                   |   •   |
                   |       |
                    -------

            """;
    String dice2="""
                    -------
                   | •     |
                   |       |
                   |     • |
                    -------

            """;
    String dice3="""
                    -------
                   | •     |
                   |   •   |
                   |     • |
                    -------

            """;
    String dice4="""
                    -------
                   | •   • |
                   |       |
                   | •   • |
                    -------

            """;
    String dice5="""
                    -------
                   | •   • |
                   |   •   |
                   | •   • |
                    -------

            """;
      String dice6="""
                    -------
                   | •   • |
                   | •   • |
                   | •   • |
                    -------

            """;
            switch(value){
                case 1-> System.out.println(dice1);
                case 2-> System.out.println(dice2);
                case 3-> System.out.println(dice3);
                case 4-> System.out.println(dice4);
                case 5-> System.out.println(dice5);
                case 6-> System.out.println(dice6);
                default -> System.out.println("Invalid");
            }
}
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        Random obj1 = new Random();

        int sumOfDice=0,rolledDice,valueOfDice;
        System.out.println("Enter the # of dice to roll:");
        rolledDice=obj.nextInt();
        if(rolledDice>0){
        for(int i=0;i<rolledDice;i++){
            valueOfDice=obj1.nextInt(1,7);
            System.out.println("*********************************");
            printDiceArt(valueOfDice);
            System.out.println("Dice Value:"+valueOfDice);
            System.out.println("*********************************");
            sumOfDice+=valueOfDice;
        }
    }
    else{
        System.out.println("# of dice must be greater than 0");
    }
        System.out.println("");
        System.out.println("Total Sum of Dice:"+sumOfDice);

        obj.close();
    }
}

