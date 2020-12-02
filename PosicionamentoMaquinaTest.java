import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class PosicionamentoMaquinaTest {

	@Test
	public void test1() {
		ArrayList<Integer> numeroFuncionarios = new ArrayList<Integer>();
		PosicionamentoMaquina a = new PosicionamentoMaquina(numeroFuncionarios,3);
		a.setFuncionarios(10);
		a.setFuncionarios(20);
		a.setFuncionarios(30);
		int tempo = a.CalculaTempo();
		a.CalculaAndar();
		assertEquals(80,tempo);
		assertEquals(2,(int)a.getMelhorAndar().get(0));
		assertEquals(3,(int)a.getMelhorAndar().get(1));	
	}
	
	@Test
	public void test2() {
		ArrayList<Integer> numeroFuncionarios = new ArrayList<Integer>();
		PosicionamentoMaquina a = new PosicionamentoMaquina(numeroFuncionarios,3);
		a.setFuncionarios(10);
		a.setFuncionarios(30);
		a.setFuncionarios(20);
		int tempo = a.CalculaTempo();
		a.CalculaAndar();
		assertEquals(60,tempo);
		assertEquals(2,(int)a.getMelhorAndar().get(0));
	}
	
	@Test
	public void test3() {
		ArrayList<Integer> numeroFuncionarios = new ArrayList<Integer>();
		PosicionamentoMaquina a = new PosicionamentoMaquina(numeroFuncionarios,3);
		a.setFuncionarios(30);
		a.setFuncionarios(10);
		a.setFuncionarios(20);
		int tempo = a.CalculaTempo();
		a.CalculaAndar();
		assertEquals(100,tempo);
		assertEquals(1,(int)a.getMelhorAndar().get(0));
		assertEquals(2,(int)a.getMelhorAndar().get(1));
	}
	
	@Test
	public void test4() {
		ArrayList<Integer> numeroFuncionarios = new ArrayList<Integer>();
		PosicionamentoMaquina a = new PosicionamentoMaquina(numeroFuncionarios,5);
		a.setFuncionarios(80);
		a.setFuncionarios(50);
		a.setFuncionarios(10);
		a.setFuncionarios(5);
		a.setFuncionarios(15);
		int tempo = a.CalculaTempo();
		a.CalculaAndar();
		assertEquals(290,tempo);
		assertEquals(1,(int)a.getMelhorAndar().get(0));
		assertEquals(2,(int)a.getMelhorAndar().get(1));
	}

}
