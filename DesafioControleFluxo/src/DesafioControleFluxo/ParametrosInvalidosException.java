package DesafioControleFluxo;

// define uma classe chamada ParametrosInvalidosException
// essa classe estende (herda de) Exception, tornando-a uma exceção personalizada
public class ParametrosInvalidosException extends Exception {
	    
	// define um construtor para a classe ParametrosInvalidosException
	// esse construtor recebe uma mensagem de erro como parâmetro
	public ParametrosInvalidosException(String message) {
	        
		// chama o construtor da classe pai (Exception) com a mensagem de erro
		// isso permite que a exceção carregue a mensagem para uso posterior
		super(message);
	    }
}
