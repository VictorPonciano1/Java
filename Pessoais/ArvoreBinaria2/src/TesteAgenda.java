
public class TesteAgenda {

	public static void main(String[] args) {
		
		AgendaABB agenda = new AgendaABB();
	
		//ADICIONANDO CONTATOS
		agenda.adicionar(new Contato("Victor", "99243-4517"));
		agenda.adicionar(new Contato("Rian", "97180-0211"));
		agenda.adicionar(new Contato("João", "98824-2317"));
		agenda.adicionar(new Contato("Edgar", "94120-9951"));
		
		System.out.println("Lista de Contatos em ordem alfabética");
		agenda.listarContatos();
		
		System.out.println("\nProcurando por \"Rian\":");
		Contato c = agenda.buscar("Rian");
		if (c != null) {
			System.out.println("Encontrando: " + c);
		} else {
			System.out.println("Contato não encontrado!");
		}
	}
}
