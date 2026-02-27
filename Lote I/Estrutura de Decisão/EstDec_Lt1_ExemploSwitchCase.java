/*
Objetivo                    : Receba o código correspondente ao cargo de um funcionário e seu salário atual e mostre o cargo, o valor do aumento e seu salário. Os cargos estão na tabela. 
                              Código     Cargo           Percentual
                                1        Escriturário      50%
                                2        Secretário        35%
                                3        Caixa             20%
                                4        Gerente           10%
                                outros   "Não há cargo"   -----
Programador                 : Denilson Damacena
Data de Desenvolvimento     : 26/02/2026
*/

import javax.swing.JOptionPane;;

public class EstDec_Lt1_ExemploSwitchCase
{
    public static void main(String args[])
    {
        int codigo; 
        double salario, aumento = 0;
        String cargo;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do cargo: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog ("Informe o salário atual: "));
        
        switch(codigo) 
        {
            case 1: cargo = "Escriturário";
                aumento = (salario * 0.50); 
                salario = salario + aumento; 
                
                System.out.println("O cargo " + cargo + " terá um aumento de " + aumento + " reais e seu novo salário será: " + salario + " reais");
                
                break;
                
            case 2: cargo = "Secretário"; 
                aumento = (salario * 0.35); 
                salario = salario + aumento; 
                
                System.out.println("O cargo " + cargo + " terá um aumento de " + aumento + " reais e seu novo salário será: " + salario + " reais");
                
                break;
                
            case 3: cargo = "Caixa";
                aumento = (salario * 0.20); 
                salario = salario + aumento; 
                
                System.out.println("O cargo " + cargo + " terá um aumento de " + aumento + " reais e seu novo salário será: " + salario + " reais"); 
                
                break;
                
            case 4: cargo = "Gerente";
                aumento = (salario * 0.10); 
                salario = salario + aumento; 
                
                System.out.println("O cargo " + cargo + " terá um aumento de " + aumento + " reais e seu novo salário será: " + salario + " reais"); 
                
                break;
                
            default: cargo = "Não há cargo";System.out.println(cargo); 
                break;
        }
    }
}

