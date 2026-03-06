/*
Programador                 : Ricardo Satoshi
Data de Desenvolvimento     : 05/03/2026
Objetivo                    : Calcula a Área do Triângulo 
                            Exemplo de Função

*/

import javax.swing.JOptionPane;

public class ModFunc_Lt2_Exemplo
{
    public static void main(String args[])
    {
        int Base , Altura;
        Base = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triângulo:"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triângulo:"));
        
        JOptionPane.showMessageDialog(null,"A área é " + FuncaoArea(Base,Altura));
   }

    static int FuncaoArea (int B , int H)
    {
        int AR = 0;
        AR = (B * H) / 2;
        return AR;
    }
}
