import java.util.Scanner;

//import javax.swing.JOptionPane;

public class ExerciciosSemana3 {
	public static void main(String[] args) {
		//		exercicio 1:
		//		double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salario"));
		//		if (salario < 1045) {
		//			JOptionPane.showMessageDialog(null, "Voce recebe menos que um Salário minimo. ");
		//		} 
		//		else {
		//			JOptionPane.showMessageDialog(null, "Voce recebe mais que um Salário minimo. ");
		//		}

		try (//      exercicio 2:
				Scanner leitor = new Scanner (System.in)) {
			System.out.println("Qual a sua idade? ");
			int idade = leitor.nextInt();
			//		if (idade >= 18) {
			//			System.out.println("Maior de idade.");
			//		} else {
			//		System.out.println("Menor de idade.");
			//		}
			String resposta = (idade >= 18) ? "Maior de Idade" : "Menor de Idade";
			System.out.println(resposta);
		}
	}
}