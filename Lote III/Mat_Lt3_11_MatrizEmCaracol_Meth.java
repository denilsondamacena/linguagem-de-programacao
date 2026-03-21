import javax.swing.JOptionPane;

public class Mat_Lt3_11_MatrizEmCaracol_Meth  
{
    public int[][] gerarPadrao(int m[][]) 
    {
	for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
		int menor = i;
		if (j < menor)
                {
                    menor = j;  
                }
                if (7 - i < menor)
                {
                    menor = 7 - i;
                }
		if (7 - j < menor)
                {
                    menor = 7 - j;
                }
                m[i][j] = menor + 1;
            }
	}
	return m;
    }
    public void exibir(int m[][]) 
    {
	String saida = "Matriz padrão:\n\n";

	for (int i = 0; i < 8; i++) 
        {
            for (int j = 0; j < 8; j++) 
            {
		saida += m[i][j] + " ";
            }
            saida += "\n";
	}
	JOptionPane.showMessageDialog(null, saida);
    }
}
