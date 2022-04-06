package domain;

public class Comic {

	private int num;
	private int day;
	private int month;
	private int year;
	private String title;
	private String img;

	public Comic() {

	}

	public Comic(int num, int day, int month, int year, String title, String img) {
		this.num = num;
		this.day = day;
		this.month = month;
		this.year = year;
		this.title = title;
		this.img = img;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	@Override
	public String toString() {
		return "Comic [num=" + num + ", day=" + day + ", month=" + month + ", year=" + year + ", title=" + title
				+ ", img=" + img + "]";
	}

}