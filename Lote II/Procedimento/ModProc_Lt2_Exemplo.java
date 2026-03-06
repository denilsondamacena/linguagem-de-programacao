/*
Programador                  : Ricardo Satoshi
Data De Desenvolvimento      : 05/03/2026
Objetivo                     : Calcula o salário a receber a partir do salário bruto e desconto
                             Exemplo de Procedimento

*/
import javax.swing.JOptionPane;

public class ModProc_Lt2_Exemplo 
{
    static Double SalarioBruto , SalarioLiquido;
    
    public static void main ( String args[ ] ) 
    {
        SalarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário bruto:"));
        ProcedureSalario();
        
        JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SalarioLiquido);
  } 
	  

static void ProcedureSalario ( )
    {
        Double Desconto; 
      
        if (SalarioBruto < 500)
        {
            Desconto = 0.0 ;
        }
        else if (SalarioBruto >= 500 && SalarioBruto < 800)
        {
            Desconto = 0.05;
        }
        else if (SalarioBruto >= 800 && SalarioBruto < 1200)
        {
            Desconto = 0.10;
        }
	else
        {
	    Desconto = 0.15;  
        }
	  
        SalarioLiquido = (SalarioBruto - (SalarioBruto * Desconto));
    } 

} 
