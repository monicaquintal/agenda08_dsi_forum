package forum_dsi_agenda08;

import javax.swing.JOptionPane;

public class Forum_dsi_agenda08 {
    
    public static void main(String[] args) {
        // declaração de variáveis
        String nome;
        int idade;
        int contador = 0;
        int total = 0;
  
       while (contador <= 10) { // início do laço de repetição "enquanto"
       
        // entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome:");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade:"));
        
        // início do laço de repetição "se"
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Maior de idade.");
            total++;
        } else { // "senão"
            JOptionPane.showMessageDialog(null, "Menor de idade.");
        } // fim "se" e "senão"
        contador++; // incremento contador
     } // fim "enquanto"
       
       // processamento (total de maiores de idade)
       JOptionPane.showMessageDialog(null, "O total de maiores de idade é de: " + total + " pessoas."); 
       
   } // fim método
} // fim classe
