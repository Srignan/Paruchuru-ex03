package Exercise3;

import java.util.Scanner;
/*
Import scanner
Make string for author and a string for quote
Add in stings to print statement where needed
 */
public class Exercise_3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a quote:");
        String q = input.nextLine(); //q=quote
        System.out.println("Enter the author of the quote:");
        String a = input.nextLine(); //a=author
        System.out.println(a + " says, " +'"'+q+'"');
    }
}
