package formulario;

public class EmailDecorator extends ValidadorDecorator {
	
	public EmailDecorator(ValidadorCampo comp) {
		super(comp);
	}
	
	public boolean validar(String valor) {
		if(!super.validar(valor)) return false;
		return valor.contains("@");
	}
}
