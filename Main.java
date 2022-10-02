package lab;

// Alunos 
// Matheus Fernande 
// Caique Brambilla
// Arthur Nakaya

public class Main {
	
	public static void main(String[] args) {
		
		TadFila radio = new TadFila(8640);
		
		
		
		
		System.out.println("===============================================");
		System.out.println("\nSegue a Lista de Musicas do dia");
		System.out.println("\n===============================================");
		
		
		radio.buscarDia(2);
		System.out.println(radio.getQuantidade());
	
		
		
	
		
	}
}
