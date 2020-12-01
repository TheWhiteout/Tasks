
public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = true;

	public TV() {
	}

	public void turnOn() {
		on = true;
	}

	public void turnOff() {
		on = false;
	}

	public void setChannel(int newChannel) {
		if (newChannel > 0 && newChannel < 121) {
			channel = newChannel;
		}
	}

	public void setVolume(int newVolumeLevel) {
		if (newVolumeLevel > 0 && newVolumeLevel < 8) {
			volumeLevel = newVolumeLevel;
		}
	}

	public void channelUp() {
		if (channel < 120) {
			channel++;
		}
	}

	public void channelDown() {
		if (channel > 1) {
			channel--;
		}
	}

	public void volumeUp() {
		if (volumeLevel < 7) {
			volumeLevel++;
		}
	}

	public void volumeDown() {
		if (volumeLevel > 1) {
			volumeLevel--;
		}
	}
}
