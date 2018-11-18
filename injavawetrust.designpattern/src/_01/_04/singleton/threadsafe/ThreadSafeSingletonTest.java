package _01._04.singleton.threadsafe;

public class ThreadSafeSingletonTest {

	public static void main(String[] args) {

		ThreadSafeSingleton instance1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton instance2 = ThreadSafeSingleton.getInstance();

		System.out.println(instance1 == instance2);
	}
}
