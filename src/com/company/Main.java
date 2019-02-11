// Create a text menu allowing the user to interact with a business of your choice.
// Have a minimum of five different options in the menu, and if the option is selected print
// the choice on the screen. Use a do-while loop to validate user input,
// and re-display the screen if the input is not valid.


// Pseudo code in source
// set up a loop to accept user input
// the exit condition will be when the user enters a number 5
// Display the menu items numbered 1..5 on seperate lines
// If the usere enters a selection of 1..4 on the menu print a message that says
// thank you for your order your selection is on its way.
// skip several lines and redisplay the menu for the next order.
// if the user enters selection 5 exit the program.



package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // variable to hold the users selection
        int userSelection = 5;

        // create the scanner object
        Scanner scanner =
                new Scanner(System.in);

        // loop starts here
        do {
            // display the greeting
            System.out.println(" Welcome to The Steakhouse");
            // display the instructions
            System.out.println("Please select 1 of the following items by entering the corresponding number");

            // display the menu options
            System.out.println("1   Sirloin Steak");
            System.out.println("2   New York Strip Steak");
            System.out.println("3   Butt Steak");
            System.out.println("4   Salisbury Steak");
            System.out.println("5   Exit");

            // get the users input
            userSelection = scanner.nextInt();

            // parse the users input

            switch (userSelection){

                case 1:
                    System.out.println ("You selected 1.. Sirloin Steak");
                    break;
                case 2:
                    System.out.println("You selected 2.. New York Strip Steak");
                    break;
                case 3:
                    System.out.println("You selected 3.. Butt Steak");
                    break;
                case 4:
                    System.out.println("You selected 4.. Salisbury Steak");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid entry, you entered " + userSelection);
                    System.out.println("Please try again");
                    break;
            }

        }
        while (userSelection != 5);
        System.out.println("Thank you for shopping at the steak house");
    }
}
