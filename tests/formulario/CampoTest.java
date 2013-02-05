package formulario;

import static org.junit.Assert.*;
import org.junit.Test;

import formulario.Campo;
import formulario.ValidadorEmail;
import formulario.ValidadorIdade;
import formulario.ValidadorInteiro;
import formulario.ValidadorSenha;
import formulario.ValidadorTexto;



public class CampoTest {

	@Test
	public void testValidadorTexto() {
		Campo c = new Campo("nome","Nome: ", new ValidadorTexto(5));
		
		c.setValor(null);
		assertFalse(c.validar());
		
		c.setValor("");
		assertFalse(c.validar());
		
		c.setValor("abcde");
		assertTrue(c.validar());
		
		c.setValor("abcdef");
		assertFalse(c.validar());	
	}
	
	@Test
	public void testValidadorInteiro(){
		Campo c = new Campo("idade","Idade:",new ValidadorInteiro());
		
		c.setValor(null);
		assertFalse(c.validar());
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertTrue(c.validar());
	}
	
	@Test
	public void testValidadorEmail(){
		Campo c = new Campo("email","Email: ",new ValidadorEmail(25));
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertFalse(c.validar());
		
		c.setValor("hyago@hyago.com");
		assertTrue(c.validar());
	}
	
	@Test
	public void testValidadorIdade(){
		Campo c = new Campo("idade","Idade: ",new ValidadorIdade(5));
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertTrue(c.validar());
		
		c.setValor("123abc");
		assertFalse(c.validar());

		c.setValor(null);
		assertFalse(c.validar());
	}
	
	@Test
	public void testValidadorSenha(){
		Campo c = new Campo("senha","Senha: ",new ValidadorSenha(6,8));
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertFalse(c.validar());
		
		c.setValor("123abc");
		assertTrue(c.validar());

	}
}
