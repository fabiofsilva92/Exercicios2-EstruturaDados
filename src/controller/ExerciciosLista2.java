package controller;

import javax.swing.JOptionPane;

public class ExerciciosLista2 {

	private char [] lista;
	private int auxTam;
	
	
	public ExerciciosLista2() {
		lista = new char [5];
		auxTam = 0;
	}
	
	//Verificar se lista esta vazia
	public boolean verLista() {
		int len = lista.length;
		int aux = 0;
		
		for(int i = 0; i<len; i++) {
			if(lista[i] == 0) {
				aux++;
			}
			else {
				System.out.println("Lista não esta vazia");
				i = len;
			}
		}
		if(aux == len) {
			System.out.println("Lista vazia");
			return true;
		}
		else {
			return false;
		}
	}
	
	//Verificar se lista está cheia
	public boolean verListaCheia() {
		int len = lista.length;
		int aux = 0;
		
		for(int i = 0; i<len; i++) {
			if(lista[i] != 0) {
				aux++;
			}
		}
		if (aux == len) {
			System.out.println("Lista cheia");
			return true;
		}
		else {
			System.out.println("Lista não esta cheia, temos " +(len-aux) + " posições." +len + aux);
			return false;
		}
	}
	
	//Adicionar no inicio
	public void addInicio() {
		char abc = getChar();
		if (auxTam < lista.length) {
			for(int i = auxTam; i>0; i--) {
				lista[i] = lista[i-1];
			}
			auxTam++;
			lista[0] = abc;
		}
		else {
			System.out.println("Lista cheia, não é possível adicionar no início.");
		}
		//System.out.println(auxTam);
		
	}
	//Adicionar no final
	public void addFinal() {
		char abc = getChar();
		
		if(auxTam < lista.length) {
			lista[auxTam] = abc;
			auxTam++;
		}
		else {
			System.out.println("Lista cheia, não é possível adicionar no final.");
		}
		
	}
	//Adicionar em qualquer posição
	public void addPosicao() {
		char abc = getChar();
		int pos = getPosition();
		
		if(auxTam < lista.length && pos>=0 && pos<=auxTam+1) {
			for(int i = lista.length-1; i!=pos; i--) {
					lista[i] = lista[i-1];
				}
			auxTam++;
			lista[pos] = abc;
		}
		else {
			System.out.println("Lista cheia, não é possível adicionar");
		}
	}
	

	
	//Remover do inicio da Lista
	public char removeInicio() {
		char removido = 0;
		if(auxTam > 0) {
			removido = lista[0];
			for(int i = 0; i<lista.length-1; i++) {
				lista[i] = lista[i+1];
			}
			lista[auxTam-1] = 0;
			auxTam--;
			return removido;
		}
		else {
			System.out.println("Não há elementos na lista");
			return removido;
		}
	}
	
	//Remover do final da Lista
	public char removeFinal() {
		char removido = 0;
		
		if(auxTam > 0) {
			removido = lista[auxTam-1];
			lista[auxTam-1] = 0;
			auxTam--;
			return removido;
		}
		else {
			System.out.println("Não há elementos na lista");
			return removido;
		}
	}
	
	//Remover qualquer posição da lista
	public char removePosicao() {
		char removido = 0;
		if(auxTam>0) {
			int pos = getPosition();
			removido = lista[pos];
			if(pos>=0 && pos<lista.length) {
				for(int i = pos; i<auxTam; i++) {
					lista[i] = lista[i+1];
				}
				lista[auxTam-1] = 0;
				auxTam--;
			}
			return removido;
		}
		else {
			System.out.println("Lista vazia!");
			return removido;
		}		
	}
	
	//Printar a lista
	public void printlista(){
		if (auxTam == 0) {
			System.out.println("Lista vazia!");
		}
		else {
			for (int i = 0; i<lista.length; i++) {
				if(lista[i] != 0) {
					System.out.print(lista[i]);
					System.out.print(" | ");
				}
			}
			System.out.println("");
		}

	}
	
	//Insere o caractere desejado.
	public char getChar() {
		String caractere = "";
		do {
			caractere = JOptionPane.showInputDialog("Digite um caractere: ");
		}while (caractere.length() > 1);
		
		char [] auxChar;
		auxChar = caractere.toCharArray();
		return auxChar[0];
	}
	
	//Posição de inserção ou remoção
	public int getPosition() {
		int position = 0;
		do {
		position = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição do vetor que deseja selecionar: \n "
				+ "obs: Escolha uma posição entre a 1ª e a " +(auxTam) + "ª posição"));
		}while (position>auxTam+1);
		return position-1;
	}
	
}
