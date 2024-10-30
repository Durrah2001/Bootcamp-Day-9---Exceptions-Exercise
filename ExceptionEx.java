package org.example;
import javax.lang.model.type.ArrayType;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {

    public static void main(String[]args) {

        Scanner scanner = new Scanner(System.in);

//        1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
//        two numbers , takes two numbers as input

            try {
                System.out.println("Input first number: ");
                int firstNum = scanner.nextInt();
                scanner.nextLine();


                System.out.println("Input second number: ");
                int secNum = scanner.nextInt();
                scanner.nextLine();

                int sumAddition = firstNum + secNum;
                System.out.println("The result of addition: " + firstNum + " + " + secNum + " = " + sumAddition);

                int sumMultiply = firstNum * secNum;
                System.out.println("The result of multiplication: " + firstNum + " * " + secNum + " = " + sumMultiply);

                int sumSubtract = firstNum - secNum;
                System.out.println("The result of subtraction: " + firstNum + " - " + secNum + " = " + sumSubtract);

                int sumDivide = firstNum / secNum;
                System.out.println("The result of dividing: " + firstNum + " / " + secNum + " = " + sumDivide);

                int sumMod = firstNum % secNum;

                System.out.println("The result of mod: " + firstNum + " % " + secNum + " = " + sumMod);

            }catch (InputMismatchException e){
                System.out.println("Incorrect input! please enter an integer number only");

        }
        System.out.println("----------------------------------------------");

//        2. Write a Java program that takes a number as input and prints its multiplication table up to
//        10.
        try {
            System.out.println("Please, enter any number to display its multiplication table:");
            int userNum = scanner.nextInt();
            scanner.nextLine();

            if (userNum < 0)
               throw new ArithmeticException("Number must be greater than zero");

                for (int m = 1; m <= 10; m++) {
                    System.out.println(userNum + " x " + m + " = " + userNum * m);
                }

           }catch (ArithmeticException e){
            System.out.println(e.getMessage());
           }

        System.out.println("----------------------------------------------");

//       3. Write a Java program to print the area and perimeter of a circle.

        try {
            System.out.print("Radius = ");
            double radius = scanner.nextFloat();
            scanner.nextLine();

            double sumPerimter = (2 * 3.14 * radius);
            System.out.println("Perimeter =  " + sumPerimter);

            double sumArea = (3.14 * radius * radius);
            System.out.println("Area = " + sumArea);

        }catch (InputMismatchException e){
            System.out.println("Incorrect input! the input must be a number");
        }

        System.out.println("----------------------------------------------");

////       4. Java program to find out the average of a set of integers
      try {
            System.out.println("Enter the count of numbers:  ");
            int countNumbers = scanner.nextInt();
            scanner.nextLine();

            if (countNumbers <= 0)
                throw new ArithmeticException("Number must be greater than zero");

            double sum = 0.0;

            for (int n = 1; n <= countNumbers; n++) {
                System.out.println("Enter an integer: ");
                try {
                    int intNumber = scanner.nextInt();
                    sum += intNumber;

                } catch (InputMismatchException e) {
                    System.out.println("Incorrect input! the input must be an integer number only");
                }
            }

            double avg = sum / countNumbers;
            System.out.println("The average is: " + avg);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");

////        5. Write a Java program that accepts three integers as input, adds the first two integers
//////        together, and then determines whether the sum is equal to the third integer.
        try {
            System.out.println("Input the first number: ");
            int first = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Input the second number: ");
            int second = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Input the third number: ");
            int third = scanner.nextInt();
            scanner.nextLine();

            int sumOfTwo = first + second;

            if (sumOfTwo == third) {
                System.out.println("The result is: true");

            } else System.out.println("The result is: false");
        } catch (InputMismatchException e) {

            System.out.println("Incorrect input! the input must be an integer number only");
        }
        System.out.println("----------------------------------------------");

//////        6. Write a Java program to reverse a word.

        try {
            System.out.print("Input a word to reverse it: ");
            String word = scanner.nextLine();
            scanner.nextLine();

            if (word.isEmpty())
                throw new NullPointerException("You must enter any string to reverse it");

            for (int w = word.length() - 1; w >= 0; w--) {

                String reversedWord = String.valueOf(word.charAt(w));
                System.out.print(reversedWord);
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\n----------------------------------------------");

////        7 - Java program to check whether the given number is even or odd

        try {
            System.out.println("Enter a number:  ");
            int userNumber2 = scanner.nextInt();
            scanner.nextLine();

            if (userNumber2 < 0)
                throw new ArithmeticException("The number must be positive number only");

            if (userNumber2 % 2 == 0) {
                System.out.println("The number is Even");

            } else System.out.println("The number is Odd");

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! the input must be an integer number");

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");


////        8 - Java program to convert the temperature in Centigrade to Fahrenheit

        try {
            System.out.println("Enter temperature in Centigrade: ");
            double tempInCen = scanner.nextDouble();
            scanner.nextLine();

            double tempInFah = tempInCen * 1.8 + 32;
            //multiplied by 1.8, plus 32.

            System.out.println("Temperature in Fahrenheit is: " + tempInFah);

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! the temperature must be a number");
        }

        System.out.println("----------------------------------------------");
//
////        9.Write a Java program that takes a string and a number from the user,then prints the
//        character in the given index.

        try {
            System.out.print("Input a string: ");
            String str = scanner.nextLine();
            scanner.nextLine();

            if (str.isEmpty())
                throw new NullPointerException("Can not be empty! you must enter any string");

            System.out.print("Input a number of index you want to display its character: ");
            int indexNum = scanner.nextInt();
            scanner.nextLine();

            if (indexNum <= str.length())
                throw new StringIndexOutOfBoundsException("The number you entered is out of string's range");

            char charInStr = (char) str.charAt(indexNum);

            System.out.println("The character in the index " + indexNum + " is: " + charInStr);

        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! the index must be an integer number");
        }

        System.out.println("----------------------------------------------");

////        10. Write a Java program to print the area and perimeter of a rectangle.

        try {
            System.out.print("Enter the width of a rectangle : ");
            double width = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter the height of a rectangle : ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            if (width < 0 || height < 0)
                throw new ArithmeticException("Width and height must be a positive numbers");

            double recArea = width * height;
            System.out.println("Area of the rectangle = " + recArea);

            double recPerimeter = 2 * (height + width);
            System.out.println("Perimeter of the rectangle = " + recPerimeter);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");

////        11. Write a Java program to compare two numbers.

        try {
            System.out.print("Input first integer: ");
            int firstInt = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Input second integer: ");
            int secondInt = scanner.nextInt();
            scanner.nextLine();

            if (firstInt < secondInt) {
                System.out.println(firstInt + " < " + secondInt);
            }

            if (firstInt > secondInt) {
                System.out.println(firstInt + " > " + secondInt);
            }

            if (firstInt <= secondInt) {
                System.out.println(firstInt + " <= " + secondInt);
            }

            if (firstInt >= secondInt) {
                System.out.println(firstInt + " >= " + secondInt);
            }

            if (firstInt == secondInt) {
                System.out.println(firstInt + " == " + secondInt);
            }

            if (firstInt != secondInt) {
                System.out.println(firstInt + " != " + secondInt);
            }

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! the input must be an integer number");
        }


        System.out.println("----------------------------------------------");

////        12. Write a Java program to convert seconds to hours, minutes and seconds.
//
        //hours = totalSecs / 3600; minutes = (totalSecs % 3600) / 60; seconds = totalSecs % 60

        try {
            System.out.print("Input seconds: ");
            int userSec = scanner.nextInt();

            if (userSec < 0)
                throw new ArithmeticException("The value of seconds must be greater than zero");

            int hours = (userSec / 3600);
            int minutes = ((userSec % 3600) / 60);
            int seconds = (userSec % 60);

            System.out.println("Time in hours, minutes, and seconds: " + hours + ":" + minutes + ":" + seconds);

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! the input must be an integer number");

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");
//
//        13. Write a Java program that accepts four integers from the user and prints equal if all
//        four are equal, and not equal otherwise.

        try {
            System.out.println("Input first number: ");
            int firstNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Input second number: ");
            int secNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Input third number: ");
            int thirdNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Input fourth number: ");
            int fourthNumber = scanner.nextInt();
            scanner.nextLine();

            if (firstNumber == secNumber && firstNumber == thirdNumber && thirdNumber == fourthNumber) {
                System.out.println("All numbers are equal!");

            } else System.out.println("Numbers are not equal!");

        } catch (InputMismatchException e) {
            System.out.println("Incorrect input! the input must be a number");
        }

        System.out.println("----------------------------------------------");

//      14. Write a Java program that reads an integer and check whether it is negative, zero, or
//        positive.

        System.out.println("Enter any number to check if it is positive, negative, or zero: ");

        try{
        int numToCheck = scanner.nextInt();
        scanner.nextLine();

            if (numToCheck == 0) {
                System.out.println("Number is zero");

            } else if (numToCheck > 0) {
                System.out.println("Number is positive");

            } else System.out.println("Number is negative");


        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("----------------------------------------------");

//        15.Write a program to enter the numbers till the user wants and at the end it
//        should display the count of positive, negative and zeros entered  (End loop use -1 ,
//                Don’t count -1).

        int userNumber3 = 0;
        int countOfZeros = 0;
        int countOfPositive = 0;
        int countOfNegative = 0;

        do {
            try {

                System.out.println("Enter a number, and -1 to stop:");
                userNumber3 = scanner.nextInt();
                scanner.nextLine();

            }catch (InputMismatchException e) {
                System.out.println("Incorrect input! the input must be a number");
            }
                if (userNumber3 == 0) {
                    countOfZeros++;
                }

                else if (userNumber3 < 0 && userNumber3 != -1) {
                    countOfNegative++;
                }

                else {
                    countOfPositive++;
                }


        } while (userNumber3 != -1);

        System.out.println("Count of positive numbers: " + countOfPositive);
        System.out.println("Count of negative numbers (without -1): " + countOfNegative);
        System.out.println("Count of zeros: " + countOfZeros);

        System.out.println("----------------------------------------------");

//        16 - Write a program that prompts the user to input an integer and then outputs the
//        number with the digits reversed.


        System.out.println("Please, enter any number to reverse it: ");
        String numToRev = scanner.nextLine();
        scanner.nextLine();

        System.out.println("Number after reversed is: " + reverseNum(numToRev));

        System.out.println("----------------------------------------------");

//        17 - Write a program to enter the numbers till the user wants and at the end the
//        program should display the largest and smallest numbers entered.

        int userNum4 = 0;
        int larger = userNum4;
        int smaller = Integer.MAX_VALUE;

        do {

            try {
                System.out.println("Enter any number, or \"-1\" to stop: ");
                userNum4 = scanner.nextInt();
                scanner.nextLine();

            }catch (InputMismatchException e) {
                System.out.println("Incorrect input! the input must be a number");
            }
                if (userNum4 == -1) {
                    break;
                }

                if (userNum4 > larger) {
                    larger = userNum4;
                }


                if (userNum4 < smaller) {
                    smaller = userNum4;
                }

        } while (userNum4 != -1);

        System.out.println("The largest number is: " + larger);
        System.out.println("The smallest number is: " + smaller);


        System.out.println("----------------------------------------------");


//        18 - Determine and print the number of times the character ‘a’ appears in the input
//        entered by the user.

        String userString = null;
        try {
            System.out.println("Enter any string to display number of times the char \"a\" appears in it: ");
            userString = scanner.nextLine();
            scanner.nextLine();

        } catch (NullPointerException e) {
            System.out.println("Number of a's in your string is: " + numOfCharA(userString));

        }
        System.out.println("----------------------------------------------");


    }


 // ///////////////////////////////////////////////////////////

    public static String reverseNum(String numToRev){

        String revNumber = " ";
        try {
            if (numToRev.isEmpty())
                throw new StringIndexOutOfBoundsException("You must enter a number to reverse it");

            for (int r = numToRev.length() - 1; r >= 0; r--) {

                revNumber = revNumber + numToRev.charAt(r);
            }
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

        return revNumber;
    }

    ///////////////////////////////////////////

    public static int numOfCharA(String string) throws NullPointerException{

        if(string.isEmpty())
            throw new NullPointerException("Can not be empty! you must enter any string");

        int s;
        int numOfCharA = 0;

        for(s = 0; s < string.length(); s++){

            if(string.charAt(s) == 'a'){
                numOfCharA++;
            }
        }

        return numOfCharA;
    }












}
























