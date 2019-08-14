//public class SaldoInsuficienteException extends RuntimeException {
//
//	public SaldoInsuficienteException(String msg) {
//		super(msg);
//	}
//	
//}

public class SaldoInsuficienteException extends Exception{
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
}