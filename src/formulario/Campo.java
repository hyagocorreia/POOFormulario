package formulario;

public class Campo {
	private String id, valor, label;
	private Validador validador;
	
	public Campo(String id, String label, Validador validador){
		this.id = id;
		this.label = label;
		this.validador = validador;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public boolean validar(){
		return validador.validar(valor);
	}

	@Override
	public String toString() {
		return label.toUpperCase() + valor + "\n";
	}
	
	
}
