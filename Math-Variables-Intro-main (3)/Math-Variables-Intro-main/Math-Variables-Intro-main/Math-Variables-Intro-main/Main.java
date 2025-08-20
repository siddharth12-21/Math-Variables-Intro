class Main {
  public static void main(String[] args) {

    // Use the // to create single line comments to either add info or to take out
    // code for debugging

    System.out.println("Hello");
    System.out.println("world! ");
    System.out.print("Hello");
    System.out.print(" world!");
    System.out.println();

    // We will be using System.out.println and System.out.print throughout the year.
    // Try using both below to see what the difference is!
    // ANSWER: println automatically goes to the next line while print continues on
    // the same line

    // Throughout the year this year we will need to store information. For that we
    // will be using VARIABLES!
    // Java is an Object-Oriented programming language. All variables we use this
    // year will either be OBJECTS or PRIMITIVES
    // There are 8 primitives in Java: int, byte, short, long, float, double,
    // boolean, char
    // For AP we need to know: int, double, boolean
    // List examples of the types below and give definition
    // int (integer):
    // double:
    // boolean:
    // For now we are just going to work with primitive
    // Create 3 variables of each of the above types (USE GOOD CODING PRACTICE WHEN
    // CREATING THE VARIABLES

    int count = 21;
    int c = 0;
    double ba = 1.7;
    boolean isTrue = true;

    // MATH TIME!
    // What are the math operators that we can use?
    // + - * / %
    // Try doing some math operations with numbers. How can we check to see if the
    // math worked?

    int num = 3 + 3;
    int val = 3 % 2;
    System.out.println("num=" + num);
    System.out.println("val= " + val);

    // Create codes that will print the following:
    // Odd integers from 1 to 100, inclusive of both
    for (int counter = 1; counter <= 100; counter += 2) {
      System.out.print(counter + " ");
    }
    System.out.println();
    System.out.println();

    // All multiples of 3 from 1 to 100
    for (int mult = 3; mult <= 99; mult += 3) {
      System.out.print(mult + " ");
    }
    System.out.println();
    System.out.println();

    // Starting at 1000, print on the same line (with a - [hypthen] between each)
    // all of the numbers that end in 0 going down to 0
    for (int zeroes = 1000; zeroes >= 0; zeroes -= 10) {
      System.out.print(zeroes + " ");
    }
    System.out.println();
    System.out.println();
  }
}
