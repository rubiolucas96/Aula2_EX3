
/*Criar uma aplicação em Java que tenha uma função recursiva que,
recebendo um número inteiro (N), apresente a saída da somatória*/

package View;

import Controller.Controller;

public class Principal {

	public static void main(String[] args) {
Controller soma = new Controller();
int n = 6;
double somas = soma.somas(n);
System.out.println(somas);

	}

}
