
public class Time {
	private int hour;
	private int minute;
	private int second;

	Time() {
		this(System.currentTimeMillis() + 3600000 * 2);
	}

	Time(long milliseconds) {
		setTime(milliseconds);
	}

	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	private void setHour(int hour) {
		this.hour = hour;
	}

	private void setMinute(int minute) {
		this.minute = minute;
	}

	private void setSecond(int second) {
		this.second = second;
	}

	int getHour() {
		return hour;
	}

	int getMinute() {
		return minute;
	}

	int getSecond() {
		return second;
	}

	void setTime(long milliseconds) {
		milliseconds %= 86400000;
		setHour((int) (milliseconds / 3600000));
		milliseconds %= 3600000;
		setMinute((int) (milliseconds / 60000));
		milliseconds %= 60000;
		setSecond((int) (milliseconds / 1000));
	}

	void getTime() {
		System.out.println(getHour() + ":" + getMinute() + ":" + getSecond());
	}
}
