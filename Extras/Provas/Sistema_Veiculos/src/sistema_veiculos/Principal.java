import java.io.IOException;
import java.util.Scanner;

public class Principal
{
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);
        
        Veiculo[] vetor = new Veiculo[3000];
        ClasseMetodos cm = new ClasseMetodos();
        
        int opc = 0;
        int qtdLidos = 0;
        
        do
        {
            System.out.println("-----Menu-----\n");
            System.out.println("1- Ler arquivo\n"
                                + "2- Ordenar arquivos\n"
                                + "3- Buscar chassi\n"
                                + "9- Finalizar programa");
            
            System.out.print("Escolha uma opção: ");
            opc = sc.nextInt();
            
            switch(opc)
            {
                case 1:
                    qtdLidos = cm.ler(vetor);
                    System.out.println("Quantidade de veículos lidos: " + qtdLidos);
                    break;
                    
                    
                case 2:
                    if(qtdLidos == 0)
                    {
                        System.out.println("Primeiro faça a leitura do arquivo.");
                        break;
                    }
                    
                    cm.ordenar(vetor, qtdLidos);
                    System.out.println("Arquivo ordenado com sucesso.");
                    break;
                    
                    
                case 3:
                    if(qtdLidos == 0)
                    {
                        System.out.println("Primeiro faça a leitura do arquivo.");
                        break;
                    }
                    
                    System.out.print("Pesquise um número de chassi: ");
                    int numProcurado = sc.nextInt();
                    
                    int indiceRetornado = cm.buscaSequencial(vetor, numProcurado, 0, qtdLidos);
                    
                    if(indiceRetornado == -1)
                    {
                        System.out.println("Esse chassi não existe!");
                    }
                    else
                    {
                        System.out.println("Número de chassi encontrado na posição: " + indiceRetornado);
                        System.out.println("Modelo: " + vetor[indiceRetornado].modelo);
                    }
                    break;
                    
                    
                case 9:
                    System.out.println("Programa encerrado.");
                    sc.close();
                    break;
                    
                    
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            
        }while(opc != 9);
    }
}