import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
	
	private static Entrada perifericos = new Entrada();
	
	public static void main (String[] args){

		Scanner l = new Scanner(System.in);
		Saida s = new Saida();	
		int condicao = -1;
		
		do {
			
			menu();
			condicao = l.nextInt();
	
			if (condicao == 1){
				addPeriferico();
			}	
			else if(condicao == 2)	{
					List<Periferico> prioridade = copiarListaOriginal();
					List<Periferico> justica = copiarListaOriginal();
					List<Periferico> daisyChaining = copiarListaOriginal();
					
					System.out.println("\n");
					s.listaOriginal(perifericos.getPerifericos());
					System.out.println("\n");
					Prioridade.ordenacaoPorPrioridade(prioridade);
					s.saidaPrioridade(prioridade);
					System.out.println("\n");
					s.saidaJustiça(justica);
					System.out.println("\n");
					DaisyChaining.ordenacaoPorPrioridade(daisyChaining);
					s.saidaDaisyChainingBustGrant(daisyChaining);
					s.saidaDaisyChainingBustRequest(daisyChaining);
					System.out.println("\n");
			}
			else if (condicao == 0){
				
				System.exit(0);
				
			}
			
		} while (condicao != 0);
		
	}
	
	public static void menu (){
		
		System.out.println("Digite a opção desejada: ");
		System.out.println(" 1 - Add periferico a lista");
		System.out.println(" 2 - Exibir as 3 listas com as politicas de arbitragem");
		System.out.println(" 0 - Sair");
		
	}
	
	public static void addPeriferico(){
		
		Scanner leitura = new Scanner(System.in);
		
		Periferico p = new Periferico();;
		String aux1 = new String();;
		int aux2;
		char aux3;
			
			System.out.println("Digite o nome do periferico: "); 
			aux1 = leitura.nextLine();
			p.setNome(aux1);
			
			System.out.println("Digite a prioridade do periferico: Obs: 0 = prioridade máxima");
			aux2 = leitura.nextInt();
			p.setPrioridade(aux2);
			
			System.out.println("Digite o tempo em segundos para a execução do periferico: ");
			aux2 = leitura.nextInt();
			p.setTempo(aux2);
			
			System.out.println("Digite ''s'' caso o periferico tenha realizado uma solicitação \n ou digite ''n'' caso o contraio");
			aux3 = leitura.next().charAt(0);
			p.setSolicitacao(aux3 == 's' ? true : false);
			
			perifericos.addPeriferico(p);
			
		}
	
		public static List<Periferico> copiarListaOriginal (){
		
			List<Periferico> lista = new ArrayList<Periferico>();
			
			for (Periferico periferico : perifericos.getPerifericos() ) {
				
				Periferico aux = new Periferico();
				
				aux.setNome(periferico.getNome());
				aux.setPrioridade(periferico.getPrioridade());
				aux.setSolicitacao(periferico.isSolicitacao());
				aux.setTempo(periferico.getTempo());
				
				lista.add(aux);
			}
			
			return lista;
			
		}
	
	}
	