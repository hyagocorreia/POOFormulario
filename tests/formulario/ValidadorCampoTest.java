package formulario;

import static org.junit.Assert.*;
import org.junit.Test;

import formulario.Campo;
import formulario.ValidadorInteiro;
import formulario.ValidadorTexto;

public class ValidadorCampoTest {

	@Test
	public void testValidadorTexto() {
		Campo c = new Campo("texto","Texto: ", new ValidadorTexto());
		
		c.setValor(null);
		assertTrue(c.validar());
		
		c.setValor("");
		assertTrue(c.validar());
		
		c.setValor("abcde");
		assertTrue(c.validar());
		
		c.setValor("132414123");
		assertFalse(c.validar());	
	}
	
	@Test
	public void testValidadorInteiro(){
		Campo c = new Campo("idade","Idade:",new ValidadorInteiro());
		
		c.setValor(null);
		assertTrue(c.validar());
		
		c.setValor("dkjfghsjghdkj");
		assertFalse(c.validar());
		
		c.setValor("123");
		assertTrue(c.validar());
		
		c.setValor("000000001234");
		assertTrue(c.validar());
	}
	
	@Test
	public void testNotNullDecorator(){
		Campo c = new Campo("texto","Texto: ", new NotNullDecorator(new ValidadorTexto()));
		assertFalse(c.validar());
		c.setValor(null);
		assertFalse(c.validar());
	}
	
	@Test
	public void testSizeDecorator(){
		Campo c = new Campo("texto","Texto: ", new SizeDecorator(new ValidadorTexto(),3,8));
		
		c.setValor("abc");
		assertTrue(c.validar());
		c.setValor("abcdefgh");
		assertTrue(c.validar());
		
		c.setValor("ab");
		assertFalse(c.validar());
		c.setValor("abcdefghi");
		assertFalse(c.validar());
		
	}
	
}
