package sistemaprodutividadeacademica;

import java.util.Scanner;

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
    
    public boolean checaProjeto(String pra){//Fução de apoio para add_pa e ed_pa sobre projeto associado
        
        Projeto pjt[] = new Projeto[3];
        int i = 0;
        while(i < 3){
            if(pra.equals(pjt[i].getTitulo())){
                if(pjt[i].getStatus().equals("Em elaboração")){
                    return true;
                }
            }
            i++;
        }
        return false;
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
        while(true){
            System.out.println("Informe o Projeto Associado: ");
            aux2 = input.nextLine();
            if(checaProjeto(aux2)){
                setProjetoAssociado(aux2);
                System.out.println();
                break;
            }else{
                System.out.println("Projeto não esta em andamento.");
                System.out.println("Por favor escolha outro projeto.");
            }
        }
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
                + "Projeto Associado(3);\n");
    }
    
    public void ed_pa(int opcao){//Alterar detalhes de uma produção academica
        
        int aux1;
        String aux2;
        
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
                while(true){
                    System.out.println("Informe o Novo Projeto Associado: ");
                    aux2 = input.nextLine();
                    if(checaProjeto(aux2)){
                        setProjetoAssociado(aux2);
                        System.out.println();
                        break;
                    }else{
                        System.out.println("Projeto não esta em andamento.");
                        System.out.println("Por favor escolha outro projeto.");
                    }
                }
                break;
        }
    }
}
