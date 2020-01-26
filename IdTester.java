class Id {
  static int counter = 0;

  private int id;

  public Id() {
    id = ++counter;
  }

  public int getId() {
    return id;
  }

  public static int getMaxId() {
    return counter;
  }
}

public class IdTester {
  public static void main(String[] args) {
    Id a = new Id();
    Id b = new Id();
    Id c = new Id();

    System.out.println("aの識別番号：" + a.getId());
    System.out.println("bの識別番号：" + b.getId());
    System.out.println("bの識別番号：" + c.getId());
    System.out.println("最後に与えた識別番号：" + Id.getMaxId());
  }
}