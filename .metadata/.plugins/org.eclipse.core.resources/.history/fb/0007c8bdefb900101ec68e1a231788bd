package uGame;
import java.util.Random;

/**
 * This abstract Generator class provides an interface for two different
 * Generators, namely the StdGenerator, which is basically a Random Generator,
 * and a MockGenerator, which will return the value getting passed with the
 * generate method.
 */
public abstract class Generator {

	private static Generator instance = new StdGenerator();

	public static void setGenerator(Generator g) {
		instance = g;
	}

	public static int nextInt(int value) {
		return instance.generate(value);
	}

	public static void resetGenerator() {
		instance = new StdGenerator();
	}

	public abstract int generate(int value);

}

/**
 * @see Random
 */
class StdGenerator extends Generator {
	Random gen = new Random();

	public int generate(int value) {
		return gen.nextInt(value);
	}
}
