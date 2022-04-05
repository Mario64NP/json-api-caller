package domain;

public class Comic {

	private int num;
	private short day;
	private short month;
	private short year;
	private String title;
	private String img;

	public Comic() {

	}

	public Comic(int num, short day, short month, short year, String title, String img) {
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

	public short getDay() {
		return day;
	}

	public void setDay(short day) {
		this.day = day;
	}

	public short getMonth() {
		return month;
	}

	public void setMonth(short month) {
		this.month = month;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
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