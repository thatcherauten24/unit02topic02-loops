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
    for (factor = 1; factor < n; factor++) {
      if (n % factor == 0) {
        numberOfFactors ++;
      }
    }
    int[] factors = new int[numberOfFactors];
    int index = 0;
    for (factor = 1; factor < n; factor++) {
      if (n % factor == 0) {
        factors[index] = factor;
        index ++;
      }
    }
    System.out.println(Arrays.toString(factors));
  }

  private static int rollDie() {
    int result = (int) (Math.random() * 6) + 1;
    return result;
  }
  
  public static void pepysSimulation() {
    int ones6 = 0;
    int ones12 = 0;
    int simNum = 1000000;

    for (int num = 0; num <= simNum; num ++){
      for (int n = 0; n < 6; n++) {
        rollDie();
        if(rollDie() == 1) {
          ones6 ++;
        }
      }
      for (int n = 0; n < 12; n++) {
        rollDie();
        if(rollDie() == 1) {
          ones12 ++;
        }
      }
    }
    double ones6Prob =  (double) ones6 / (double) simNum;
    double ones12Prob = ((double) ones12) / (2) / (double) simNum;

    System.out.println("Probability for ones6 " + ones6Prob);
    System.out.println("Probabliity for ones12 " + ones12Prob);

    if (ones6 > ones12) {
      System.out.println("It is more likely to roll 1 at least once when rolling a fair dice 6 times than to roll a one at least twice when rolling a fair dice 12 times");
    } else if (ones6 < ones12) {
      System.out.println("It is more likely to roll 1 at least twice when rolling a fair dice 12 times than to roll a one at least once when rolling a fair dice 6 times");
    } else {
      System.out.println("The probability is the same");
    }
  }
  public static void main(String[] args) {
    pepysSimulation();
  }
}