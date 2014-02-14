package test;

import static org.junit.Assert.assertEquals;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

import caixa.CaixaEletronico;

public class CaixaEletronicoTest {

	private CaixaEletronico caixaEletronico;

	@Before
	public void setup() {
		caixaEletronico = new CaixaEletronico();
	}

	@Test
	public void sacar10Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(10);
		assertEquals(1, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test
	public void sacar20Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(20);
		assertEquals(1, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(20)));
	}

	@Test
	public void sacar50Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(50);
		assertEquals(1, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
	}

	@Test
	public void sacar100Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(100);
		assertEquals(1, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(100)));

	}

	@Test
	public void sacar30Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(30);
		assertEquals(2, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(20)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test
	public void sacar60Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(60);
		assertEquals(2, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test
	public void sacar70Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(70);
		assertEquals(2, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(20)));
	}

	@Test
	public void sacar110Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(110);
		assertEquals(2, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(100)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test
	public void sacar150Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(150);
		assertEquals(2, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(100)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
	}

	@Test
	public void sacar40Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(40);
		assertEquals(1, saque.size());
		assertEquals(Integer.valueOf(2), saque.get(Integer.valueOf(20)));
	}

	@Test
	public void sacar200Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(200);
		assertEquals(1, saque.size());
		assertEquals(Integer.valueOf(2), saque.get(Integer.valueOf(100)));
	}

	@Test
	public void sacar80Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(80);
		assertEquals(3, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(20)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test
	public void sacar90Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(90);
		assertEquals(2, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
		assertEquals(Integer.valueOf(2), saque.get(Integer.valueOf(20)));
	}

	@Test
	public void sacar130Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(130);
		assertEquals(3, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(100)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(20)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test
	public void sacar180Reais() {
		Map<Integer, Integer> saque = caixaEletronico.sacar(180);
		assertEquals(4, saque.size());
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(100)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(50)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(20)));
		assertEquals(Integer.valueOf(1), saque.get(Integer.valueOf(10)));
	}

	@Test(expected = RuntimeException.class)
	public void sacar1Real() {
		caixaEletronico.sacar(1);
	}

}
