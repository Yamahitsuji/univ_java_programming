class Account {
	private String name;
	private String no;
  private long balance;
  private Day openDay;

	Account(String n, String num, long z, Day openDay){
		this.name = n;
		this.no = num;
    this.balance = z;
    this.openDay = openDay;
	}
	String getName(){
		return name;
	}
	String getNo(){
		return no;
	}
	long getBalance(){
		return balance;
  }
  Day getPurchaseDay() {
    return openDay;
  }
	void deposit(long k){
		balance += k;
	}
	void withdraw(long k){
		balance -= k;
  }
  String toStringDay(){
    return openDay.getYear() + "年"
    + openDay.getMonth() + "月"
    + openDay.getDate() + "日";
  }
}


class AccountTester {
	public static void main(String[] args){
    Day day1 = new Day(2020, 1, 1);
    Day day2 = new Day(2020, 12, 31);
		Account adachi = new Account("足立幸一", "123456", 1000, day1);
		Account nakata = new Account("仲田真二", "654321", 2000, day2);

		adachi.withdraw(200);
		nakata.deposit(100);

		System.out.println("■足立君の口座");
		System.out.println(" 口座名義：" + adachi.getName());
		System.out.println(" 口座番号：" + adachi.getNo());
    System.out.println(" 預金残高：" + adachi.getBalance());
    System.out.println(" 口座開設日：" + adachi.toStringDay());


		System.out.println("■仲田君の口座");
		System.out.println(" 口座名義：" + nakata.getName());
		System.out.println(" 口座番号：" + nakata.getNo());
    System.out.println(" 預金残高：" + nakata.getBalance());
    System.out.println(" 口座開設日：" + nakata.toStringDay());
	}
}