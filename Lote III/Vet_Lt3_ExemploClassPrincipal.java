import javax.swing.JOptionPane;
public class Vet_Lt3_ExemploClassPrincipal
{
    public static void main (String arg [])
    {
        Vet_Lt3_ExemploMetodos m = new Vet_Lt3_ExemploMetodos();
        int opc = 0;
        int vetor[ ] = new int[4];
        while (opc != 9)
        {
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 - Carrega Vetor \n 2 - Classifica Vetor \n 3 - Mostra Vetor \n 9 - Fim"));
            switch (opc)
            {
                case 1:
                    vetor = m.CarregaVetor(vetor);
                     break;
                case 2:
                    vetor = m.ClassificaVetor(vetor);
                    JOptionPane.showMessageDialog(null,"Vetor Classificado");
                    break;
                case 3:
                    m.MostraVetor(vetor);
                    break;
                case 9:
                    JOptionPane.showMessageDialog(null,"FIM");
                    System.exit(0);
                    break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            }
        }
    }
}