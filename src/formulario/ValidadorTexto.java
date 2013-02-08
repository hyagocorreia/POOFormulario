package formulario;

public class ValidadorTexto implements ValidadorCampo {
	
	public boolean validar(String valor) {
		if(valor == null) return true;
		try{
			Integer.parseInt(valor);
			return false;
		}catch(Exception e){
			return true;
		}
	}

}
