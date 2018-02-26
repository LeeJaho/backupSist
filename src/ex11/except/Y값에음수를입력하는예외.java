package ex11.except;

public class Y값에음수를입력하는예외 extends RuntimeException{
	
	@Override
	public String getMessage() {
		return "Y값 음수 써서 안돼!";
	}
}
