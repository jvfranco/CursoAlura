
public class FluxoComTratamento {
	
	public static void main(String[] args) {
        System.out.println("Ini do main");
        /**
         * Desta maneira o código apenas faz o tratamento da exceçãp aritmética, não tratará outras exceções
         */
        
//        try {
//        	metodo1();
//        } catch (ArithmeticException ex) {
//        	String msg = ex.getMessage();
//        	System.out.println("ArithmeticException " + msg);
//        } 
//        catch (NullPointerException ex) {
//        	String msg = ex.getMessage();
//        	System.out.println("NullPointerException " + msg);
//        } ou
        try {
        	metodo1();
          } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
          	String msg = ex.getMessage();
          	System.out.println("Exception " + msg);
          	ex.printStackTrace();
          } 
        
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("Deu erro");
        
//        throw new ArithmeticException("deu erro");
        
//        ArithmeticException exception = new ArithmeticException("deu erro");
//        throw exception;
        
 //       System.out.println("Fim do metodo2"); como "jogou" = throw exceção, o método é forçado a terminar e nem executa a última linha
    }
}
