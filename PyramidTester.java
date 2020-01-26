class Pyramid extends Triangle {
  double k = 1.0;

  Pyramid() {
  }

  Pyramid(int b, int h, int k) {
    super(b, h);
    this.k = k;
  }

  void setK(double k) {
    this.k = k;
  }

  double getK() {
    return k;
  }

  double calcVol() {
    return calcArea() * k / 3;
  }

  double calcSideArea() {
    return b * k / 2;
  }

  double calcArea() {
    return calcSideArea() + b * h / 2;
  }
}

class PyramidTester {
  public static void main(String[] args) {
    Pyramid p1 = new Pyramid();
    Pyramid p2 = new Pyramid(4, 5, 9);
    System.out.println("p1 vol: " + p1.calcVol());
    System.out.println("p2 vol: " + p2.calcVol());
    System.out.println("p1 area: " + p1.calcArea());
    System.out.println("p2 area: " + p2.calcArea());
    p1.setH(7.3);
    p1.setB(2.0);
    p1.setK(5.0);

    System.out.println("p1-h: " + p1.getH() + "  p1-b: " + p1.getB() + " p1-k: " + p1.getK());
  }
}