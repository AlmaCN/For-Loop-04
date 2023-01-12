package it.develhope.exercise;

import java.util.Random;

/**
 * Ho creato la classe CustomNumber.
 */
public class CustomNumber {

    /**
     * Ho creato una variabile number di tipo int.
     */
    public int number;

    /**
     * Ho creato il costruttore il cui ho creato un numero casuale tra 1 e 12.
     */
    public CustomNumber(){
        Random random = new Random();
        int min = 1;
        int max = 12;
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        number = random_int;
    }

    /**
     * Ho creato il metodo getMultiplicationTable per il numero random da 12 a 1.
     */
    public void getMultiplicationTable(){
        int multiplication;
        for(int i = 12; i >= 1; i--){
            System.out.println(multiplication = number * i);
        }
    }
}
