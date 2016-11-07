import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * 
 */

/**
 * @author schuldtd
 *
 */
public class GaiaTest {
	
	@Test
	public void testPong(){
		Gaia gaia = new Gaia();
		assertEquals("Returned String does not match 'pong'","pong",gaia.pong());
	}
	
	@Test
	public void testPing(){
		Gaia gaia = new Gaia();
		assertEquals("Returned String does not match 'ping'","ping",gaia.ping());
	}

}
