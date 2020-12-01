
public class TestTV {

	public static void main(String[] args) {
		TV tv0001 = new TV();
		System.out.println(tv0001.channel);
		System.out.println(tv0001.volumeLevel);
		System.out.println(tv0001.on);
		tv0001.turnOff();
		System.out.println(tv0001.on);
		tv0001.turnOn();
		System.out.println(tv0001.on);
		tv0001.setChannel(60);
		System.out.println(tv0001.channel);
		tv0001.channelUp();
		System.out.println(tv0001.channel);
		tv0001.channelDown();
		System.out.println(tv0001.channel);
		tv0001.setVolume(4);
		System.out.println(tv0001.volumeLevel);
		tv0001.volumeUp();
		System.out.println(tv0001.volumeLevel);
		tv0001.volumeDown();
		System.out.println(tv0001.volumeLevel);

	}

}
