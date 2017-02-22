import java.util.Collections;
import java.util.List;

public class Prioridade {
	
	/**
	 * @param List<Periferico>
	 * Lista de ordenacao por prioridade, 0 como prioridade máxima. Obs: esse alg nao leva em conta o tempo, apenas a prioridade;
	 * **/
	public static void ordenacaoPorPrioridade(List<Periferico> p){
		Collections.sort(p);
	}

}
