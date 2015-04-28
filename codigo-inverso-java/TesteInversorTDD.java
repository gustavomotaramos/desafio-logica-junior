import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TesteInversorTDD {
	Inversor i = new Inversor();
	

	@Test
	public void testaInverso() {


		// Testa Cadeia vazia
		Assert.assertEquals("", i.inverte(""));
		
		// Testa Cadeia com uma letra
		Assert.assertEquals("a", i.inverte("a"));
		
		// Testa Cadeia com mais de uma letra
		Assert.assertEquals("ba", i.inverte("ab"));
		Assert.assertEquals("otapaS", i.inverte("Sapato"));
		Assert.assertEquals("odepípelelaraP", i.inverte("Paralelepípedo"));
		Assert.assertEquals("abuteceuqauqatI", i.inverte("Itaquaquecetuba"));
		Assert.assertEquals("ana", i.inverte("ana"));
		Assert.assertEquals("dapI", i.inverte("Ipad"));

	}
	
}
