class Math3 {
  double x = 0.0;

  Math3(double x) {
    this.x = x;
  }

  void setX(double x) {
    this.x = x;
  }

  double getX() {
    return x;
  }

  double sin2() {
    return Math.sin(Math.PI * (x));
  }

  double cos2() {
    return Math.cos(Math.PI * (x));
  }

  double tan2() {
    return Math.tan(Math.PI * (x));
  }
}

class Mtest3 {
  public static void main(String[] args) {
    Math3 y = new Math3(0.5);
    Math3 z = new Math3(0.7);
    System.out.println("cos(0.5) + 2sin(0.7) = " + y.cos2() + 2 * z.sin2());

    y.setX(0.8);
    z.setX(0.2);
    System.out.println("1 / { 2 * sin(0.8) + cos(0.2) } = " + 1 / (2 * y.sin2() + z.cos2()));

    double a = 0;
    for (int i = 1; i <= 5; i++) {
      y.setX(i / 10);
      z.setX(2 * i / 10);
      a += 2 * y.tan2() + z.tan2();
    }
    System.out.println("sigma 2 * tan(k/10) + tan(2k/10) = " + a);
  }
}