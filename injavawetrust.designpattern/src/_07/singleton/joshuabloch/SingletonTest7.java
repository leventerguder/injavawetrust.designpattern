package _07.singleton.joshuabloch;

public class SingletonTest7 {

	public static void main(String[] args) {

		JoshuaBlochSingleton instance1 = JoshuaBlochSingleton.INSTANCE;
		JoshuaBlochSingleton instance2 = JoshuaBlochSingleton.INSTANCE;

		System.out.println(instance1 == instance2);
	}
}
