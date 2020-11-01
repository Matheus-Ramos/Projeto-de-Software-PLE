package sistemaprodutividadeacademica;

import java.util.Scanner;

public class SistemaProdutividadeAcademica {
    
    public static void M_Inicial(){//função de apoio
        
        System.out.println("O que você deseja fazer:");
        System.out.println("Adicionar um Colaborador(1);\n"
                + "Alterar Detalhes de um Colaborador(2);\n"
                + "Remover um Colaborador(3);\n"
                + "Imprimir Dados de um Colaborador(4);\n"
                + "Adicionar um Projeto(5);\n"
                + "Alterar Detalhes de um Projeto(6);\n"
                + "Remover um Projeto(7);\n"
                + "Imprimir Dados de um Projeto(8);\n"
                + "Adicionar uma Produção Academica(9);\n"
                + "Alterar Detalhes de uma Produção Academica(10);\n"
                + "Remover uma Produção Academica(11);\n"
                + "Imprimir Dados de uma Produção Academica(12);\n"
                + "Sair(13).");
    }
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Colaborador clb = new Colaborador();
        Projeto pjt = new Projeto();
        ProducaoAcademica pdac = new ProducaoAcademica();
        
        int opcao = 1;
        while(opcao != 13){
            
            M_Inicial();
            opcao = input.nextInt();
            switch(opcao){
                case 1://Adicionar um Colaborador
                    break;
                case 2://Alterar Detalhes de um Colaborador
                    break;
                case 3://Remover um Colaborador
                    break;
                case 4://Imprimir Dados de um Colaborador
                    break;
                case 5://Adicionar um Projeto
                    break;
                case 6://Alterar Detalhes de um Projeto
                    break;
                case 7://Remover um Projeto
                    break;
                case 8://Imprimir Dados de um Projeto
                    break;
                case 9://Adicionar uma Produção Academica
                    break;
                case 10://Alterar Detalhes de uma Produção Academica
                    break;
                case 11://Remover uma Produção Academica
                    break;
                case 12://Imprimir Dados de uma Produção Academica
                    break;
                case 13://sair
                    System.out.println("Obrigado por Utilizar nosso Sistema de Gerenciamento"
                            + "de Produtividade Academica");
                    System.out.println("Volte Sempre");
                    break;
                default: 
                    System.out.println("Opção Invalida!!!");
                    System.out.println("Digite Novamente");
                    System.out.println();
            }
        }
    }   
}
