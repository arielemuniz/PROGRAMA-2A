import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	 public static void main(String[] args) {
		 
		  ArrayList<Integer> numeroFuncionarios = new ArrayList<Integer>();
		  Scanner ler = new Scanner(System.in);
		  int N;
		  N = ler.nextInt();
		  PosicionamentoMaquina a = new PosicionamentoMaquina(numeroFuncionarios,N);
		  for(int i=0; i<N; i++) {
			  int numero = ler.nextInt();
			  a.setFuncionarios(numero);
		  }
		  int tempo = a.CalculaTempo();
		  a.CalculaAndar();
		  System.out.printf("%d\n",tempo);
		  for(int i = 0; i < a.getMelhorAndar().size(); i++) {
			  System.out.printf("%d ", a.getMelhorAndar().get(i));
		  }
	 }
}
