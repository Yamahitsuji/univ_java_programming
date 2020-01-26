import java.util.Random;

class genRandom3number {
  public static void main(String[] args) {
    Random rnd = new Random();
    System.out.println("１桁の正の整数値: " + (rnd.nextInt(10) + 1));
    System.out.println("１桁の負の整数値: " + (rnd.nextInt(10) -10));
    System.out.println("２桁の正の整数値: " + (rnd.nextInt(90) + 10));
  }
}