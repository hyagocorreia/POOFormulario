package formulario;

public class ValidadorEmail implements Validador {
	int tamMax;
	public ValidadorEmail(int tamMax){
		this.tamMax = tamMax;
	}
	
	public boolean validar(String valor) {
		if(valor.contains("@") && valor.length() <= tamMax){
			return true;
		}
		return false;
	}

}
