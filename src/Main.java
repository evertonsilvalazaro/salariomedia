import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double salamin,salafunc,quantid;
		System.out.println("Digite o valor do salario minimo");
		salamin=teclado.nextDouble();
		
		System.out.println("Digite o salario do funcionario");
	    salafunc=teclado.nextDouble();
		
		quantid=salafunc/salamin;
	    
		System.out.println("o funcionário recebe " +quantid+ " salarios minimos");
		
		teclado.close();
	}

}
