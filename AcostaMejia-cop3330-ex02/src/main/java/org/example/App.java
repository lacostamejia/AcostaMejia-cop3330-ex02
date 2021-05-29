package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in); //Scanner function

        System.out.println(("What is the input string?")); //Asking an input string

        String name = scan.nextLine(); //Saving the input string

        int length = name.length(); //Calculating the lenght of the string

        System.out.println(name + " has " + length + " characters."); //Printing the results
    }
}
