package formulario;

public class ValidadorTexto implements Validador {
	private int tamMax;
	
	public ValidadorTexto(int tamMax){
		this.tamMax = tamMax;
	}
	
	public boolean validar(String valor) {
		if(valor == null || valor.length() == 0 || valor.length() > tamMax){
			return false;
		}
		return true;
	}

}
