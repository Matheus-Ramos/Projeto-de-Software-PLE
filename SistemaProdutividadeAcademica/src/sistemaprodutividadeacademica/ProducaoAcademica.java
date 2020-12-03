package sistemaprodutividadeacademica;

import java.util.Scanner;

/*Falta:
//Publicação
     
//Orientação
    
*/

public class ProducaoAcademica {
    
    private int id;
    private String titulo;
    private int anoEvento;
    private String projetoAssociado;
    
    Scanner input = new Scanner(System.in);
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setProjetoAssociado(String projetoAssociado){
        this.projetoAssociado = projetoAssociado;
    }
    
    public String getProjetoAssociado(){
        return projetoAssociado;
    }
    
    public void setAnoEvento(int anoEvento){
        this.anoEvento = anoEvento;
    }
    
    public int getAnoEvento(){
        return anoEvento;
    }
    
    public void imp_pa(){//Imprimir os dados de uma produção academica
        
        if(getId() != -1){
            System.out.println("Identificação: " + getId());
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Ano do Evento: " + getAnoEvento());
            System.out.println("Projeto Associado: " + getProjetoAssociado());
        }else{
            System.out.println("Produção Academica não existente");
        }
    }
    
    public void add_pa(int ficha){//Adição de uma produção academica
        
        int aux1;
        String aux2;
        
        setId(ficha);
        System.out.println("Informe o Titulo: ");
        aux2 = input.nextLine();
        setTitulo(aux2);
        System.out.println("Informe o Ano do Evento: ");
        aux1 = input.nextInt();
        setAnoEvento(aux1);
        input.nextLine();
        System.out.println("Informe o Projeto Associado: ");
        aux2 = input.nextLine();
        setProjetoAssociado(aux2);
        System.out.println();
    }
    
    public void rem_pa(){//Remoção de uma produção academica
        
        int aux1 = -1;
        String aux2 = null;

        setId(aux1);
        setTitulo(aux2);
        setProjetoAssociado(aux2);
        setAnoEvento(aux1);
    }
    
    public void M_Inicial(){//função de apoio para ed_pa()
        
        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Titulo(1);\n"
                + "Ano do Evento(2);\n"
                + "Projeto Associado(3);\n"
                + "Sair(4).");
    }
    
    public void ed_pa(){//Alterar detalhes de uma produção academica
        
        int opcao = 1;
        int aux1;
        String aux2;
        
        while(opcao != 4){
            
            M_Inicial();
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe o Novo Titulo: ");
                    aux2 = input.nextLine();
                    setTitulo(aux2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o Novo Ano do Evento: ");
                    aux1 = input.nextInt();
                    setAnoEvento(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o Novo Projeto Associado: ");
                    aux2 = input.nextLine();
                    setProjetoAssociado(aux2);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Modificações Salvas!!");
                    System.out.println();
                    break;
                default:
                    System.out.println("Opção Invalida!!!");
                    System.out.println("Digite Novamente");
                    System.out.println();
            }
        }
    }
}
