import java.util.ArrayList;
import java.util.List;

public class Entrada {

	private List<Periferico> perifericos = new ArrayList<Periferico>();
	
	public void addPeriferico (Periferico periferico){
		this.perifericos.add(periferico);
	}

	public List<Periferico> getPerifericos() {
		return perifericos;
	}
	
}
