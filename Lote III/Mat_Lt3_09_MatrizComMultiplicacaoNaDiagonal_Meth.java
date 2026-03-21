import javax.swing.JOptionPane;

public class Mat_Lt3_09_MatrizComMultiplicacaoNaDiagonal_Meth 
{
    public int[][] gerarMatriz(int m[][]) 
    {
	for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
		if (i == j) 
                {
                    m[i][j] = (int)Math.pow(4, i);
		} 
                else 
                {
                    m[i][j] = (int)(Math.random() * 100);
		}
            }
	}
	return m;
    }
    public void exibir(int m[][]) 
    {
	String saida = "Matriz gerada:\n\n";

	for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 4; j++) 
            {
		saida += m[i][j] + " ";
            }
            saida += "\n";
	}
        JOptionPane.showMessageDialog(null, saida);
    }
}