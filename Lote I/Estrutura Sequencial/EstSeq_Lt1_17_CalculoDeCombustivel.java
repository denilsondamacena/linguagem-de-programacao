/*
Objetivo                    : Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_17_CalculoDeCombustivel
{
    public static void main(String args[])
    {
        
        int tempo, velocidade;
        
        tempo = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso:"));
        velocidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade média:"));
        
        JOptionPane.showMessageDialog(null,"Quantidade de combustível necessário: "+((tempo *  velocidade) / 12)+ " litros.");
    }
}