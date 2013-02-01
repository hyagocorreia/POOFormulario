package formulario;

public class Main {

	public static void main(String[] args) {
		Formulario form = new Formulario();
		
		Campo campoNome = new Campo("nome","Nome: ",new ValidadorTexto(40));
		Campo campoIdade = new Campo("idade","Idade: ",new ValidadorIdade(8));
		Campo campoEmail = new Campo("email","Email: ",new ValidadorEmail(50));
		Campo campoSenha = new Campo("senha","Senha: ",new ValidadorSenha(6,8));
		
		form.addCampo(campoNome);
		form.addCampo(campoIdade);
		form.addCampo(campoEmail);
		form.addCampo(campoSenha);
		
		String nome = Util.lerString(campoNome.getLabel());
		String idade = Util.lerString(campoIdade.getLabel());
		String email = Util.lerString(campoEmail.getLabel());
		String senha = Util.lerString(campoSenha.getLabel());
		
		while(!form.setValor(campoNome.getId(), nome)){
			Util.alert("Tamanho do nome está acima do permitido!\nTente novamente:\n");
			nome = Util.lerString(campoNome.getLabel());
		}
		
		while(!form.setValor(campoIdade.getId(), idade)){
			Util.alert("Idade digitada errada!");
			idade = Util.lerString(campoIdade.getLabel());
		}
		
		while(!form.setValor(campoEmail.getId(), email)){
			Util.alert("Email digitado errado!");
			email = Util.lerString(campoEmail.getLabel());
		}
		
		while(!form.setValor(campoSenha.getId(), senha)){
			Util.alert("Senha fora do permitido!");
			senha = Util.lerString(campoSenha.getLabel());
		}
		
		Util.alert(form.toString());
		
	}

}
