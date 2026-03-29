/*
Objetivo                    : Criar um menu de opções:

                                Menu Principal 
                                    1 – Carregar Notas 
                                    2 – Retirar Notas 
                                    3 – Estatística 
                                    9 – Fim

                                a) Carregar a quantidade de notas em uma área da memória com 6 ocorrências.
                                b) Solicitar que o cliente faça a retirada de valores obedecendo ao critério do maior pelo menor.
                                c) Dar a opção para o cliente escolher o valor e a quantidade de notas.
                                    Exemplo: 1 x 20, 2 x 10
                                d) Caso não tenha o valor da maior cédula, disponibilizar a próxima.
                                e) Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem **“EXCEDEU O LIMITE DO CAIXA”. **
                                f) Solicitar até 100 retiradas ou até não haver mais notas.
                                g) No momento da solicitação do valor, coletar também o código do banco que o cliente tem conta, segundo:
                                    Código	1	2	3	4
                                    Banco	Banco do Brasil	Santander	Itaú	Caixa
                                h) No final, exibir a estatística, separada por bancos, com:
                                    1) O maior e o menor valor sacado; 
                                    2) A média dos saques; 
                                    3) Valor total dos saques; 
                                    4) Valor das sobras dos caixas.
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 28/03/2026
*/

import javax.swing.JOptionPane;

public class CaixaEletronico_Main
{
    public static void main(String args[])
    {
        CaixaEletronico_Meth m = new CaixaEletronico_Meth();

        int vetorValoresNotas[] = new int[] {2, 5, 10, 20, 50, 100};
        int vetorQuantidadeNotas[] = new int[6];
        int opcao;

        m.limparMatrizEstatisticas(3, 3);

        do
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "Menu Principal\n" +
                    "[1] Carregar Notas\n" +
                    "[2] Retirar Notas\n" +
                    "[3] Estatísticas\n" +
                    "[9] Fim"));

            switch (opcao)
            {
                case 1:
                    vetorQuantidadeNotas = m.carregarNotas(vetorQuantidadeNotas);
                    break;

                case 2:
                    vetorQuantidadeNotas = m.retirarNotas(vetorQuantidadeNotas, vetorValoresNotas);
                    break;

                case 3:
                    m.mostrarEstatisticas(vetorValoresNotas, vetorQuantidadeNotas);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Fim!");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        }
        while (opcao != 9);
    }
}