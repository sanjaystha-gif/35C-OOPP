import java.util.Scanner;
public class Week3 {
    public static void main(String[] args) {
    /* 1. Write a JAVA program to find the maximum between three numbers. */
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();
        
        double max;
        
        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }
        
        System.out.println("The maximum number is: " + max);
        
        scanner.close();


    /* 2. Write a JAVA program to check whether a number is negative, positive, or zero. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        double number = scanner.nextDouble();
        
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
        
        scanner.close();


    /* 3. Write a JAVA program to check whether a number is divisible by 5 and 11 or not. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        if (number % 5 == 0 && number % 11 == 0) {
            System.out.println("The number is divisible by both 5 and 11.");
        } else {
            System.out.println("The number is not divisible by both 5 and 11.");
        }
        
        scanner.close();


    /* 4. Write a JAVA program to check whether a number is even or odd. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        
        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
        
        scanner.close();


    /* 5. Write a JAVA program to check whether a year is a leap year or not. 

            Hint: if year%4==0; if year%100!==0 ; year%400==0; 

            */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a year:");
        int year = scanner.nextInt();
        
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        
        scanner.close();


    /* 6. Write a JAVA program to input any alphabet and check whether it is vowel or consonant. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter an alphabet:");
        char ch = scanner.next().charAt(0);
        
        // Convert the character to lowercase to simplify the comparison
        ch = Character.toLowerCase(ch);
        
        if (ch >= 'a' && ch <= 'z') {
            // Check if the entered character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.println(ch + " is a vowel.");
            } else {
                System.out.println(ch + " is a consonant.");
            }
        } else {
            System.out.println("Invalid input. Please enter an alphabet.");
        }
        
        scanner.close();


    /* 7. Write a Java program that takes a student's grade as input (A, B, C, D, or F) and converts it to the corresponding GPA value. Use a switch case statement to handle different grades. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the student's grade (A, B, C, D, or F):");
        char grade = scanner.next().charAt(0);
        
        double gpa;
        
        switch (grade) {
            case 'A':
            case 'a':
                gpa = 4.0;
                break;
            case 'B':
            case 'b':
                gpa = 3.0;
                break;
            case 'C':
            case 'c':
                gpa = 2.0;
                break;
            case 'D':
            case 'd':
                gpa = 1.0;
                break;
            case 'F':
            case 'f':
                gpa = 0.0;
                break;
            default:
                System.out.println("Invalid grade entered.");
                scanner.close();
                return;
        }
        
        System.out.println("The GPA value for grade " + grade + " is: " + gpa);
        
        scanner.close();


    /* 8. Create a Java program that takes two numbers and an operator (+, -, *, /) as inputs and performs the corresponding arithmetic operation using a switch case statement. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        
        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();
        
        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);
        
        double result;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator entered.");
        }
        
        scanner.close();


    /* 9. Write a Java program that takes an integer input (1 to 12) representing a month and prints the corresponding season (e.g., 1-3: Winter, 4-6: Spring, 7-9: Summer, 10-12: Fall) using a switch case. */

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the month (1 to 12):");
        int month = scanner.nextInt();
        
        String season;
        
        switch (month) {
            case 1:
            case 2:
            case 3:
                season = "Winter";
                break;
            case 4:
            case 5:
            case 6:
                season = "Spring";
                break;
            case 7:
            case 8:
            case 9:
                season = "Summer";
                break;
            case 10:
            case 11:
            case 12:
                season = "Fall";
                break;
            default:
                season = "Invalid month";
        }
        
        System.out.println("The season for month " + month + " is: " + season);
        
        scanner.close();


    /* 10. Implement a Java program that calculates the area of different shapes (circle, rectangle, square, triangle) based on the user's choice using a switch case.*/
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape to calculate the area:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
 
        int choice = scanner.nextInt();
 
        double area;
 
        switch (choice) {
            case 1:
                System.out.println("Enter the radius of the circle:");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("The area of the circle is: " + area);
                break;
            case 2:
                System.out.println("Enter the length of the rectangle:");
                double length = scanner.nextDouble();
                System.out.println("Enter the width of the rectangle:");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("The area of the rectangle is: " + area);
                break;
            case 3:
                System.out.println("Enter the side length of the square:");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("The area of the square is: " + area);
                break;
            case 4:
                System.out.println("Enter the base of the triangle:");
                double base = scanner.nextDouble();
                System.out.println("Enter the height of the triangle:");
                double height = scanner.nextDouble();
                area = 0.5 * base * height;
                System.out.println("The area of the triangle is: " + area);
                break;
            default:
                System.out.println("Invalid choice!");
        }
 
        scanner.close();

 

    }
}
