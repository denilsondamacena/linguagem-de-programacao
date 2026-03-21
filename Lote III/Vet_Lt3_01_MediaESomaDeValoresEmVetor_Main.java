/*
Objetivo                    : Criar e coletar um vetor [50] inteiro. Calcular e exibir:
                                a) A média dos valores entre 10 e 200;
                                b) A soma dos números ímpares.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/03/2026
*/

import javax.swing.JOptionPane;

public class Vet_Lt3_01_MediaESomaDeValoresEmVetor_Main 
{
    public static void main(String args[]) 
    {
        Vet_Lt3_01_MediaESomaDeValoresEmVetor_Meth m = new Vet_Lt3_01_MediaESomaDeValoresEmVetor_Meth();
        int opcao = 0;
        int dados[] = new int[50];
        String resultado = "";

        while (opcao != 9) 
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Inserir valores\n2 - Calcular dados\n3 - Exibir resultado\n9 - Encerrar"));
            switch (opcao) 
            {
                case 1:
                        dados = m.preencherVetor(dados);
                        break;
                case 2:
                        resultado = m.processarValores(dados);
                        JOptionPane.showMessageDialog(null, "Cálculo realizado!");
                        break;
                case 3:
                        JOptionPane.showMessageDialog(null, resultado);
                        break;
                case 9:
                        JOptionPane.showMessageDialog(null, "Programa finalizado.");
                        System.exit(0);
                        break;
                default:
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}