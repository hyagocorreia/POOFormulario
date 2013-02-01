package formulario;

public class ValidadorIdade implements Validador {
	int tamMax;
	public ValidadorIdade(int tamMax){
		this.tamMax = tamMax;
	}
	public boolean validar(String valor) {
		ValidadorInteiro val = new ValidadorInteiro();
		if(val.validar(valor)){
			if(valor.length() <= tamMax){
				return true;
			}
		}
		return false;
	}

}
