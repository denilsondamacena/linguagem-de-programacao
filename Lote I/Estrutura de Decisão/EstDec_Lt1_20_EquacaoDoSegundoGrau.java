/*
Objetivo                    : Receba 3 coeficientes A, B e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/02/2026
*/

import javax.swing.JOptionPane;

public class EstDec_Lt1_20_EquacaoDoSegundoGrau
{
    public static void main(String args[])
    {
        
        int A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A:"));
        int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B:"));
        int C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C:"));
        
        int delta = ((B*B)-4*A*C);
        
        if (delta > 0)
        {
            JOptionPane.showMessageDialog(null,"Existem duas raízes, são elas:"+ ((-B)+Math.sqrt(delta) / 2 * A) + " e " + ((-B)-Math.sqrt(delta) / 2 * A));
        }
        else if ( delta == 0)
        {
            JOptionPane.showMessageDialog(null, "Existe uma raíz: " + ((-B)+Math.sqrt(delta) / 2 * A));
        }
        else 
        {
            JOptionPane.showMessageDialog(null,"Não existem raízes.");
        }
    }
}