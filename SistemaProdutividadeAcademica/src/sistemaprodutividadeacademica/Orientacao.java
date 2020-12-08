package sistemaprodutividadeacademica;

public class Orientacao extends ProducaoAcademica{
    
    private String Professor;
    private String[] orientandos = new String[4];
    private int[] matricula = new int[4];
    private int idProfessor;
    private static int indice = 0;
    
    public void setProfessor(String Professor){
        this.Professor = Professor;
    }
    
    public String getProfessor(){
        return Professor;
    }  
    
    public void setIdProfessor(int idProfessor){
        this.idProfessor = idProfessor;
    }
    
    public int getIdProfissional(){
        return idProfessor;
    }
    
    //sobrecarga de metodos
    public void setOrientandos (String orientandos, int matricula){
        this.orientandos[indice] = orientandos;
        this.matricula[indice] = matricula;
        indice++;
    }
    
    public void setOrientandos (String orientandos, int matricula, int pos){
        this.orientandos[pos] = orientandos;
        this.matricula[pos] = matricula;
    }
    //sobrecarga de metodos
    
    public String getOrientandos(int i){
        return orientandos[i];
    }  
    
    public int getMatricula(int i){
        return matricula[i];
    }
    
    @Override
    public void imp_pa(){//Imprimir os dados de uma produção academica
        
        if(super.getId() != -1){
            super.imp_pa();
            System.out.println("Orientador: " + getProfessor());
            System.out.println("Identificação Profissional: " + getIdProfissional());
            int i = 0;
            System.out.println("Orientandos: ");
            while(i<4){
                System.out.println("Nome: " + getOrientandos(i) + "Matricula: " + getMatricula(i));
                i++;
            }
        }else{
            System.out.println("Produção Academica não existente");
        }
    }
    
    @Override
    public void add_pa(int ficha){//Adição de uma produção academica
        
        super.add_pa(ficha);
        int aux1;
        String aux2;
        
        System.out.println("Informe o Nome do Orientador: ");
        aux2 = input.nextLine();
        setProfessor(aux2);
        System.out.println("Informe o Numero da Identificação Profissional(somente numeros): ");
        aux1 = input.nextInt();
        setIdProfessor(aux1);
        input.nextLine();
        
        System.out.println("Informe a quantidade de Orientandos (de 1 a 4): ");
        int i = input.nextInt();
        input.nextLine();
        while(i > 0){
            
            System.out.println("Informe o Nome do Orientando: ");
            aux2 = input.nextLine();
            System.out.println("Informe o Numero da Matricula(somente numeros): ");
            aux1 = input.nextInt();
            setOrientandos(aux2, aux1);
            input.nextLine();
            i--;
        }
    }
    
    @Override
    public void rem_pa(){//Remoção de uma produção academica
        
        super.rem_pa();
        int aux1 = -1;
        String aux2 = null;
        
        setProfessor(aux2);
        int i = 4;
        while(i > 0){
            setOrientandos(aux2, aux1);
            i--;
        }
    }
    
    @Override
    public void M_Inicial(){//função de apoio para ed_pa()
        
        super.M_Inicial();
        System.out.println("Orientador(4);\n"
                + "Identificação Profissional(5);\n"
                + "Nome de um Orientando(6);\n"
                + "Matricula de um orientando(7);\n"
                + "Adicionar um Orientando(8);"
                + "Sair(9).");
    }
    
    public void ed_ori(int opcao){//função de apoio para ed_pa() sobre orientandos
        
        int aux1;
        String aux2;
        
        if(opcao == 8){
            if(getMatricula(3) == 0){
                System.out.println("Informe o Nome do Novo Orientando: ");
                aux2 = input.nextLine();
                System.out.println("Informe o Numero da Matricula(somente numeros): ");
                aux1 = input.nextInt();
                setOrientandos(aux2, aux1);
                input.nextLine();
            }else{
                System.out.println("Impossivel adicionar novos colaboradores");
                System.out.println("Capacidade Maxima atingida");
            }
        }else{
            System.out.println("Informe o Numero do Orientando: ");
            int i = input.nextInt();
            input.nextLine();
            if(opcao == 6 ){
                System.out.println("Informe o Novo Nome do Orientando: ");
                aux2 = input.nextLine();
                aux1 =  getMatricula(i);
                setOrientandos(aux2, aux1, i);
            }else{
                System.out.println("Informe o Novo Numero da Matricula(somente numeros): ");
                aux1 = input.nextInt();
                aux2 = getOrientandos(i);
                setOrientandos(aux2, aux1, i);
                input.nextLine();
            }
        }
    }
    
    @Override
    public void ed_pa(int opcao){//Alterar detalhes de uma produção academica
        
        opcao = 1;
        int aux1;
        String aux2;
        
        while(opcao != 9){
            
            M_Inicial();
            opcao = input.nextInt();
            input.nextLine();
            if(opcao > 0 && opcao < 4){
                super.ed_pa(opcao);
            }else if(opcao == 4){
                System.out.println("Informe o Novo Nome do Orientador: ");
                aux2 = input.nextLine();
                setProfessor(aux2);
            }else if(opcao == 5){
                System.out.println("Informe o Novo Numero da Identificação Profissional(somente numeros): ");
                aux1 = input.nextInt();
                setIdProfessor(aux1);
                input.nextLine();
            }else if(opcao > 5 && opcao < 9){
                ed_ori(opcao);
            }else if(opcao == 9){
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
