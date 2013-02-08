package formulario;

public abstract class ValidadorDecorator implements ValidadorCampo {

	private ValidadorCampo componente;
	
	public ValidadorDecorator(ValidadorCampo comp){
		this.componente = comp;
	}
	
	@Override
	public boolean validar(String valor) {
		return componente.validar(valor);
	}

}
