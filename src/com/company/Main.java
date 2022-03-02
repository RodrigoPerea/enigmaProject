package com.company;

import java.util.Scanner;

public class Main {

public void runProgram(){
    System.out.println("enter the tekst you whant to decrypt");
    stringToNom();
userShiftValue();

}


    public int stringToNom(){
        String fromUser = userInputTekst();
        //int shiftValue=userShiftValue();
        char[] array = fromUser.toCharArray();
        for (char calculation : array) {
           int num = letterToNumber(calculation);
            //System.out.print(num);
           // int netLetterNumber= shift(num,shiftValue);
            //char letter = numberToLetter(netLetterNumber);

        }
        return 0;
    }

   // public String numToString(){
    //shift();
   // }
   // from numbers to letter


public int letterToNumber(char calculation) {
    int unicode = (int) calculation;
    int startPositionUniCode = 96;
    if (unicode <= 122 & unicode >= 97) {
        int forPrint = unicode - startPositionUniCode;
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

public int shift(int numberFromLetter, int shiftValue){
        shiftValue = numberFromLetter+ shiftValue;
    if (numberFromLetter>29){
        numberFromLetter= 1;
        return numberFromLetter;
        }
    return shiftValue;


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

        Main app = new Main();
        app.runProgram();
    }
}
