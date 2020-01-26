class Point3D extends Point2D {
  private int z = 1;

  Point3D() {
  }

  Point3D(int x, int y, int z) {
    super(x, y);
    this.z = z;
  }

  double distance() {
    return Math.sqrt(x * x + y * y + z * z);
  }

  double distance(Point3D b) {
    int dx, dy, dz;
    dx = this.x - b.x;
    dy = this.y - b.y;
    dz = this.z - b.z;
    return Math.sqrt(dx * dx + dy * dy + dz * dz);
  }

  public String toString() {
    return String.format("(%d, %d, %d)", x, y, z);
  }
}

class Point2D extends Point {
  protected int y = 1;

  Point2D() {
  }

  Point2D(int x, int y) {
    super(x);
    this.y = y;
  }

  double distance() {
    return Math.sqrt(x * x + y * y);
  }

  double distance(Point2D b) {
    if (b instanceof Point2D)
      ((Point) b).distance();
    int dx, dy;
    dx = this.x - b.x;
    dy = this.y - b.y;
    return Math.sqrt(dx * dx + dy * dy);
  }

  public String toString() {
    return String.format("(%d, %d)", x, y);
  }
}

class Point {
  protected int x = 1;

  Point() {
  }

  Point(int x) {
    this.x = x;
  }

  double distance() {
    return Math.sqrt(x * x);
  }

  double distance(Point b) {
    int dx;
    dx = this.x - x;
    return Math.sqrt(dx * dx);
  }

  public String toString() {
    return String.format("(%d)", x);
  }
}

class PointTester {
  public static void main(String argv[]) {
    Point p1 = new Point(2);
    Point p2 = new Point(-3);
    System.out.println("点 p1 から原点の距離は" + p1.distance());
    System.out.println("点 p1 と p2 の距離は" + p1.distance(p2));

    Point2D q1 = new Point2D(1, -1);
    Point q2 = new Point2D(0, 1);
    System.out.println("点 q1 と q2 の距離は" + q1.distance(q2));
    System.out.println("点 q1 と q2 の距離は" + q1.distance((Point2D) q2));
    System.out.println("q2 は Point か: " + (q2 instanceof Point));
    System.out.println("q2 は Point2D か: " + (q2 instanceof Point2D));
    System.out.println("q2 は Point3D か: " + (q2 instanceof Point3D));

    Point3D r1 = new Point3D(1, 1, 1);
    Point3D r2 = new Point3D(-1, -1, -1);
    System.out.println("点 r1 と r2 の距離は" + r1.distance((Point3D) r2));
  }
}