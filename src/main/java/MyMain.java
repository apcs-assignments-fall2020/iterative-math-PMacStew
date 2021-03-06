import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double guess = 3;
        double betterGuess = 0;
        double temporary = 0;
        while (.00001 < (Math.abs(guess - betterGuess))) {
            betterGuess = (guess + (x / guess)) / 2;
            temporary = guess;
            guess = betterGuess;
            betterGuess = temporary;
        }
        return guess;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int last = 0;
        if (x == 0)
            return 1;
        for (int i = 0; i < x; i++) {
            if (i == 0)
                last = last + 1;
            else
                last = last * (i + 1);
        }
        return last;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        int count = 0;
        double e = 0;
        while (Math.abs(e - Math.E) >= .00001) {
            e = e + (1 / factorial(count));
            count++;
        }
        return e;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double input = scan.nextDouble();
        System.out.println("The square root of your number is approxamitely " + babylonian(input) + ".");
        System.out.println("The aproximate value of E is " + calculateE() + ".");
        scan.close();
    }
}
