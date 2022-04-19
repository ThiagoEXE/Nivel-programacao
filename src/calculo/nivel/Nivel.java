package calculo.nivel;

import java.util.Scanner;

public class Nivel {
	
	int exp;
	int nivel = 0;
	
	public Nivel(int exp) {

		while (true) {

            this.exp =exp;
			System.out.println("Digite a quantidade de horas estudadas:");
			Scanner sc =new Scanner(System.in);
			int valor = sc.nextInt();;
			
			if (valor >= 10) {
				nivel++;
			}
			System.out.println("Você está no nível: " + nivel );
		}
	}

}
