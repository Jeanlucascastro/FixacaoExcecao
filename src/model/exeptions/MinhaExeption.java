package model.exeptions;

public class MinhaExeption extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public MinhaExeption (String msg) {
		super(msg);
	}
	
}
