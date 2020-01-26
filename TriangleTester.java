class Triangle {
  double h = 1.0;
  double b = 1.0;

  Triangle() {
  }

  Triangle(double b, double h) {
    this.b = b;
    this.h = h;
  }

  void setH(double h) {
    this.h = h;
  }

  void setB(double b) {
    this.b = b;
  }

  double getH() {
    return h;
  }

  double getB() {
    return b;
  }

  double calcArea() {
    return b * h / 2;
  }
}

class TriangleTester {
  public static void main(String[] args) {
    Triangle t1 = new Triangle();
    Triangle t2 = new Triangle(4, 5);
    System.out.println("t1 area: " + t1.calcArea());
    System.out.println("t2 area: " + t2.calcArea());
    t1.setH(7.3);
    t1.setB(2.0);
    System.out.println("t1-h: " + t1.getH() + "  t1-b: " + t1.getB());
  }
}