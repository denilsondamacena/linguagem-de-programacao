import javax.swing.JOptionPane;

public class ClasseMetodos
{
    public Estatistica[] FCADASTRAESTATISTICA(Estatistica[] estatistica)
    {
        int i;

        for (i = 0; i < 10; i++)
        {
            estatistica[i] = new Estatistica();

            estatistica[i].codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código:"));
            estatistica[i].nome = JOptionPane.showInputDialog("Digite o nome da cidade:");
            estatistica[i].quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes:"));
        }

        return estatistica;
    }

    public void PQTDACIDENTES(Estatistica[] estatistica)
    {
        int i;
        String resultado = "";

        for (i = 0; i < 10; i++)
        {
            if (estatistica[i].quantidade > 100 && estatistica[i].quantidade < 500)
            {
                resultado = resultado
                        + "Código: " + estatistica[i].codigo
                        + "\nNome: " + estatistica[i].nome
                        + "\nQuantidade: " + estatistica[i].quantidade
                        + "\n\n";
            }
        }

        if (resultado.equals(""))
        {
            resultado = "Nenhuma cidade com quantidade de acidentes > 100 e < 500.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }

    public void PMAIORMENOR(Estatistica[] estatistica)
    {
        int i;
        int maior;
        int menor;
        String resultado = "";

        maior = estatistica[0].quantidade;
        menor = estatistica[0].quantidade;

        for (i = 0; i < 10; i++)
        {
            if (estatistica[i].quantidade > maior)
            {
                maior = estatistica[i].quantidade;
            }

            if (estatistica[i].quantidade < menor)
            {
                menor = estatistica[i].quantidade;
            }
        }

        resultado = "Menor número de acidentes: " + menor
                + "\nMaior número de acidentes: " + maior;

        JOptionPane.showMessageDialog(null, resultado);
    }

    public void PACIMA(Estatistica[] estatistica)
    {
        int i;
        double media = 0;
        String resultado = "";

        for (i = 0; i < 10; i++)
        {
            media = media + estatistica[i].quantidade;
        }

        media = media / 10;

        for (i = 0; i < 10; i++)
        {
            if (estatistica[i].quantidade > media)
            {
                resultado = resultado
                        + "Código: " + estatistica[i].codigo
                        + "\nNome: " + estatistica[i].nome
                        + "\nQuantidade: " + estatistica[i].quantidade
                        + "\n\n";
            }
        }

        if (resultado.equals(""))
        {
            resultado = "Nenhuma cidade acima da média.";
        }
        else
        {
            resultado = "Média das 10 cidades: " + media + "\n\n" + resultado;
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}