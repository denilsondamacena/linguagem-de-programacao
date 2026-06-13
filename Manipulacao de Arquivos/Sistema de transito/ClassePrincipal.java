/*
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 19/04/2026
*/

import javax.swing.JOptionPane;

public class ClassePrincipal
{
    public static void main(String args[])
    {
        int i;
        int opcao;
        Estatistica[] estatistica = new Estatistica[10];
        ClasseMetodos m = new ClasseMetodos();

        for (i = 0; i < 10; i++)
        {
            estatistica[i] = new Estatistica();
        }

        do
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                    "MENU ESTATÍSTICA\n"
                    + "Estatísticas de acidentes em 2026\n\n"
                    + "1 - Cadastro Estatística\n"
                    + "2 - Consulta por quantidade de acidentes\n"
                    + "3 - Consulta por estatísticas de acidentes\n"
                    + "4 - Acidentes acima da média das 10 cidades\n"
                    + "9 - Finaliza"));

            switch (opcao)
            {
                case 1:
                    estatistica = m.FCADASTRAESTATISTICA(estatistica);
                    break;

                case 2:
                    m.PQTDACIDENTES(estatistica);
                    break;

                case 3:
                    m.PMAIORMENOR(estatistica);
                    break;

                case 4:
                    m.PACIMA(estatistica);
                    break;

                case 9:
                    JOptionPane.showMessageDialog(null, "Programa finalizado.");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
                    break;
            }

        } while (opcao != 9);
    }
}