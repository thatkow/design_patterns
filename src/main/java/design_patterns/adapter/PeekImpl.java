package design_patterns.adapter;

public class PeekImpl implements Peek{

	public static final String SUPRISE = "Suprise!";

	@Override
	public String peek() {
		return SUPRISE;
	}

}
