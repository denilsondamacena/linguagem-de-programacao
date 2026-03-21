import javax.swing.JOptionPane;

public class Mat_Lt3_08_QuantidadeDeProdutosVendidosEmMatriz_Meth 
{
    public int[][] carregarDados(int m[][]) 
    {
	for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
		m[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto " + (j+1) + " na semana " + (i+1) + ":"));
            }
	}
	return m;
    }
    public String calcularTotais(int m[][]) 
    {
	String resp = "Total por produto:\n";
	int totalMes = 0;
		
	for (int j = 0; j < 3; j++) 
        {
            int somaProd = 0;
            for (int i = 0; i < 4; i++) 
            {
		somaProd += m[i][j];
            }
            resp += "Produto " + (j+1) + ": " + somaProd + "\n";
	}

	resp += "\nTotal por semana:\n";

	for (int i = 0; i < 4; i++) 
        {
            int somaSem = 0;
            for (int j = 0; j < 3; j++) 
            {
		somaSem += m[i][j];
            }
            resp += "Semana " + (i+1) + ": " + somaSem + "\n";
	}

	for (int i = 0; i < 4; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
		totalMes += m[i][j];
            }
	}
	resp += "\nTotal geral no mês: " + totalMes;
	return resp;
    }
    public void exibir(String texto) 
    {
	JOptionPane.showMessageDialog(null, texto);
    }
}