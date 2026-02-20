/*
Objetivo                    : Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/02/2026
*/

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class EstSeq_Lt1_02_ReajusteDeSalario
{
    public static void main(String args[])
    {
        
        double Salario, NovoSalario;
        
        Salario = Double.parseDouble(JOptionPane.showInputDialog("Digite um salário:"));
        NovoSalario = Salario * 1.15;
        DecimalFormat df = new DecimalFormat("0.00");
        JOptionPane.showMessageDialog(null, "Salário com reajuste: "+ df.format(NovoSalario));
    }
}