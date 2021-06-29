package GenericMethod;

public class Util {

	public static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<T>();
		box.set(t);
		
		return box; // box = Box<T> 객체로 생성한 매개변수.
	}
	
}
