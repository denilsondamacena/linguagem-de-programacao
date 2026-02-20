/*
Objetivo                    : Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_13_CalculoDeDuracaoDeAlimentos
{
    public static void main(String args[])
    {
        
        int kg;
        
        kg = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimentos em quilogramas:"));
        JOptionPane.showMessageDialog(null,kg+"kg durará " + ((kg * 1000) / 50)+ " dias.");
    }
}