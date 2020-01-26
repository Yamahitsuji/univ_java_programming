class Math1 {
  static double sin(double x) {
    return Math.sin(Math.PI * (x));
  }

  static double cos(double x) {
    return Math.cos(Math.PI * (x));
  }

  static double tan(double x) {
    return Math.tan(Math.PI * (x));
  }
}

class Mtest1 {
  public static void main(String[] args) {
    double b_sin = Math1.sin(0.5);
    System.out.println("sin = " + b_sin);
    double b_cos = Math1.cos(0.5);
    System.out.println("cos = " + b_cos);
    double b_tan = Math1.tan(0.5);
    System.out.println("cos = " + b_tan);

    double b = Math1.cos(0.5) + 2 * Math1.sin(0.7);
    System.out.println("cos(0.5) + 2sin(0.7) = " + b);
    double c = 1 / (2 * Math1.sin(0.8) + Math1.cos(0.2));
    System.out.println("1 / { 2 * sin(0.8) + cos(0.2) } = " + c);
    double d = 0;
    for (int i = 1; i <= 5; i++) {
      d += 2 * Math.tan(i / 10) + Math.tan(2 * i / 10);
    }
    System.out.println("sigma 2 * tan(k/10) + tan(2k/10) = " + d);
  }
}