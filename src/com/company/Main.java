package com.company;

import java.util.Scanner;

public class Main {
    public String rød = "\u001B[31m";
    public String fReset = "\u001B[0m";
    public String grøn = "\u001B[32m";
    public String blue = "\u001B[34m";
    public String yellow = "\u001B[33m";


    public void menue() {
        System.out.println("\nMENU");
        System.out.println(blue + "A) Caesar" + fReset);
        System.out.println(blue + "B) Vigenère" + fReset);
        System.out.println(blue + "C) Number" + fReset);
        Scanner userKey = new Scanner(System.in);
        String choose = userKey.next();
        if (choose.equals("A") || choose.equals("a")) {
            cesarMenu();
        } else {
            System.out.println(rød + "Under construction. Choose somthing else!" + fReset);
            menue();
        }
    }

            public void cesarMenu() {
            System.out.println(blue +"A) Dekrypt"+ fReset);
            System.out.println(blue +"B) Enkrypt"+ fReset);
            Scanner userKey = new Scanner(System.in);
            String choose = userKey.next();
            if (choose.equals("A") || choose.equals("a")) {
                runProgram();
            } else {
                System.out.println(rød + "Under construction. Choose somthing else!" + fReset);
                cesarMenu();
            }
        }

public void runProgram(){
    System.out.println("enter the tekst you whant to decrypt");
    int shiftValue = userShiftValue();
    String enkryptedSting =  stringToNom();
   enkryptedSting = String.valueOf(shift(shiftValue));

    System.out.println(enkryptedSting);


}



    public String stringToNom(){
        String fromUser = userInputTekst();
        String enkryptedString="";
        //int shiftValue=userShiftValue();
        char[] array = fromUser.toCharArray();
        for (char calculation : array) {
           int num = letterToNumber(calculation);
           enkryptedString+=num;
            //System.out.print(num);
           // int netLetterNumber= shift(num,shiftValue);
            //char letter = numberToLetter(netLetterNumber);

        }
        return enkryptedString;
    }
    public int stringToNom(int shiftValue){
    String shiftValueString = ""+ shiftValue;
        char[] array = shiftValueString.toCharArray();
        for (char calculation : array) {
            int num = letterToNumber(calculation);
            return num;
        }
        return 0;
    }




   // public String numToString(){
    //shift();
   // }
   // from numbers to letter


public int letterToNumber(char calculation) {
    char unicode =  calculation;
    int startPositionUniCode = 96;
    if (unicode <= 122 & unicode >= 97) {
        int forPrint = unicode - startPositionUniCode;
        //System.out.println(forPrint);
        return forPrint;
    }
    return 0;
}

//public char numberToLetter(int number){
  //  return '';
//}
    public int userShiftValue(){
        Scanner key = new Scanner(System.in);
        int userinput = key.nextInt();
        return userinput;
    }

public int shift(int numberFromLetter){
        int shift2 = stringToNom(numberFromLetter)+ userShiftValue();
    if (shift2>29){
        shift2= shift2-29;
        System.out.println(shift2);
        //return shift2;
        }
    return shift2;


}


    public String userInputTekst(){
        Scanner key = new Scanner(System.in);
        String newUserInput = key.nextLine();
        return newUserInput;
    }
/*
    public char[] orgAlfabet(){
        char[] alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','Æ','Ø','Å'};

        return alphabet;

    }

    public char[] comperaToOrgAlfa(char[] compere){
        compere = orgAlfabet();
        for (int i = 0; i < compere.length; i++);

        return compere;

    }


 */


    public void stringToChar(){

    }

    public void charTonNm(){

    }

    public void theShift(){

    }

    public void numToChar(){

    }

    public void charToStrin(){

    }




    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to MyKrypt.");
        Main app = new Main();
        app.menue();
    }
}
