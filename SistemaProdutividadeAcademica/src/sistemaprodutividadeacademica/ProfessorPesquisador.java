package sistemaprodutividadeacademica;

public class ProfessorPesquisador extends Colaborador{
        
    private int tipo;
    private int idProfissional;
    
    public void setTipo(int tipo){
        this.tipo = tipo;
    }
    
    public int getTipo(){
        return tipo;
    }
    
    public void setIdProfissional(int idProfissional){
        this.idProfissional = idProfissional;
    }
    
    public int getIdProfissional(){
        return idProfissional;
    }
    
        @Override
    public void imp_c(){//Imprimir os dados de um colaborador
        
        if(super.getId() != -1){
            super.imp_c();
            if(getTipo() == 1){
                System.out.println("Função: Professor");
            }else{
                System.out.println("Função: Pesquisador");
            }
            System.out.println("Identificação Profissional: " + getIdProfissional());
        }else{
            System.out.println("Funcionario não existente");
        }  
    }
    
    @Override
    public void add_c(int ficha){//Adição de um colaborador
        
        super.add_c(ficha);
        int aux1;
        
        System.out.println("Informe o Tipo do Profissional:(1)Professor ou (2)Pesquisador");
        aux1 = input.nextInt();
        setTipo(aux1);
        input.nextLine();
        System.out.println("Informe o Numero da Identificação Profissional(somente numeros): ");
        aux1 = input.nextInt();
        setIdProfissional(aux1);
        input.nextLine();
        System.out.println();
    }
    
    @Override
    public void rem_c(){//Remoção de um colaborador
        
        super.rem_c();
        int aux1 = -1;
        
        setTipo(aux1);
        setIdProfissional(aux1);
    }
    
    @Override
    public void M_Inicial(){//função de apoio para ed_c()
        super.M_Inicial();
        System.out.println("Tipo do Colaborador(6);\n"
                + "Identificação Profissional(7);\n"
                + "Sair(8).");
    }
    
    @Override
    public void ed_c(int opcao){//Alterar detalhes de um colaborador
            
        opcao = 1;
        int aux1;
        
        while(opcao != 8){
            
            M_Inicial();
            opcao = input.nextInt();
            input.nextLine();
            if(opcao > 0 && opcao < 6){
                super.ed_c(opcao);
            }else if(opcao == 6){
                System.out.println("Informe o Novo Tipo do Colaborador:(1)Professor ou (2)Pesquisador");
                aux1 = input.nextInt();
                setTipo(aux1);
                input.nextLine();
            }else if(opcao == 7){
                System.out.println("Informe a Nova Identificação Profissional do Colaborador: ");
                aux1 = input.nextInt();
                setIdProfissional(aux1);
                input.nextLine();
            }else if(opcao == 8){
                System.out.println("Modificações Salvas!!");
                System.out.println();
            }else{
                System.out.println("Opção Invalida!!!");
                System.out.println("Digite Novamente");
                System.out.println();
            }
        }
    }
}
