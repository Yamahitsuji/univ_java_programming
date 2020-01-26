class calMin {
  static int min(int a, int b) {
    if (a < b) return a;
    return b;
  }

  static int min(int a, int b, int c) {
    int min = a;
    if (b < min) min = b;
    if (c < min) min = c;
    return min;
  }

  static int min(int[] a) {
    int min = a[0];
    for (int i = 1; i < a.length; i++) {
      if (a[i] < min) min = a[i];
    }

    return min;
  }

  public static void main(String[] args) {
    int min_a = min(3, 2);
    int min_b = min(5, 2, 7);

    int[] a = { 1, 4, 6, 2 };
    int min_c = min(a);

    System.out.println("min_a: " + min_a);
    System.out.println("min_b: " + min_b);
    System.out.println("min_c: " + min_c);
  }
}