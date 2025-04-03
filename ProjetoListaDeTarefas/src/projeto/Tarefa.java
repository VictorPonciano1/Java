package projeto;

public class Tarefa {

		private String tarefa;
		private int indiceRemover;
		
		public Tarefa(String tarefinha, int iRemover) {
			this.tarefa = tarefinha;
			this.indiceRemover = iRemover;
		}
		
		public String getTarefa() {
			return tarefa;
		}
		
		public int getIndiceRemover() {
			return indiceRemover;
		}
}
