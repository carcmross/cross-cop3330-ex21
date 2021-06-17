package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright Marc-Anthony Cross
 */

/*
 * Many programs display information to the end user in one form but use a different form inside the program. For
 * example, you may show the word Blue on the screen, but behind the scenes you’ll have a numerical value for that
 * color or an internal value because you may need to represent the textual description in another language for
 * Spanish-speaking visitors.
 *
 * Write a program that converts a number from 1 to 12 to the corresponding month. Prompt for a number and display
 * the corresponding calendar month, with 1 being January and 12 being December. For any value outside that range,
 * display an appropriate error message.
 * Example Output
 *
 * Please enter the number of the month: 3
 * The name of the month is March.
 *
 * Constraints
 *
 *     Use a switch or case statement for this program.
 *     Use a single output statement for this program.
 *
 * Challenges
 *
 *     Use a map or dictionary to remove the switch statement from the program.
 *     Support multiple languages. Prompt for the language at the beginning of the program.
 *
 */

public class App {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String number = getNumber();
        String month = returnMonth(number);
        String outputString = generateOutput(month);
        System.out.println(outputString);
    }

    public static String generateOutput(String month) {
        return "The name of the month is " + month + ".";
    }

    public static String returnMonth(String number) {
        int num_month = Integer.parseInt(number);
        switch(num_month) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default:
                break;
        }
        return "";
    }

    public static String getNumber() {
        System.out.print("Please enter the number of the month: ");
        return in.nextLine();
    }
}
