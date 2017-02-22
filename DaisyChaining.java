import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaisyChaining {
		
		/**
		 * @param List<Periferico>
		 * Lista de ordenacao por prioridade, 0 como prioridade máxima;
		 * representação da linha da bus grant.
		 * Algoritmo de ordenação timeSort;
		 * **/
		public static void ordenacaoPorPrioridade(List<Periferico> p){
			Collections.sort(p);
		}

		/**
		 * @param List<Periferico>
		 * Lista de perifericos que solicitaram atendimento ordenado por prioridade;
		 * **/
		public List<Periferico> listaAtendimentoSolicitacao (List<Periferico> p){
			
			ordenacaoPorPrioridade(p);
			
			List<Periferico> pSolicitacao = new ArrayList<Periferico>();
			
			for (Periferico periferico : p) {
				if (periferico.isSolicitacao()) pSolicitacao.add(periferico);
			}
			
			return pSolicitacao;
			
		}
		
		/**
		 * @param List<Periferico>
		 * Funcao com retorno do tempo total da solicitacao dos perifericos 
		 * **/
		
		public int tempoTotal (List<Periferico> p){
			
			List<Periferico> pSolicitacao = listaAtendimentoSolicitacao(p);
			int tempo = 0;
			
			for (Periferico periferico : pSolicitacao) {
				tempo += periferico.getTempo();
			}
			
			return tempo;
			
		} 
	
}
