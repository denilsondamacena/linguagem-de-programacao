import javax.swing.JOptionPane;

public class Mat_Lt3_12_SomaDePecasEmTabuleiroDeXadrez_Meth 
{
    public int[][] carregarTabuleiro(int m[][], int cont[]) 
    {
	for (int i = 0; i < 7; i++) 
        {
            cont[i] = 0;
	}
	for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
		m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o código da peça (1 a 7):"));
		cont[m[i][j] - 1]++;
            }
	}
	return m;
    }
    public void exibir(int cont[]) 
    {

	String nomes[] = {"[1] Peão","[2] Torre","[3] Bispo","[4] Cavalo","[5] Rainha","[6] Rei","[7] Vazio"};
	String saida = "Resumo das peças no tabuleiro:\n\n";
	for (int i = 0; i < 7; i++) 
        {
            saida += nomes[i] + " -> " + cont[i] + " unidade(s)\n";
	}
            JOptionPane.showMessageDialog(null, saida);
    }
}