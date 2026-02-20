/*
Objetivo                    : Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_01_AreaDeUmQuadrado 
{
        public static void main(String args[])
        {
            int lado, area;
        
            lado= Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado:"));
            area = (lado * lado);
        
            JOptionPane.showMessageDialog(null,"Área do quadrado: " + area);
        }
}