import java.util.Scanner;

class SearchDayOfTheWeek {

	public static void main(String[] args){
    String[] wd = {"日", "月", "火", "水", "木", "金", "土" };

    Day a = new Day(500, 1, 1);
    Day b = new Day(1000, 1, 1);
    Day c = new Day(1500, 1, 1);
    Day d = new Day(2000, 1, 1);

		System.out.println(a.getYear() + "年"
			+ a.getMonth() + "月"
			+ a.getDate() + "日は"
      + wd[a.dayOfWeek()] + "曜日です．");
    System.out.println(b.getYear() + "年"
			+ b.getMonth() + "月"
			+ b.getDate() + "日は"
      + wd[b.dayOfWeek()] + "曜日です．");
    System.out.println(c.getYear() + "年"
			+ c.getMonth() + "月"
			+ c.getDate() + "日は"
      + wd[c.dayOfWeek()] + "曜日です．");
    System.out.println(d.getYear() + "年"
			+ d.getMonth() + "月"
			+ d.getDate() + "日は"
			+ wd[d.dayOfWeek()] + "曜日です．");
	}
}