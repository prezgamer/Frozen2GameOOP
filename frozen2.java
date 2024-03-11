package Frozen2GameOOP;

import java.util.Scanner;

public class frozen2 {
    public static String[] playerName = {null,null};
    public static int[] playerPower = {0,0};
    public static int[] playerHealth = {0,0};
    public static String[] playerMove = {null,null};

    public static void printMenu(){
        System.out.println("1. Elsa");
        System.out.println("2. Anna");
        System.out.println("3. Kristof");
        System.out.println("4. Olaf");
    }

    public static void printGame() {

        Scanner newScan = new Scanner(System.in);
        System.out.println("Choose s,p,r: ");
        playerMove[0] = newScan.nextLine();  // Read user input
        System.out.println("Choose s,p,r: ");
        playerMove[1] = newScan.nextLine();  // Read user input

        if (playerMove[0].charAt(0) == 's' && playerMove[1].charAt(0) == 's'){
            System.out.println("It is a tie");
        } else if (playerMove[0].charAt(0) == 'r' && playerMove[1].charAt(0) == 'r'){
            System.out.println("It is a tie");
        } else if (playerMove[0].charAt(0) == 'p' && playerMove[1].charAt(0) == 'p'){
            System.out.println("It is a tie");
        } else if (playerMove[0].charAt(0) == 's' && playerMove[1].charAt(0) == 'p'){ //Player 1 wins, Player 2 Loses
            System.out.println(playerName[0] + " Wins");
            System.out.println(playerName[1] + " Loses");
        } else if (playerMove[0].charAt(0) == 'p' && playerMove[1].charAt(0) == 'r'){ //Player 1 wins, Player 2 Loses
            System.out.println(playerName[0] + " Wins");
            System.out.println(playerName[1] + " Loses");
        } else if (playerMove[0].charAt(0) == 'r' && playerMove[1].charAt(0) == 's'){ //Player 1 wins, Player 2 Loses
            System.out.println(playerName[0] + " Wins");
            System.out.println(playerName[1] + " Loses");
        } else if (playerMove[1].charAt(0) == 's' && playerMove[0].charAt(0) == 'p'){ //Player 2 wins, Player 1 Loses
            System.out.println(playerName[1] + " Wins");
            System.out.println(playerName[0] + " Loses");
        } else if (playerMove[1].charAt(0) == 'p' && playerMove[0].charAt(0) == 'r'){ //Player 2 wins, Player 1 Loses
            System.out.println(playerName[1] + " Wins");
            System.out.println(playerName[0] + " Loses");
        } else if (playerMove[1].charAt(0) == 'r' && playerMove[0].charAt(0) == 's'){ //Player 2 wins, Player 1 Loses
            System.out.println(playerName[1] + " Wins");
            System.out.println(playerName[0] + " Loses");
        } else {
            System.out.println("Player 1 Move: " + playerMove[0]);
            System.out.println("Player 2 Move: " + playerMove[1]);
            System.out.println("Please key the correct letter");
            printGame();
        }
    }

    public static void chooseChar(){
        printMenu();
        int chosenNum = 0;

        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter Number: ");
        String numString = newScan.nextLine();  // Read user input
        chosenNum = Integer.parseInt(numString);

        while(true)
        {
            if (chosenNum > 4 || chosenNum <= 0){
                chooseChar();
                break;
            } else {
                break;
            }
        }

        switch (chosenNum) {
            case 1: //elsa
                if (playerName[0] == null){
                    elsa elsaChar1 = new elsa(100,100);

                    playerName[0] = "Elsa1";
                    playerHealth[0] = elsaChar1.getHealth();
                    playerPower[0] = elsaChar1.getPower();
                    chooseChar();
                }
                if (playerName[1] == null){
                    elsa elsaChar2 = new elsa(100,100);

                    playerName[1] = "Elsa2";
                    playerHealth[1] = elsaChar2.getHealth();
                    playerPower[1] = elsaChar2.getPower();
                }
                break;
        
            case 2: //anna
                if (playerName[0] == null){
                    anna annaChar1 = new anna(100,100);

                    playerName[0] = "Anna1";
                    playerHealth[0] = annaChar1.getHealth();
                    playerPower[0] = annaChar1.getPower();
                    chooseChar();
                }
                if (playerName[1] == null){
                    anna annaChar2 = new anna(100,100);

                    playerName[1] = "Anna2";
                    playerHealth[1] = annaChar2.getHealth();
                    playerPower[1] = annaChar2.getPower();
                }
                break;

            case 3: //Kristof
                if (playerName[0] == null){
                    kristof kristofChar1 = new kristof(100,100);

                    playerName[0] = "Kristof1";
                    playerHealth[0] = kristofChar1.getHealth();
                    playerPower[0] = kristofChar1.getPower();
                    chooseChar();
                }
                if (playerName[1] == null){
                    kristof kristofChar2 = new kristof(100,100);

                    playerName[1] = "Kristof2";
                    playerHealth[1] = kristofChar2.getHealth();
                    playerPower[1] = kristofChar2.getPower();
                }
                break;

            case 4: //Olaf
                if (playerName[0] == null){
                    olaf olafChar1 = new olaf(100,100);

                    playerName[0] = "Olaf1";
                    playerHealth[0] = olafChar1.getHealth();
                    playerPower[0] = olafChar1.getPower();
                    chooseChar();
                }
                if (playerName[1] == null){
                    olaf olafChar2 = new olaf(100,100);

                    playerName[1] = "Olaf2";
                    playerHealth[1] = olafChar2.getHealth();
                    playerPower[1] = olafChar2.getPower();
                }
                break;
        }
    }

    public static void main(String[] args) {
        chooseChar();
        
        printGame();
    }
}
