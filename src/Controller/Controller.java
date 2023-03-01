package Controller;

public class Controller {

	public Controller() {
		super();
	
	}
	public double somas (int n) {
		if (n == 1) {
			return 1;
			//condição de parada foi definida caso o n for igual a  1//
		}
		else {
			double x = 1 /(double)n;
			n = n - 1;
			return  somas(n) + x;
			 //Caso o n for maior que zero, fazer o x dividir pelo valor de n e n menos um //
			
		}
	}

}
