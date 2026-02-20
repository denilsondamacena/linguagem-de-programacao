/*
Objetivo                    : Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 14/02/2026
*/

import javax.swing.JOptionPane;

public class EstSeq_Lt1_06_TrocaDeValores
{
    public static void main(String args[])
    {
        
        int x, y, aux;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X:"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Y:"));
        
        aux = x;
        x = y;
        y = aux;
        
        JOptionPane.showMessageDialog(null,"X= "+x+" e Y= "+y);
    }
}