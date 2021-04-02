import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double salr,salarios,min;
		salr=1100;
		
		System.out.println("Digite o salario do funcionario");
		salarios=teclado.nextDouble();
		min= salarios/salr;
		
		System.out.printf("O salario do funcionario é %.2f%n de um salario minimo ", min);
		
		teclado.close();
	}

}
