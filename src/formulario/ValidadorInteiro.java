package formulario;

public class ValidadorInteiro implements Validador {

	public boolean validar(String valor) {
		try{
			Integer.parseInt(valor);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
