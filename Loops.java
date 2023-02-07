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

  public static void main(String[] args) {
    nHellos(999);
  }
}