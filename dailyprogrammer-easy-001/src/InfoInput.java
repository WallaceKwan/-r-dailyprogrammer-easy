/**
 * Created by wallacekwan on 2016-05-02.
 */

// https://www.reddit.com/r/dailyprogrammer/comments/pih8x/easy_challenge_1/

/**
 *
 create a program that will ask the users name, age, and reddit username.
 have it tell them the information back, in the format:
 your name is (blank), you are (blank) years old, and your username is (blank)
 for extra credit, have the program log this information in a file to be accessed later.
 *
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class InfoInput {

    public static void main (String[] args) {

        String name, username;
        int age = 0;
        Boolean flag = false;

        Scanner input = new Scanner(System.in);

        System.out.println("Provide the following information");

        System.out.print("Provide your name: ");
        name = input.nextLine();


        do {

            try {

                System.out.print("Provide your age (years old): ");
                age = input.nextInt();
                flag = true;

            } catch (InputMismatchException e) {

                System.out.println("Wrong data input, please provide an integer");
                input.nextLine();
                flag = false;

            }

            if (flag) {

                if (age < 0 || age > 120) {

                    System.out.println("Invalid age");
                    flag = false;

                }

            }

        } while (!flag);

        System.out.print("Provide your Reddit username: ");
        username = input.next();

        System.out.printf("\nThank you %s (%s) for providing your age %d.", name, username, age);


    }

}
