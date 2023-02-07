import java.util.Arrays;
public class Loops {

  public static void nHellos(int n) {
    int x = 1;
    for (x = 1; x <= n; x++) {
      if (x % 100 == 1) {
        System.out.println(x + "st hello");
      } else if ((x % 10  == 2 || x % 100 == 2) && x % 100 != 12) {
        System.out.println(x + "nd hello");
      } else if ((x % 10  == 3 || x % 100 == 3) && x % 100 != 13) {
        System.out.println(x + "rd hello");
      } else {
        System.out.println(x + "th hello");
      }
    }
  }

  public static void nRandoms(int n) {
    int x = 1;
    double sum = 0;
    for (x = 1; x <= n; x++) {
      double data = Math.random();
      sum += data;
    }
    double average = sum / n;
    System.out.println("The average of " + n + " random numbers between 0 and 1 is " + average);

  }

  public static boolean isPrime(int n) {
    int x = 2;
    boolean result = true;
    for (x = 2; x < (n/2); x++) {
      if (n % x == 0) {
        result = false;
      }
    }
    return result;
  }

  public static void getFactors(int n) {
    int factor = 1;
    int numberOfFactors = 0;
    for (factor = 1; factor <= n; factor++) {
      if (n % factor == 0) {
        numberOfFactors ++;
      }
    }
    int[] factors = new int[numberOfFactors];
    int index = 0;
    for (factor = 1; factor <= n; factor++) {
      if (n % factor == 0) {
        factors[index] = factor;
        index ++;
      }
    }
    System.out.println(Arrays.toString(factors));
  }

  private static int rollD6() {
    int result = (int) (Math.random() * 6) + 1;
    return result;
  }
  
  private static int rollD12() {
    int result = (int) (Math.random() * 12) + 1;
    return result;
  }

  public static void pepysSimulation() {
    
  }

  public static void main(String[] args) {
    getFactors(24);
  }
}