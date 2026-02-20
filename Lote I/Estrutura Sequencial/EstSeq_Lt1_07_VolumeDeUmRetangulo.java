/*
Objetivo                    : Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_07_VolumeDeUmRetangulo
{
    public static void main(String args[])
    {
        
        int comprimento, largura, altura;
        
        comprimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o comrpimento:"));
        largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura:"));
        altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura:"));
        
        JOptionPane.showMessageDialog(null, "O volume do paralelepipedo é igual à: "+(comprimento * largura * altura));
    }
}