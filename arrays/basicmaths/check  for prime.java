// A school method based Java program to
// check if a number is prime or not
class GFG {

    // Check for number prime or not
    static boolean isPrime(int n)
    {

        // Check if number is less than
        // equal to 1
        if (n <= 1)
            return false;

        // Check if number is 2
        else if (n == 2)
            return true;

        // Check if n is a multiple of 2
        else if (n % 2 == 0)
            return false;

        // If not, then just check the odds
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        if (isPrime(19))
            System.out.println("true");

        else
            System.out.println("false");
    }
}
  


// efficient method to check if a number is prime or not
// Java program to check whether a number


class Test {

    // Function check whether a number
    // is prime or not
    public static boolean isPrime(int n)
    {
        if (n <= 1)
            return false;

        // Check if n=2 or n=3
        if (n == 2 || n == 3)
            return true;

        // Check whether n is divisible by 2 or 3
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        // Check from 5 to square root of n
        // Iterate i by (i+6)
        for (int i = 5; i <= Math.sqrt(n); i = i + 6)
            if (n % i == 0 || n % (i + 2) == 0)
                return false;

        return true;
    }

    // Driver Code
    public static void main(String[] args)
    {
        if (isPrime(11)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }
}
