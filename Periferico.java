public class Periferico implements Comparable<Periferico> {

	private String nome;
	
	private int prioridade;
	
	private int tempo; // em segundos;
	
	private boolean solicitacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public boolean isSolicitacao() {
		return solicitacao;
	}

	public void setSolicitacao(boolean solicitacao) {
		this.solicitacao = solicitacao;
	}

	@Override
	public int compareTo(Periferico p) {
		
		if (this.prioridade > p.getPrioridade()) return 1;
		if (this.prioridade < p.getPrioridade()) return -1;
		
		return 0;
	}
		
}