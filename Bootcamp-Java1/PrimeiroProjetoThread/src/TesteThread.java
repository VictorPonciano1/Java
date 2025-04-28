
public class TesteThread {

	static int i = 0;
	
	//METODO MAIN
	public static void main(String[] args) {
		
		//CHAMADA - SEMPRE INICIALIZAR AS THREADS
		new Thread(t1).start();
		new Thread(t2).start();
	}
	
	//METODO CONTADOR
	private static void contador(String name) {
		i++;
		System.out.println("Valor do contador atual: " + i + " na Thread: " + name);
	}

	//RUNNABLE 1 - "PRIMEIRA THREAD"
	private static Runnable t1 = new Runnable() {
		public void run() {
			try {
				for(int i = 0; i < 5; i++) {
					contador("t1");
				}
			} catch (Exception e) {}
		}
	};
	
	//RUNNABLE 2 - "SEGUNDA THREAD"
	private static Runnable t2 = new Runnable() {
		public void run() {
			try {
				
				for(int i = 0; i < 5; i++) {
					contador("t2");
				}
				
			} catch (Exception e) {}
		}
	};

}