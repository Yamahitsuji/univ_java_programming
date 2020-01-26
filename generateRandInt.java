import java.util.Random;
import java.util.Scanner;

class generateRandInt {
  static int random(int a, int b) {
    if (b < a) return a;

    Random rand = new Random();
    int num = rand.nextInt(b - a) + a;
    return num;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
  
    System.out.print("整数a: "); int a = stdIn.nextInt();
    System.out.print("整数b: "); int b = stdIn.nextInt();
  
    System.out.println("ランダム値: " + random(a, b));
  }
}