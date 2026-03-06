/*
Objetivo                    : Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 05/03/2026
*/

import javax.swing.JOptionPane;

public class ModProc_Lt2_27_CalculoDeVelocidadeMedia
{
    static Integer Voltas, Metros;
    static double Tempo;
    static String Resultado;

    public static void main(String args[])
    {
        Voltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas:"));
        Metros = Integer.parseInt(JOptionPane.showInputDialog("Digite a extensão do circuito (metros):"));
        Tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração:"));

        CalculoVelocidade();

        JOptionPane.showMessageDialog(null, Resultado);
    }

    static void CalculoVelocidade()
    {
        double distanciaKm = (Metros * Voltas) / 1000.0;
        double tempoHoras = Tempo / 60.0;
        double velocidadeMedia = distanciaKm / tempoHoras;

        Resultado = "A velocidade média desse circuito foi de " + velocidadeMedia + " km/h.";
    }
}