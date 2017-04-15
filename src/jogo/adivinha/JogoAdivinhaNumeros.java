package jogo.adivinha;

import javax.swing.JOptionPane;

public class JogoAdivinhaNumeros {
	
 public static void main(String[] args) {	
	
	int tentativas = 0;
	int gerado = (int)(Math.random() * 100);
	int fornecido = 0;
	int max = 100, min = 0;
	
	do {
		tentativas++;
		
		fornecido = Integer.parseInt(
				JOptionPane
				.showInputDialog("Fornecer um numero entre "+min+" e "+max));
		
		if(fornecido < min || fornecido > max){
			continue;
		}
		
		if(fornecido > gerado){
			JOptionPane.showMessageDialog(null, "O número deve ser menor");
			max = fornecido-1;
		}else if(fornecido < gerado){
			JOptionPane.showMessageDialog(null, "O número deve ser maior");
			min = fornecido+1; 
		}
	} while(gerado != fornecido);
	
	JOptionPane.showMessageDialog(null, "Você acertou em " + 
				tentativas + " tentativas");
	}
}
