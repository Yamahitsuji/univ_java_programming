class Seiseki {
  private String course = "特別研究一";
  private String category = "専門科目";
  private int credit = 6;
  private int grade = 5;

  public Seiseki() { }
  public Seiseki(String course) { this.course = course; }
  public Seiseki(String course, String category) { 
    this.course = course;
    this.category = category;
  }
  public Seiseki(String course, String category, int credit) { 
    if (credit != 1 && credit != 2 && credit != 4) credit = 2;

    this.course = course;
    this.category = category;
    this.credit = credit;
  }
  public Seiseki(String course, String category, int credit, int grade) {
    if (credit != 1 && credit != 2 && credit != 4) credit = 2;
    if (grade < 0 || grade > 5) grade = 0;

    this.course = course;
    this.category = category;
    this.credit = credit;
    this.grade = grade;
  }

  public String toString() {
    return "授業: " + this.course 
    + " 分野名: " + this.category
    + " 単位数: " + this.credit
    + " 成績: " + this.grade;
  }

  String getCourse() {
    return course;
  }
  String getCategory() {
    return category;
  }
  int getCredit() {
    return credit;
  }
  int getGrade() {
    return grade;
  }

  String getGradeName() {
    String anser = "";
    switch (grade) {
      case 5: anser =  "優"; break;
      case 4: anser =  "優"; break;
      case 3: anser =  "良"; break;
      case 2: anser =  "可"; break;
      default: anser =  "不可";
    }

    return anser;
  }

  void printSeiseki() {
    System.out.println("科目名：" + course);
    System.out.println("種類　：" + category);
    System.out.println("単位　：" + credit);
    System.out.println("成績　：" + grade);
  }
}

class SeisekiTester {
  public static void main(String[] args){
    String[] categories = {"専門科目", "理系共通", "学部共通", "教養科目"};

    Seiseki s1 = new Seiseki("微積入門",categories[0], 4, 5);
    System.out.println("getCredit->    " + s1.getCredit());
    System.out.println("getGrade->     " + s1.getGrade());
    System.out.println("getGradeName-> " + s1.getGradeName());
    System.out.println(s1.toString());

    Seiseki s2 = new Seiseki("線形代数", categories[1], 3, 5);
    System.out.println("getCredit->    " + s2.getCredit());
    System.out.println("getGrade->     " + s2.getGrade());
    System.out.println("getGradeName-> " + s2.getGradeName());
    System.out.println(s2.toString());

    Seiseki s3 = new Seiseki("通信工学", categories[3], 4, 7);
    System.out.println("getCredit->    " + s3.getCredit());
    System.out.println("getGrade->     " + s3.getGrade());
    System.out.println("getGradeName-> " + s3.getGradeName());
    System.out.println(s3.toString());
  }
}