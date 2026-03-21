import javax.swing.JOptionPane;

public class Vet_Lt3_05_SomatorioEmVetor_Meth
{
    public int[] lerValores(int v[]) 
    {
	for (int i = 0; i < 20; i++) 
        {
            v[i] = Integer.parseInt(
            JOptionPane.showInputDialog("Informe o " + (i+1) + "º valor inteiro:"));
	}
	return v;
    }

    public String calcularExpressao(int v[]) 
    {
        int soma = 0, indice;
        String resp;

        for (int i = 1; i <= 10; i++) 
        {
            indice = 2 * i - 1;
            soma += (v[0] - v[indice]);
	}
            resp = "Resultado do cálculo: " + soma;
            return resp;
	}
    public void exibir(String texto) 
    {
        JOptionPane.showMessageDialog(null, texto);
    }
}