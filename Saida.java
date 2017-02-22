import java.util.List;

public class Saida {

	public void saidaPrioridade (List<Periferico> p){
		
		System.out.println(" - Lista de perifericos ordenada por prioridade - ");

		for (Periferico periferico : p) {
			
			System.out.println(p.indexOf(periferico)+" - Nome: " + periferico.getNome()+" - "+"Prioridade: "+periferico.getPrioridade());
		}
		
		System.out.println("O periferico atendido será: "+p.get(0).getNome()+"\npois tem maior prioridade");
	}
	
	public void saidaJustiça (List<Periferico> p){
		
		List<Periferico> aux = Justica.listaJustica(p);
		int cont = 0;
		
		System.out.println(" - Lista do atendimento dos perifericos pela politica de arbitragem justiça - \n - 5s para tempo de atendimento -");
		for (Periferico periferico : aux) {
			System.out.println(cont+" - Nome: " + periferico.getNome());
			cont += periferico.getTempo();
		}
		System.out.println("Tempo Total = "+cont+"s");
	}
	
	public void saidaDaisyChainingBustGrant (List<Periferico> p){
		System.out.println("- DAISY CHAINING -");
		System.out.println(" - Lista de perifericos ordenada por prioridade representando o bust grant - ");
		for (Periferico periferico : p) {
			System.out.println("Nome: " + periferico.getNome()+" - "+"Prioridade: "+periferico.getPrioridade()+" - Tempo: "+periferico.getTempo()+"s "+" - Bus request:"+((periferico.isSolicitacao() ? " Sim" : " Nao")));
		}
	}
	
	public void saidaDaisyChainingBustRequest (List<Periferico> p){		
		int tempoTotal = 0;
		System.out.println("- BUST REQUEST - ");
		for (Periferico periferico : p) {
				if (periferico.isSolicitacao()){
					tempoTotal += periferico.getTempo();
					System.out.println("Nome: " + periferico.getNome()+" - "+"Prioridade: "+periferico.getPrioridade()+" - Tempo: "+periferico.getTempo()+"s "+" - Bus request:"+((periferico.isSolicitacao() ? " Sim" : " Nao")));
				}
			}
		
		System.out.println("Tempo total = "+tempoTotal+"s" );
	}
	
	public void listaOriginal (List<Periferico> p){
		System.out.println(" - Lista de perifericos inserida pelo usuário - ");
		for (Periferico periferico : p) {
			System.out.println(p.indexOf(periferico)+" - Nome: " + periferico.getNome()+" - "+"Prioridade: "+periferico.getPrioridade()+" - Tempo: "+periferico.getTempo()+"s "+" - Solicitacao:"+((periferico.isSolicitacao() ? " Sim" : " Nao")));
		}
	}
	
}
