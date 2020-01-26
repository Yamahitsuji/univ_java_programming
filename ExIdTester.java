class ExId {
  private static int counter = 0;
  private static int n = 1;

  private int id;

  public ExId() {
    counter += n;
    id = counter;
  }

  public int getId() {
    return id;
  }

  public static void setN(int num) {
    n = num;
  }
}

public class ExIdTester {
  public static void main(String[] args) {
    ExId a = new ExId();
    ExId b = new ExId();
    ExId c = new ExId();

    ExId.setN(4);

    ExId d = new ExId();
    ExId e = new ExId();
    ExId f = new ExId();

    System.out.println("aの識別番号：" + a.getId());
    System.out.println("bの識別番号：" + b.getId());
    System.out.println("bの識別番号：" + c.getId());
    System.out.println("bの識別番号：" + d.getId());
    System.out.println("aの識別番号：" + e.getId());
    System.out.println("bの識別番号：" + f.getId());
  }
}