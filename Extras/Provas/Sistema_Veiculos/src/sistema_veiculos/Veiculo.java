public class Veiculo
{
    int anoFabricacao;
    String modelo;
    String cor;
    double kmPercorrido;
    int chassi;
    
    public Veiculo()
    {
        this(0, "", "", 0.0, 0);
    }
    
    public Veiculo(int anoFabricacao, String modelo, String cor, double kmPercorrido, int chassi)
    {
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.cor = cor;
        this.kmPercorrido = kmPercorrido;
        this.chassi = chassi;
    }
}