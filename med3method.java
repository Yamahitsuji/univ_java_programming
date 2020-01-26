import java.util.Scanner;

class med3method {
  static int mid(int a, int b, int c) {
    if (c < a && a < b || b < a && a < c) {
      return a;
    }
    if (a < b && b < c || c < b && b < a) {
      return b;
    }
    return c;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
  
    System.out.print("整数a: "); int a = stdIn.nextInt();
    System.out.print("整数b: "); int b = stdIn.nextInt();
    System.out.print("整数c: "); int c = stdIn.nextInt();
  
    System.out.println("中間値は" + mid(a, b, c) + "です。");
  }
}
