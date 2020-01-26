class MultilingualBook extends BookInfo {
  protected String language = "日本語";
  protected boolean hasTranslation = false;
  protected String translationAuther = "";
  protected String translationTitle = "";
  protected String translationPublisher = "";

  MultilingualBook() {
  }

  MultilingualBook(String auther, String title, String publisher, int year) {
    super(auther, title, publisher, year);
  }

  MultilingualBook(String auther, String title, String publisher, int year, String language, boolean hasTranslation,
      String translationAuther, String translationTitle, String translationPublisher) {
    super(auther, title, publisher, year);
    this.language = language;
    this.hasTranslation = hasTranslation;
    this.translationAuther = translationAuther;
    this.translationPublisher = translationPublisher;
  }

  void setLanguage(String language) {
    this.language = language;
  }

  void setHasTranslation(boolean hasTranslation) {
    this.hasTranslation = hasTranslation;
  }

  void setTranslationAuther(String translationAuther) {
    this.translationAuther = translationAuther;
  }

  void setTranslationTitle(String translationTitle) {
    this.translationTitle = translationTitle;
  }

  void setTranslationPublisher(String translationPublisher) {
    this.translationPublisher = translationPublisher;
  }

  String getLanguage() {
    return language;
  }

  boolean getHasTranslation() {
    return hasTranslation;
  }

  String getTranslationAuther() {
    return translationAuther;
  }

  String getTranslationTitle() {
    return translationTitle;
  }

  String getTranslationPublisher() {
    return translationPublisher;
  }

  void showBook() {
    if (language == "日本語")
      super.showBook();
    else
      System.out.println("著者: " + auther + "  タイトル: " + title + "  出版社: " + "  出版年: " + year + "言語: " + language
          + "  訳書の有無: " + hasTranslation + "  訳者名: " + translationAuther + "  訳書名: " + translationTitle + "  訳書出版社: "
          + translationPublisher);
  }
}

class MultilingualBookTester {
  public static void main(String args[]) {
    MultilingualBook book1 = new MultilingualBook("Victor Hugo", "Les Miserables", "A. lacroix, Verboeck-hoven & Ce.",
        1862, "仏語", true, "豊島与志雄", "レ・ミゼラブル", "岩波書店");
    MultilingualBook book2 = new MultilingualBook("Lewis Carroll", "Alice's Ad-ventures in Wonderland",
        "Macmillan Pyblishers", 1865, "英語", true, "高山宏", "不思議の国のアリス", "東京図書");
    MultilingualBook book3 = new MultilingualBook("Albert Camus", "L'Etranger", "Editions Gallimard", 1942, "仏語", true,
        "窪田啓作", "異邦人", "新潮文庫");
    MultilingualBook book4 = new MultilingualBook("J.D．Salinger", "The Catcher in the Rye", "Little, Brown and Company",
        1951, "英語", true, "野崎孝", "ライ麦畑でつかまえて", "白水社");
    MultilingualBook book5 = new MultilingualBook();
    book5.setAuther("Antoine de Saint-Exupery");
    book5.setTitle("Le Petit Prince");
    book5.setPublisher("Peynal and Hitchcock");
    book5.setYear(1943);
    book5.setLanguage("仏語");
    book5.setHasTranslation(true);
    book5.setTranslationAuther("内藤濯");
    book5.setTranslationTitle("星の王子様");
    book5.setTranslationPublisher("岩波書店");

    System.out.println("著者名: " + book5.getAuther());
    System.out.println("題名: " + book5.getTitle());
    System.out.println("出版社: " + book5.getPublisher());
    System.out.println("出版年: " + book5.getYear());
    System.out.println("言語: " + book5.getLanguage());
    System.out.println("訳書の有無: " + book5.getHasTranslation());
    System.out.println("訳者名: " + book5.getTranslationAuther());
    System.out.println("訳書名: " + book5.getTranslationTitle());
    System.out.println("訳書出版社: " + book5.getTranslationPublisher());

    book1.showBook();
    book2.showBook();
    book3.showBook();
    book4.showBook();
    book5.showBook();

    MultilingualBook book6 = new MultilingualBook("夏目漱石", "坊ちゃん", "春陽堂", 1907);
    book6.showBook();
  }
}