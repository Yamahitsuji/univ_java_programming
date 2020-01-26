class BookInfo {
  protected String auther;
  protected String title;
  protected String publisher;
  protected int year;

  BookInfo() {
  }

  BookInfo(String auther, String title, String publisher, int year) {
    this.auther = auther;
    this.title = title;
    this.publisher = publisher;
    this.year = year;
  }

  void setAuther(String auther) {
    this.auther = auther;
  }

  void setTitle(String title) {
    this.title = title;
  }

  void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  void setYear(int year) {
    this.year = year;
  }

  String getAuther() {
    return auther;
  }

  String getTitle() {
    return title;
  }

  String getPublisher() {
    return publisher;
  }

  int getYear() {
    return year;
  }

  void showBook() {
    System.out.println("著者: " + auther + "  タイトル: " + title + "  出版社: " + publisher + "  出版年: " + year);
  }
}

class BookInfoTester {
  public static void main(String args[]) {
    BookInfo book1 = new BookInfo("夏目漱石", "坊ちゃん", "春陽堂", 1907);
    BookInfo book2 = new BookInfo("森鴎外", "舞姫", "民友社", 1890);
    BookInfo book3 = new BookInfo("永井荷風", "あめりか物語", "博文館", 1908);
    BookInfo book4 = new BookInfo("村上龍", "五分後の世界", "幻冬舎", 1994);
    BookInfo book5 = new BookInfo();
    book5.setAuther("村上春樹");
    book5.setTitle("IQ84");
    book5.setPublisher("新潮社");
    book5.setYear(2009);
    System.out.println("著者名: " + book5.getAuther());
    System.out.println("題名: " + book5.getTitle());
    System.out.println("出版社: " + book5.getPublisher());
    System.out.println("出版年: " + book5.getYear());

    book1.showBook();
    book2.showBook();
    book3.showBook();
    book4.showBook();
    book5.showBook();
  }
}