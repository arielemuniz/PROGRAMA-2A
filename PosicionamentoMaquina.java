import java.util.ArrayList;

public class PosicionamentoMaquina {
	
	private ArrayList <Integer> funcionarios = new ArrayList<Integer>();
	private ArrayList <Integer> listaSoma = new ArrayList<Integer>();
	private ArrayList <Integer> melhorAndar = new ArrayList<Integer>();
	private int N;
	private int menor;
	
	public PosicionamentoMaquina(ArrayList<Integer> funcionarios, int N) {
		this.funcionarios = funcionarios;
		this.N = N;
	}
	
	public int CalculaTempo() {
		int soma = 0;
		int mult = 0;
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				mult = i-j;
				if(mult < 0){
					mult = mult * -1;
				}
				soma+= (funcionarios.get(j)*(mult*2));
			}
			listaSoma.add(soma);
			soma = 0;
		}
		//calcula o menor
		menor = 0;
		for(int i = 0; i < N-1; i++) {
			if(listaSoma.get(i) > listaSoma.get(i+1)) {
				menor = i+1;
			}
		}
		return listaSoma.get(menor);
	}
	
	public ArrayList<Integer> CalculaAndar() {
		for(int i = 0; i < N; i++) {
			if(listaSoma.get(i).equals(listaSoma.get(menor))) {
				melhorAndar.add(i+1);
			}
		}
		return melhorAndar;
	}
	
	public void setFuncionarios(int quantidade) {
		this.funcionarios.add(quantidade);
	}
	
	public ArrayList<Integer> getMelhorAndar(){
		return this.melhorAndar;
	}
}
