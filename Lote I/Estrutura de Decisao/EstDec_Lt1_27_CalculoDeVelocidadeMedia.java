/*
Objetivo                    : Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_27_CalculoDeVelocidadeMedia
{
    public static void main(String args[])
    {
        
        int voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas:"));
        int metros = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito (metros):"));
        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração:"));
        
        JOptionPane.showMessageDialog(null,"A velocidade média é de: "+(((metros * voltas) / (tempo * 60))*3.6) + "KM/h.");
    }
}