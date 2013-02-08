package formulario;

public class CPFDecotaror extends ValidadorDecorator{

	public CPFDecotaror(ValidadorCampo validador) {
		super(validador);
	}

	private static String calcDigVerif(String num) {  
        Integer primDig, segDig;  
        int soma = 0, peso = 10;  
        for (int i = 0; i < num.length(); i++)  
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;  
  
        if (soma % 11 == 0 | soma % 11 == 1)  
            primDig = new Integer(0);  
        else  
            primDig = new Integer(11 - (soma % 11));  
  
        soma = 0;  
        peso = 11;  
        for (int i = 0; i < num.length(); i++)  
                soma += Integer.parseInt(num.substring(i, i + 1)) * peso--;  
          
        soma += primDig.intValue() * 2;  
        if (soma % 11 == 0 | soma % 11 == 1)  
            segDig = new Integer(0);  
        else  
            segDig = new Integer(11 - (soma % 11));  
  
        return primDig.toString() + segDig.toString();  
    }  
  
	public boolean validar(String valor) {  
        if (valor.length() != 11)  
            return false;  
  
        String numDig = valor.substring(0, 9);  
        return calcDigVerif(numDig).equals(valor.substring(9, 11));  
    }
}
