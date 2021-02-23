package view;

import javax.swing.JOptionPane;

import controller.ExerciciosLista2;

public class Principal {

	public static void main(String[] args) {
		
		ExerciciosLista2 op = new ExerciciosLista2();
		
		int opc = 0;
		
		do {
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar no inicio da lista \n"
					+ "2 - Adicionar ao final da lista \n"
					+ "3 - Adicionar em uma posição específica \n"
					+ "4 - Remover do inicio da lista \n"
					+ "5 - Remover do final da lista \n"
					+ "6 - Remover de uma posição específica \n"
					+ "7 - Verificar se a lista esta vazia \n"
					+ "8 - Verificar se a lista esta cheia \n"
					+ "9 - Print da lista \n"
					+ "10 - Percorre a lista \n"
					+ "0 - Finaliza aplicação"));
			
			switch(opc) {
			case 1: op.addInicio();
			op.printlista();
			break;
			case 2: op.addFinal();
			op.printlista();
			break;
			case 3: op.addPosicao();
			op.printlista();
			break;
			case 4: char verif = op.removeInicio();
			if(verif != 0) {
				System.out.println("Elemento deletado: " +verif);
			}	
			op.printlista();
			break;
			case 5: verif = op.removeFinal();
					if (verif != 0) {
						System.out.println("Elemento deletado: " +verif);
					}				
					op.printlista();
			break;
			case 6: verif = op.removePosicao();
					if (verif != 0) {
						System.out.println("Elemento deletado: " +verif);
					}	
					op.printlista();
			break;
			case 7: op.verLista();
			op.printlista();
			break;
			case 8: op.verListaCheia();
			op.printlista();
			break;
			case 9: op.printlista();
			break;
			case 10: System.out.println("String concatenada: " +op.percorre());
			break;
			case 0: JOptionPane.showMessageDialog(null, "Obrigado por utilizar a aplicação.");
			break;

			
			default: JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		}while(opc!=0);
		
		
	}

}
