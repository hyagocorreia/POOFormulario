package formulario;

public class MaxMinDecorator extends ValidadorDecorator{

	private int min, max;
	public MaxMinDecorator(ValidadorCampo comp) {
		super(comp);
	}
	
	public MaxMinDecorator(ValidadorCampo comp, int min, int max) {
		this(comp);
		this.min = min;
		this.max = max;
	}

	public boolean validar(String valor) {
		if(!super.validar(valor)) return false;
		try{
			int aux = Integer.parseInt(valor);
			if(aux <= max && aux >= min) return true;
		}catch(Exception e){
			return false;
		}
		return false;
	}
	
}
