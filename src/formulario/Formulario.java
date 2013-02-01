package formulario;
import java.util.HashMap;
import java.util.Map;


public class Formulario {
	private Map<String, Campo> campos;
	
	public Formulario(){
		this.campos = new HashMap<String, Campo>();
	}
	
	public void addCampo(Campo campo){
		campos.put(campo.getId(), campo);
	}
	
	public boolean setValor(String idCampo, String valor){
		Campo c = campos.get(idCampo);
		c.setValor(valor);
		return c.validar();
	}

	public String toString() {
		StringBuffer str = new StringBuffer();
		str.append(">>> Formulário\n");
		str.append(campos.values()+"\n");
		return str.toString();
	}
	
	
}
