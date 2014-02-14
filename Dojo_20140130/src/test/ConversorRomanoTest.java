package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import conversor.ConversorRomano;

public class ConversorRomanoTest {
	
	private ConversorRomano conversor;
	
	@Before
	public void setup() {
		conversor = new ConversorRomano();
	}

	@Test
	public void deveRetonar1() {
		assertEquals(conversor.converterParaHinduArabico("I"), new Integer(1));
	}
	
	@Test
	public void deveRetonar5() {
		assertEquals(conversor.converterParaHinduArabico("V"), new Integer(5));
	}

	@Test
	public void deveRetonar10() {
		assertEquals(conversor.converterParaHinduArabico("X"), new Integer(10));
	}

	@Test
	public void deveRetonar50() {
		assertEquals(conversor.converterParaHinduArabico("L"), new Integer(50));
	}
	@Test
	public void deveRetonar100() {
		assertEquals(conversor.converterParaHinduArabico("C"), new Integer(100));
	}
	@Test
	public void deveRetonar500() {
		assertEquals(conversor.converterParaHinduArabico("D"), new Integer(500));
	}
	@Test
	public void deveRetonar1000() {
		assertEquals(conversor.converterParaHinduArabico("M"), new Integer(1000));
	}
	
	@Test
	public void deveRetonar2() {
		assertEquals(conversor.converterParaHinduArabico("II"), new Integer(2));
	}
	
	@Test
	public void deveRetonar6() {
		assertEquals(conversor.converterParaHinduArabico("VI"), new Integer(6));
	}
	
	@Test
	public void deveRetonar15() {
		assertEquals(conversor.converterParaHinduArabico("XV"), new Integer(15));
	}

	@Test
	public void deveRetonar20() {
		assertEquals(conversor.converterParaHinduArabico("XX"), new Integer(20));
	}
	
	@Test
	public void deveRetonar200() {
		assertEquals(conversor.converterParaHinduArabico("CC"), new Integer(200));
	}	
	
	@Test
	public void deveRetonar2000() {
		assertEquals(conversor.converterParaHinduArabico("MM"), new Integer(2000));
	}
	
	@Test
	public void deveRetonar4() {
		assertEquals(conversor.converterParaHinduArabico("IV"), new Integer(4));
	}
	
	@Test
	public void deveRetonar9() {
		assertEquals(conversor.converterParaHinduArabico("IX"), new Integer(9));
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe3I() {
		conversor.converterParaHinduArabico("IIII");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe2V() {
		conversor.converterParaHinduArabico("VV");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe3X() {
		conversor.converterParaHinduArabico("XXXX");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe2L() {
		conversor.converterParaHinduArabico("LL");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe3C() {
		conversor.converterParaHinduArabico("CCCC");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe2D() {
		conversor.converterParaHinduArabico("DD");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoTiverMaisDe3M() {
		conversor.converterParaHinduArabico("MMMM");
	}
	
	@Test(expected = RuntimeException.class)
	public void deveRetonarRuntimeExceptionQuandoVL() {
		conversor.converterParaHinduArabico("VL");
	}
	
	@Test
	public void deveRetonar40() {
		assertEquals(conversor.converterParaHinduArabico("XL"), new Integer(40));
	}
	
	@Test
	public void deveRetonarRuntimeExceptionQuandoTiverIL() {
		assertEquals(conversor.converterParaHinduArabico("IL"), new Integer(40));
	}
}
