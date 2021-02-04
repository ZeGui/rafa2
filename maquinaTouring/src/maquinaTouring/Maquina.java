package maquinaTouring;

import java.util.Scanner;

public class Maquina {
	
	int cont;
	char fita [];
	
	public static void main (String args[]) {
		Maquina maq = new Maquina();
		Scanner scan = new Scanner(System.in);
		String palavra;
		System.out.println("Entre");
		palavra = scan.nextLine();
		maq.iniciar(palavra);
	}
	
	public void iniciar (String sentenca) {
		cont = 0;
		fita = sentenca.toCharArray();
		q0();
	}
		public void q0() {
			if (cont < fita.length) {
				if(fita[cont] == 'T') {
				fita[cont] = 'T';
				cont++;
				q4();
			}			
				else if(fita[cont] == 'B') {
				fita[cont] = 'B';
				cont++;
				q3();
			}
				else if(fita[cont] == 'a') {
				fita[cont] = 'A';
				cont++;
				q1();
			}
				else 
			{
				qerro();
			}
			
			
		}
	}
		public void q1() {
			if (cont < fita.length) {
				if(fita[cont] == 'a') {
				fita[cont] = 'a';
				cont++;
				q1();
			}			
				else if(fita[cont] == 'B') {
				fita[cont] = 'B';
				cont++;
				q1();
			}
				else if(fita[cont] == 'b') {
				fita[cont] = 'B';
				cont--;
				q2();
			}
				else 
			{
				qerro();
			}
			
			
		}
		}
		public void q2() {
			if (cont < fita.length) {
				if(fita[cont] == 'a') {
				fita[cont] = 'a';
				cont--;
				q2();
			}			
				else if(fita[cont] == 'B') {
				fita[cont] = 'B';
				cont--;
				q2();
			}
				else if(fita[cont] == 'A') {
				fita[cont] = 'A';
				cont++;
				q0();
			}
				else 
			{
				qerro();
			}
			
			
		}
		}
		public void q3() {
			if (cont < fita.length) {
				if(fita[cont] == 'B') {
				fita[cont] = 'B';
				cont++;
				q3();
			}			
				else if(fita[cont] == 'T') {
				fita[cont] = 'T';
				cont++;
				q4();
			}
				else 
			{
				qerro();
			}
			
			
		}
		}
		public void q4() {
			String palavra = "";
			for (int i = 0; i < fita.length; i++) {
				palavra = palavra + fita[i];
			}
			System.err.println("Palavra aceita: " + palavra);
		}
		public void qerro() {
			String palavra = "";
			for (int i = 0; i < fita.length; i++) {
				palavra = palavra + fita[i];
			}
			System.err.println("palavra nao aceita" + palavra);
		}
		
	

}
