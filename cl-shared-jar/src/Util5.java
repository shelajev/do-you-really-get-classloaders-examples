import java.util.ArrayList;
import java.util.List;


public class Util5 {

	private static List<Runnable> listeners = new ArrayList<Runnable>();
	
	public static void registerListener(Runnable r) {
		listeners.add(r);
	}
	
	public static int listeners() {
		for (Runnable r : listeners) {
			r.run();
		}
		return listeners.size();
	}
}
