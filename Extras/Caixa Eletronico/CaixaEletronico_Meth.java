import javax.swing.JOptionPane;

public class CaixaEletronico_Meth
{
    double matrizEstatisticas[][] = new double[4][4];
    String vetorNomesBancos[] = new String[] {"[Banco do Brasil]", "[Santander]", "[Itaú]", "[Caixa]"};
    int contadorRetiradas = 0;

    public int[] carregarNotas(int vetorQuantidadeNotas[])
    {
        for (int i = 0; i <= 5; i++)
        {
            vetorQuantidadeNotas[i] = 100;
        }

        JOptionPane.showMessageDialog(null, "Notas carregadas com sucesso!");
        return vetorQuantidadeNotas;
    }

    public int[] retirarNotas(int vetorQuantidadeNotas[], int vetorValoresNotas[])
    {
        int quantidadeNotasSolicitadas;
        int codigoBanco;
        int somaSaque = 0;
        int sobraCaixa = 0;

        if (contadorRetiradas >= 100)
        {
            JOptionPane.showMessageDialog(null, "Limite de 100 retiradas atingido!");
            return vetorQuantidadeNotas;
        }

        for (int i = 0; i <= 5; i++)
        {
            sobraCaixa += vetorValoresNotas[i] * vetorQuantidadeNotas[i];
        }

        if (sobraCaixa <= 0)
        {
            JOptionPane.showMessageDialog(null, "Não há mais notas no caixa!");
            return vetorQuantidadeNotas;
        }

        do
        {
            codigoBanco = Integer.parseInt(JOptionPane.showInputDialog(
                    "Informe seu banco:\n" +
                    "[1]" + vetorNomesBancos[0] + "\n" +
                    "[2]" + vetorNomesBancos[1] + "\n" +
                    "[3]" + vetorNomesBancos[2] + "\n" +
                    "[4]" + vetorNomesBancos[3]));
            codigoBanco--;
        }
        while (codigoBanco < 0 || codigoBanco > 3);

        if (vetorQuantidadeNotas[2] >= 2 && vetorQuantidadeNotas[3] >= 1)
        {
            int opcaoDezOuVinte = Integer.parseInt(JOptionPane.showInputDialog(
                    "[1] 2 x Nota de R$10\n" +
                    "[2] 1 x Nota de R$20"));

            if (opcaoDezOuVinte == 1)
            {
                vetorQuantidadeNotas[2] -= 2;
                somaSaque += vetorValoresNotas[2] * 2;
            }
            else
            {
                vetorQuantidadeNotas[3]--;
                somaSaque += vetorValoresNotas[3];
            }
        }

        for (int indiceNota = 5; indiceNota >= 0; indiceNota--)
        {
            if (vetorQuantidadeNotas[indiceNota] >= 1)
            {
                do
                {
                    quantidadeNotasSolicitadas = Integer.parseInt(JOptionPane.showInputDialog(
                            "Quantas notas de R$" + vetorValoresNotas[indiceNota] + ",00?\n" +
                            "Disponível: " + vetorQuantidadeNotas[indiceNota] + "x notas."));

                    if (quantidadeNotasSolicitadas > vetorQuantidadeNotas[indiceNota])
                    {
                        JOptionPane.showMessageDialog(null, "EXCEDEU O LIMITE DO CAIXA");
                    }
                }
                while (quantidadeNotasSolicitadas > vetorQuantidadeNotas[indiceNota] || quantidadeNotasSolicitadas < 0);

                vetorQuantidadeNotas[indiceNota] -= quantidadeNotasSolicitadas;
                somaSaque += vetorValoresNotas[indiceNota] * quantidadeNotasSolicitadas;

                int opcaoContinuar = Integer.parseInt(JOptionPane.showInputDialog(
                        "Deseja continuar?\n" +
                        "[1] Sim\n" +
                        "[2] Não"));

                if (opcaoContinuar == 2)
                {
                    break;
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Caixa sem notas de R$" + vetorValoresNotas[indiceNota] + ",00!");
            }
        }

        if (somaSaque > 0)
        {
            calcularEstatisticas(codigoBanco, somaSaque);
            contadorRetiradas++;
            JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!\nValor sacado: R$" + somaSaque + ",00");
        }

        return vetorQuantidadeNotas;
    }

    public void limparMatrizEstatisticas(int quantidadeLinhas, int quantidadeColunas)
    {
        for (int linha = 0; linha <= quantidadeLinhas; linha++)
        {
            for (int coluna = 0; coluna <= quantidadeColunas; coluna++)
            {
                matrizEstatisticas[linha][coluna] = 0;
            }
        }
    }

    public void calcularEstatisticas(int banco, int valorSaque)
    {
        if (matrizEstatisticas[banco][2] == 0)
        {
            matrizEstatisticas[banco][0] = valorSaque;
        }

        if (matrizEstatisticas[banco][0] > valorSaque)
        {
            matrizEstatisticas[banco][0] = valorSaque;
        }

        if (matrizEstatisticas[banco][1] < valorSaque)
        {
            matrizEstatisticas[banco][1] = valorSaque;
        }

        matrizEstatisticas[banco][2]++;
        matrizEstatisticas[banco][3] += valorSaque;
    }

    public void mostrarEstatisticas(int vetorValoresNotas[], int vetorQuantidadeNotas[])
    {
        String textoEstatisticas = "Banco | Menor Saque | Maior Saque | Média dos Saques | Valor Total dos Saques\n";
        int sobraCaixa = 0;

        for (int linha = 0; linha <= 3; linha++)
        {
            textoEstatisticas += vetorNomesBancos[linha];

            for (int coluna = 0; coluna <= 3; coluna++)
            {
                if (coluna == 2)
                {
                    if (matrizEstatisticas[linha][2] == 0)
                    {
                        textoEstatisticas += " R$0.0";
                    }
                    else
                    {
                        textoEstatisticas += " R$" + (matrizEstatisticas[linha][3] / matrizEstatisticas[linha][2]);
                    }
                }
                else
                {
                    textoEstatisticas += " R$" + matrizEstatisticas[linha][coluna];
                }
            }

            textoEstatisticas += "\n";
        }

        textoEstatisticas += "Sobra do Caixa: ";

        for (int i = 0; i <= 5; i++)
        {
            sobraCaixa += (vetorValoresNotas[i] * vetorQuantidadeNotas[i]);
        }

        textoEstatisticas += sobraCaixa + ",00";

        JOptionPane.showMessageDialog(null, textoEstatisticas);
    }
}