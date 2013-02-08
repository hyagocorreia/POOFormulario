package formulario;

public class ValidadorSenha implements ValidadorCampo {
	int tamMin,tamMax;
	String c[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","y","x","z","ç"};
	public ValidadorSenha(int tamMin, int tamMax){
		this.tamMin = tamMin;
		this.tamMax = tamMax;
	}
	
	public boolean validar(String valor) {
		if(valor.length() >= tamMin && valor.length() <= tamMax){
			for(int i=0;i<valor.length();++i){
				String aux = null;
				aux = ""+i;
				if(valor.contains(aux)){
					for(int j=0;j<valor.length();++j){
						if(valor.contains(c[j])){
							return true;
						}
					}
				}
			}
		}
		return false;
	}

}
