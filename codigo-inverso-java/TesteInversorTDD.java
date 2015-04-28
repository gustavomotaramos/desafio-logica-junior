import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;


public class TesteInversorTDD {
	Inversor i = new Inversor();
	

	@Test
	public void testaInverso() {

		Assert.assertEquals("zdraN", i.inverte("Nardz"));
		Assert.assertEquals("diC", i.inverte("Cid"));
		Assert.assertEquals("araL", i.inverte("Lara"));

	}
}
