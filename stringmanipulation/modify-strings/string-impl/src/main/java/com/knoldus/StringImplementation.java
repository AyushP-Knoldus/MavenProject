package com.knoldus;
import java.util.Scanner;
public class StringImplementation
{

    public static void main( String[] args )
    {
        Scanner scannerClassObject =new Scanner(System.in);
        System.out.println("Enter the string");
        String userinput= scannerClassObject.next();
        StringManipulating ob=new StringManipulating(userinput);
        int lengthOfString= ob.getStringLength();
        String reversedString= ob.reverseString();
        System.out.println("Reverse of the string is- "+reversedString);
        System.out.println("Length of the string is-"+lengthOfString);
    }
}
