import java.util.Scanner;
import java.util.Arrays;

class generateArrayClone {
  static int[] arrayClone(int[] a) {
    int[] b =  a.clone();

    return b;
  }

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.print("要素数n: ");
    int n = stdIn.nextInt();

    int[] a = new int[n];
    for ( int i = 0; i < n; i++) {
      System.out.print("a[" + i + "]: "); int b = stdIn.nextInt();
      a[i] = b;
    }

    int[] copyArray = arrayClone(a);
    for (int i = 0; i < n; i++) {
      System.out.println(copyArray[i]);
    }
  }
}