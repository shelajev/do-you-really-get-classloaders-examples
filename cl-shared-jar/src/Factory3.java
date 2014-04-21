

public class Factory3 {
	public static Util3 instance() {
    return new Util3();
	}
	
	public static Object instanceUntyped() {
    return new Util3();
	}
	
	static Object instancePackage() {
    return new Util3();
	}
}
