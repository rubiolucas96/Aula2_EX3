
/*Criar uma aplica��o em Java que tenha uma fun��o recursiva que,
recebendo um n�mero inteiro (N), apresente a sa�da da somat�ria*/

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
