import javax.swing.JOptionPane;

public class Mat_Lt3_10_MatrizComPotencia_Meth 
{
    public long[][] gerarMatriz(long m[][]) 
    {
        long valor = 1;

        for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
                m[i][j] = valor;
                valor = valor * 2;
            }
        }
        return m;
    }
    public long calcularSoma(long m[][]) 
    {
	long total = 0;

	for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
		total += m[i][j];
            }
	}
	return total;
    }
    public void exibir(long m[][], long soma) 
    {
	String saida = "Conteúdo da matriz:\n\n";

	for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
		saida += m[i][j] + " ";
            }
	saida += "\n";
	}
	saida += "\nSoma total dos valores: " + soma;
	JOptionPane.showMessageDialog(null, saida);
    }
}