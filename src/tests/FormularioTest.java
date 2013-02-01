package tests;

import static org.junit.Assert.*;
import org.junit.Test;

import formulario.Campo;
import formulario.Formulario;
import formulario.ValidadorEmail;
import formulario.ValidadorIdade;
import formulario.ValidadorInteiro;
import formulario.ValidadorSenha;
import formulario.ValidadorTexto;

public class FormularioTest {

	@Test
	public void testeFormulario() {
		Formulario f = new Formulario();
		f.addCampo(new Campo("texto","Campo Texto",new ValidadorTexto(5)));
		f.addCampo(new Campo("inteiro","Campo Inteiro",new ValidadorInteiro()));
		f.addCampo(new Campo("email","Campo Email",new ValidadorEmail(25)));
		f.addCampo(new Campo("idade","Campo Idade",new ValidadorIdade(8)));
		f.addCampo(new Campo("senha","Campo Senha",new ValidadorSenha(6, 8)));
		
		assertTrue(f.setValor("texto","abcde"));
		assertFalse(f.setValor("texto","abcdef"));
		
		assertTrue(f.setValor("inteiro","10"));
		assertFalse(f.setValor("inteiro","abcdef"));
		assertFalse(f.setValor("inteiro","10abcd"));
		
		assertTrue(f.setValor("email","ab@cde"));
		assertFalse(f.setValor("email","abcdef"));
		
		assertTrue(f.setValor("idade","10000000"));
		assertFalse(f.setValor("idade","100000000"));
		assertFalse(f.setValor("idade","100abc"));
		
		assertTrue(f.setValor("senha","abcd123"));
		assertFalse(f.setValor("senha","abcdef"));
		assertFalse(f.setValor("senha","1234567"));
	}
}
