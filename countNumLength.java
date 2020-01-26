import java.util.Scanner;

class countNumLength {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("整数値: "); int a = stdIn.nextInt();
    int len = String.valueOf(a).length();
    System.out.println("その値は" + len + "桁です。");
  }
}