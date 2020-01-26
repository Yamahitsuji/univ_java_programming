import java.util.Random;
import java.util.Scanner;

class genScanRandNum {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    
    Random rnd = new Random();
    System.out.print("整数値: "); int a = stdIn.nextInt();
    System.out.println("その値の±5の乱数を生成しました。それは" + (rnd.nextInt(11) + -5 + a) + "です。");
  }
}