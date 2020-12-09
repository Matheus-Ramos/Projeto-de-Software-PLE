package sistemaprodutividadeacademica;

import java.util.Scanner;

/*falta:
*/

public class SistemaProdutividadeAcademica {
    
    static int i, j, k, aux;
    
    static Colaborador[] clb = new Colaborador[5];
    static ProducaoAcademica[] pdac = new ProducaoAcademica[5];
    static Projeto[] pjto = new Projeto[3];
    
    static Scanner input = new Scanner(System.in);
    
    public static void M_Inicial(){//função de apoio para main(String[] args)
        
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
    
    public static void ConsultaColaborador(int opcao, Colaborador[] clb){//função para manipular a classe colaborador e suas subclasses
        
        switch(opcao){
            case 1://Adicionar um Colaborador
                clb[i].add_c(i);
                i++;
                break;
            case 2://Alterar Detalhes de um Colaborador
                System.out.println("Informe a identificação do colaborador que você deseja "
                            + "alterar os dados: ");
                aux = input.nextInt();
                input.nextLine();
                clb[aux].ed_c(1);
                break;
            case 3://Remover um Colaborador
                System.out.println("Informe a identificação do colaborador que você deseja remover: ");
                aux = input.nextInt();
                input.nextLine();
                clb[aux].rem_c();
                break;
            case 4://Imprimir Dados de um Colaborador
                System.out.println("Informe a identificação do colaborador que você deseja "
                            + "visualizar os dados: ");
                aux = input.nextInt();
                input.nextLine();
                clb[aux].imp_c();
                break;
        }  
    }
        
    public static void ConsultaProjeto(int opcao) {//função para manipular a classe projeto
    
        pjto[j] = new Projeto();

        switch(opcao){
            case 5://Adicionar um Projeto
                pjto[j].add_p(j);
                j++;
                break;
            case 6://Alterar Detalhes de um Projeto
                System.out.println("Informe a identificação do projeto que você deseja "
                            + "alterar os dados: ");
                aux = input.nextInt();
                input.nextLine();
                pjto[aux].ed_p();
                break;
            case 7://Remover um Projeto
                System.out.println("Informe a identificação do projeto que você deseja remover: ");
                aux = input.nextInt();
                input.nextLine();
                pjto[aux].rem_p();
                break;
            case 8://Imprimir Dados de um Projeto
                System.out.println("Informe a identificação do projeto que você deseja "
                            + "visualizar os dados: ");
                aux = input.nextInt();
                input.nextLine();
                pjto[aux].imp_p();
                break;
        }
    }
    
    public static void ConsultaProducaoAcademica(int opcao, ProducaoAcademica[] pdac) {//função para manipular a classe ProducaoAcademica e suas subclasses
        
        switch(opcao){
            case 9://Adicionar uma Produção Academica
                pdac[k].add_pa(k);
                k++;
                break;
            case 10://Alterar Detalhes de uma Produção Academica
                System.out.println("Informe a identificação da produção academica que você deseja "
                            + "alterar os dados: ");
                aux = input.nextInt();
                input.nextLine();
                pdac[aux].ed_pa(1);
                break;
            case 11://Remover uma Produção Academica
                System.out.println("Informe a identificação da produção academica que você deseja remover: ");
                aux = input.nextInt();
                input.nextLine();
                pdac[aux].rem_pa();
                break;
            case 12://Imprimir Dados de uma Produção Academica
                System.out.println("Informe a identificação da produção academica que você deseja "
                            + "visualizar os dados: ");
                aux = input.nextInt();
                input.nextLine();
                pdac[aux].imp_pa();
                break;
        }    
    }
         
    public static void main(String[] args) {
        
        Colaborador[] est = new Estudante[5];
        Colaborador[] pfpq = new ProfessorPesquisador[5];
        ProducaoAcademica[] pbl = new Publicacao[5];
        ProducaoAcademica[] ort = new Orientacao[5];
        
        int opcao = 1;
        i = 0;
        j = 0;
        k = 0;
        
        while(opcao != 13){
            
            M_Inicial();
            opcao = input.nextInt();
            input.nextLine();
            if (opcao >= 1 && opcao <= 4){
                System.out.println("Informe se o colaborador é um estudante: (1)sim ou (0)não");
                aux = input.nextInt();
                if(aux == 1){
                    est[i] = new Estudante();
                    ConsultaColaborador(opcao, est);
                }else{
                    pfpq[i] = new ProfessorPesquisador();
                    ConsultaColaborador(opcao, pfpq);
                }   
            }else if(opcao >= 5 && opcao <= 8){
                ConsultaProjeto(opcao);
            }else if(opcao >= 9 && opcao <= 12){
                System.out.println("Informe se a produção academica é uma publicação: (1)sim ou (0)não");
                aux = input.nextInt();
                if(aux == 1){
                    pbl[k] = new Publicacao();
                    ConsultaProducaoAcademica(opcao, pbl);
                }else{
                    ort[k] = new Orientacao();
                    ConsultaProducaoAcademica(opcao, ort);
                }   
            }else if(opcao == 13){
                System.out.println("Obrigado por Utilizar nosso Sistema de Gerenciamento"
                            + "de Produtividade Academica");
                System.out.println("Volte Sempre");
            }else{
                System.out.println("Opção Invalida!!!");
                System.out.println("Digite Novamente");
                System.out.println();
            }
        } 
    }   
}
