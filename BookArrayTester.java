class BookArrayTester {
  public static void main(String args[]) {
    BookInfo[] books = { new BookInfo("夏目漱石", "坊ちゃん", "春陽堂", 1907), new BookInfo("森鴎外", "舞姫", "民友社", 1890),
        new MultilingualBook("Victor Hugo", "Les Miserables", "A. lacroix, Verboeck-hoven & Ce.", 1862, "仏語", true,
            "豊島与志雄", "レ・ミゼラブル", "岩波書店"),
        new MultilingualBook("Lewis Carroll", "Alice's Ad-ventures in Wonderland", "Macmillan Pyblishers", 1865, "英語",
            true, "高山宏", "不思議の国のアリス", "東京図書"),
        new BookInfo("永井荷風", "あめりか物語", "博文館", 1908) };

    for (int i = 0; i < books.length; i++) {
      books[i].showBook();
    }
  }
}