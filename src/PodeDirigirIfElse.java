import javax.swing.JOptionPane;

public class PodeDirigirIfElse {
	public static void main(String[] args) {
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Quantos anos voc� tem?"));
		//						String podeDirigir;
		//				if (idade >= 18) {
		//					podeDirigir = "Sim, voc� pode dirigir";
		//				}else {
		//					podeDirigir = "N�o, voc� n�o pode dirigir por enquanto";
		//				}
		String podeDirigir = (idade >= 18) ? "Sim, voc� pode dirigir" : "N�o, voc� n�o pode dirigir por enquanto";
		JOptionPane.showMessageDialog(null, podeDirigir);
	}
}
