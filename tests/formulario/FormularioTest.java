package formulario;

import static org.junit.Assert.*;
import org.junit.Test;

import formulario.Campo;
import formulario.Formulario;
import formulario.ValidadorInteiro;
import formulario.ValidadorTexto;

public class FormularioTest {

	@Test
	public void testeFormulario() {
		Formulario f = new Formulario();
		f.addCampo(new Campo("texto","Campo Texto",new ValidadorTexto()));
		f.addCampo(new Campo("inteiro","Campo Inteiro",new ValidadorInteiro()));
		
		assertTrue(f.setValor("texto","abcde"));
		assertTrue(f.setValor("texto","abc12"));
		assertFalse(f.setValor("texto","12345"));
		assertTrue(f.setValor("texto",null));
		
		assertTrue(f.setValor("inteiro","10"));
		assertFalse(f.setValor("inteiro","abcdef"));
		assertFalse(f.setValor("inteiro","10abcd"));
		
	}
}
