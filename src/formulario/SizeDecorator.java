package formulario;

public class SizeDecorator extends ValidadorDecorator{
	
	private int tamMin, tamMax;
	
	public SizeDecorator(ValidadorCampo validador) {
		super(validador);
	}

	public SizeDecorator(ValidadorCampo validador, int min, int max){
		this(validador);
		this.tamMin = min;
		this.tamMax = max;
	}

	public boolean validar(String valor) {
		if(!super.validar(valor)) return false;
		return valor.length() >= tamMin && valor.length() <= tamMax;
	}
	
}
