package formulario;

public class NotNullDecorator extends ValidadorDecorator{

	public NotNullDecorator(ValidadorCampo comp) {
		super(comp);
	}

	@Override
	public boolean validar(String valor) {
		if(!super.validar(valor)) return false;
		return valor != null;
	}
	

}
