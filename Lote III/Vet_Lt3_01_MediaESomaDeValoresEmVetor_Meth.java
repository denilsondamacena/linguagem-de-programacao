import javax.swing.JOptionPane;

public class Vet_Lt3_01_MediaESomaDeValoresEmVetor_Meth 
{
    public int[] preencherVetor(int v[]) 
    {
	for (int i = 0; i < 50; i++) 
        {
            v[i] = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o " + (i+1) + "º valor inteiro:"));
	}
            return v;
    }

    public String processarValores(int v[]) 
    {
	int somaImpar = 0, somaFaixa = 0, contador = 0;
	double media;
	String resp;

	for (int i = 0; i < 50; i++) 
        {
            if (v[i] >= 10 && v[i] <= 200) 
            {
		somaFaixa += v[i];
		contador++;
            }
            if (v[i] % 2 != 0) 
            {
		somaImpar += v[i];
            }
	}
	if (contador > 0) 
        {
            media = somaFaixa / (contador * 1.0);
	} 
        else
        {
            media = 0.0;
	}
	resp = "Média dos valores entre 10 e 200: " + media + "\nSoma dos números ímpares: " + somaImpar;
	return resp;
    }
    public void mostrarResultado(String texto) 
    {
        JOptionPane.showMessageDialog(null, texto);
    }
}