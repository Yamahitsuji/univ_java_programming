import java.util.Scanner;

class culcAveMaxMinScore {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    System.out.print("人数: "); final int n = stdIn.nextInt();

    int[] score = new int[n];
    int sum = 0, max = 0, min = 100;

    for (int i =  0; i < n; i++) {
      System.out.print((i + 1) + "番の点数: ");
      score[i] = stdIn.nextInt();

      sum += score[i];
      if (max < score[i]) max = score[i];
      if (min > score[i]) min = score[i];
    }

    System.out.println("平均点は" + (sum / n) + "点です。");
    System.out.println("最高点は" + max + "点です。");
    System.out.println("最低点は" + min + "点です。");
  }
}