/*
Objetivo                    : Serie1 = (1+2+3+...+100)
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 12/03/2026
*/

import javax.swing.JOptionPane;

public class Rec_Serie_01
{
    public static void main(String args[])
    {
        int ValorInicio = 1;
        JOptionPane.showMessageDialog(null, "O resultado da série 1 é: " + FuncRecSoma(ValorInicio));  
    }
    
    static int FuncRecSoma(int Valor)
    {
      if (Valor == 100)
      {
          return 100;
      }
      else
      {
          return Valor + FuncRecSoma(Valor + 1);
      }
    }
}