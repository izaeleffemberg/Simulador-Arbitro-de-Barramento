import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Justica {

	
	/**
	 * @param List<Periferico>
	 * Funcao com retorno do tempo total da solicitacao dos perifericos 
	 * **/
	
	public static int tempoTotal (List<Periferico> p){
		
		int tempo = 0;
		
		for (Periferico periferico : p) {
			tempo += periferico.getTempo();
		}
		
		return tempo;
		
	}
	
	
	// Justiça de 5s.
	public static List<Periferico> listaJustica (List<Periferico> p){
		
		List<Periferico> aux = new ArrayList<Periferico>();
		Periferico auxP;
		
		while(tempoTotal(p) != 0){
			
			for (Periferico periferico : p) {
				
				if (periferico.getTempo() >= 5){
					
					auxP = new Periferico();
					auxP.setNome(periferico.getNome());
					auxP.setTempo(5);
					
					periferico.setTempo(periferico.getTempo()-5);
					aux.add(auxP);
				}
				else if (periferico.getTempo() < 5 && periferico.getTempo() > 0){
					
					auxP = new Periferico();
					auxP.setNome(periferico.getNome());
					auxP.setTempo(periferico.getTempo());
					
					periferico.setTempo(0);
					aux.add(auxP);
				}
			}
		}
		
		return aux;
		
	}
}