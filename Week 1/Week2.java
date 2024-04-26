import java.util.Scanner;
public class Week2 {
    public static void main(String[] args) {
    /* 1. Write a program to check whether a person can cast a vote or not. The condition is you must be over 18 years old to vote. */
        Scanner scanner = new Scanner(System.in);
        
        // enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        // Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote yet. You must be over 18 years old.");
        }
        
        scanner.close();


    /* 2. Write a program to calculate SI. 
        Formula Simple Interest = (PrincipleAmount*Time*Rate/100);
        // */
        Scanner scanner = new Scanner(System.in);

        // Input principal amount, time, and rate
        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the time in years: ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principalAmount * time * rate) / 100;

        // Output the result
        System.out.println("Simple Interest: " + simpleInterest);

        scanner.close();


    /* 3. Write a program to calculate, area of the triangle, and the Volume of the Cube and Cuboid.
        Formula: Volume of Cuboid = length*width*height; and Volume of Cube: side*side*side; */
        Scanner scanner = new Scanner(System.in);

        // Calculate area of a triangle
        System.out.println("Enter the base and height of the triangle:");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        double triangleArea = (base * height) / 2;
        System.out.println("Area of the triangle: " + triangleArea);

        // Calculate volume of a cube
        System.out.println("Enter the side length of the cube:");
        double sideLength = scanner.nextDouble();
        double cubeVolume = Math.pow(sideLength, 3);
        System.out.println("Volume of the cube: " + cubeVolume);

        // Calculate volume of a cuboid
        System.out.println("Enter the length, width, and height of the cuboid:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double heightCuboid = scanner.nextDouble();
        double cuboidVolume = length * width * heightCuboid;
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        scanner.close();

    /* 4. Write the ternary operator for question no. 1 */
        Scanner scanner = new Scanner(System.in);

        // Input age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check if the person can vote using ternary operator
        String result = (age >= 18) ? "You are eligible to vote." : "You are not eligible to vote.";

        // Output the result
        System.out.println(result);

        scanner.close();

    /* 5. Write a program to take two integer inputs from the user and print the sum and product of them */
        Scanner scanner = new Scanner(System.in);

        // Input the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Input the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Calculate the product
        int product = num1 * num2;

        // Print the sum and product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);

        scanner.close();

    /* 6. Take two integer inputs from the user. First, calculate the sum of two, then the product of two. Finally, calculate the division of the thus obtained sum and product and print the result. */

        Scanner scanner = new Scanner(System.in);

        // Input the first integer
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();

        // Input the second integer
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Calculate the product
        int product = num1 * num2;

        // Calculate the Division
        int division = num1/num2;

        // Print the sum and product
        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Division: " + division);


        scanner.close();

    /* 7. Take the name, roll number, and field of interest from the user and print in the format below: Hey, my name is XYZ and my roll number is XYZ. My field of interest are xyz. */
        Scanner scanner = new Scanner(System.in);

        // Input name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Input roll number
        System.out.print("Enter your roll number: ");
        String rollNumber = scanner.nextLine();

        // Input field of interest
        System.out.print("Enter your field of interest: ");
        String fieldOfInterest = scanner.nextLine();

        // Print in the specified format
        System.out.println("Hey, my name is " + name + " and my roll number is " + rollNumber + ".");
        System.out.println("My field of interest is " + fieldOfInterest + ".");

        scanner.close();

    /* 8. Take side of a square from user and print area and perimeter of it. Also, calculate Simple Interest, Area of triangle and Volume of Cube and Cuboid. Take the attributes as user input. */
        Scanner scanner = new Scanner(System.in);

        // Input side of the square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();

        // Calculate area and perimeter of the square
        double squareArea = side * side;
        double squarePerimeter = 4 * side;

        // Output area and perimeter of the square
        System.out.println("Area of the square: " + squareArea);
        System.out.println("Perimeter of the square: " + squarePerimeter);

        // Input principal amount, time, and rate for simple interest
        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();

        System.out.print("Enter the time (in years): ");
        double time = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        // Calculate simple interest
        double simpleInterest = (principalAmount * time * rate) / 100;

        // Output simple interest
        System.out.println("Simple Interest: " + simpleInterest);

        // Input base and height of the triangle
        System.out.print("Enter the base and height of the triangle: ");
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        // Calculate area of the triangle
        double triangleArea = (base * height) / 2;

        // Output area of the triangle
        System.out.println("Area of the triangle: " + triangleArea);

        // Input side length of the cube
        System.out.print("Enter the side length of the cube: ");
        double cubeSide = scanner.nextDouble();

        // Calculate volume of the cube
        double cubeVolume = Math.pow(cubeSide, 3);

        // Output volume of the cube
        System.out.println("Volume of the cube: " + cubeVolume);

        // Input length, width, and height of the cuboid
        System.out.print("Enter the length, width, and height of the cuboid: ");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();
        double heightCuboid = scanner.nextDouble();

        // Calculate volume of the cuboid
        double cuboidVolume = length * width * heightCuboid;

        // Output volume of the cuboid
        System.out.println("Volume of the cuboid: " + cuboidVolume);

        scanner.close();

    /* 9.  Ask user to give two double input for length and breadth of a rectangle and print area type casted to int. */
        Scanner scanner = new Scanner(System.in);

        // Input length and breadth of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate area of the rectangle
        double area = length * breadth;

        // Typecast area to int
        int areaInt = (int) area;

        // Output area of the rectangle as int
        System.out.println("Area of the rectangle (typecasted to int): " + areaInt);

        scanner.close();

    /* 10. Write a program to calculate the total marks of four subjects of a student and the total percentage secured. And use the following conditions to generate the final result;

        a. If equal to or more than 70 -> First Class

        b. If more than 59 -> Upper Second Class

        c. If more than 49 -> Second class

        d. If more than 39 -> Third class and if below than 40 the result is fail. 

    Hint: Use ternary operator */
        Scanner scanner = new Scanner(System.in);

        // Input marks for four subjects
        System.out.println("Enter marks for four subjects (out of 100):");
        System.out.print("Subject 1: ");
        int subject1 = scanner.nextInt();
        System.out.print("Subject 2: ");
        int subject2 = scanner.nextInt();
        System.out.print("Subject 3: ");
        int subject3 = scanner.nextInt();
        System.out.print("Subject 4: ");
        int subject4 = scanner.nextInt();

        // Calculate total marks and percentage
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double percentage = (double) totalMarks / 4;

        // Determine the result based on percentage
        String result = (percentage >= 70) ? "First Class"
                        : (percentage > 59) ? "Upper Second Class"
                        : (percentage > 49) ? "Second Class"
                        : (percentage > 39) ? "Third Class"
                        : "Fail";

        // Output total marks, percentage, and result
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Result: " + result);

        scanner.close();

    }
}
