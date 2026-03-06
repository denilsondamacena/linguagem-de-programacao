/*
Objetivo                    : Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_17_CalculoDeCombustivel
{
    static double Tempo;
    static double Velocidade;
    
    static double Distancia;
    static double LitrosGastos;

    public static void main(String args[])
    {
        Tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de percurso:"));
        Velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média:"));
       
        CalculoLitros();
        
        JOptionPane.showMessageDialog(null, "Quantidade de combustível necessário: " + LitrosGastos);
    }
   
    static void CalculoLitros()
    {
        Distancia = Tempo * Velocidade;
        LitrosGastos = Distancia / 12;
    }
}