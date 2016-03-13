/*
 * @author jsl
 * @version 20151025
 * copied from stat/SingletonClient.java
 */
package headfirst.singleton.classic;

public class SingletonMain {
	public static void main(String[] args) {
		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();
		Singleton singleton3 = Singleton.getInstance();
	}
}
