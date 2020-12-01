
public class Fan {
	final static int SLOW = 1;
	final static int MEDIUM = 2;
	final static int FAST = 3;
	private int speed = SLOW;
	private boolean switchedOn = false;
	private double radius = 5;
	private String color = "blue";

	Fan() {
	}

	void setSpeed(int newSpeed) {
		speed = newSpeed;
	}

	void setSwitchedOn(boolean newSwitchedOn) {
		switchedOn = newSwitchedOn;
	}

	void setRadius(double newRadius) {
		radius = newRadius;
	}

	void setColor(String newColor) {
		color = newColor;
	}

	int getSpeed() {
		return speed;
	}

	boolean getSwitchedOn() {
		return switchedOn;
	}

	double getRadius() {
		return radius;
	}

	String getColor() {
		return color;
	}

	public String toString() {
		if (switchedOn) {
			return ("Speed: " + speed + "\nColor: " + color + "\nRadius: " + radius);
		} else {
			return ("Color: " + color + "\nRadius: " + radius + "\nThe fan is off.");
		}
	}
}
