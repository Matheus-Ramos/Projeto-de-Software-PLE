package sistemaprodutividadeacademica;

public class Publicacao extends ProducaoAcademica{
    
    private String[] autores = new String[4];
    private int[] id_autores = new int[4];
    private String autorPrincipal;
    private String nomeConferencia;
    private static int indice = 0;
    
    public void setNomeConferencia(String nomeConferencia){
        this.nomeConferencia = nomeConferencia;
    }
    
    public String getNomeConferencia(){
        return nomeConferencia;
    }
    
    public void setAutorPrincipal(String autorPrincipal){
        this.autorPrincipal = autorPrincipal;
    }
    
    public String getAutorPrincipal(){
        return autorPrincipal;
    }
    
    //sobrecarga de metodos
    public void setAutores (String autores, int id_autores){
        this.autores[indice] = autores;
        this.id_autores[indice] = id_autores;
        indice++;
    }
    
    public void setAutores (String autores, int id_autores, int pos){
        this.autores[pos] = autores;
        this.id_autores[pos] = id_autores;
    }
    //sobrecarga de metodos
    
    public String getAutores(int i){
        return autores[i];
    }  
    
    public int getId_autores(int i){
        return id_autores[i];
    }
    
    @Override
     public void imp_pa(){//Imprimir os dados de uma produção academica
        
         int k = 0;
         if(super.getId() != -1){
            super.imp_pa();
            System.out.println("Nome da Conferencia: " + getNomeConferencia());
            int i = 0;
            System.out.println("Autores: ");
            while(i<4){
                if(getAutores(i).equals(getAutorPrincipal())){
                    k = i;
                }
                i++;
            }
            System.out.println("Autor Principal: Nome: " + getAutores(k) + "Identificação: " + getId_autores(k));
            while(i<4){
                if(i != k){
                    System.out.println("Nome: " + getAutores(i) + "Identificação: " + getId_autores(i));
                }
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
        int i = 0;
        String aux2;
        
        System.out.println("Informe o Nome da Conferencia: ");
        aux2 = input.nextLine();
        setNomeConferencia(aux2);
        
        System.out.println("Informe a quantidade de Professores (de 1 a 4): ");
        int k = input.nextInt();
        input.nextLine();
        if((4-k) != 0){
            System.out.println("Informe a quantidade de Estudantes(de 1 a " + (4-k) + "): ");
            i = input.nextInt();
            input.nextLine();
        }
        while(k > 0){//Professores
            
            System.out.println("Informe o Nome do Professor: ");
            aux2 = input.nextLine();
            System.out.println("Informe o Numero da Identificação Profissional(somente numeros): ");
            aux1 = input.nextInt();
            setAutores(aux2, aux1);
            input.nextLine();
            k--;
        }
        while(i > 0){//Alunos
            
            System.out.println("Informe o Nome do Estudante: ");
            aux2 = input.nextLine();
            System.out.println("Informe o Numero da Matricula(somente numeros): ");
            aux1 = input.nextInt();
            setAutores(aux2, aux1);
            input.nextLine();
            i--;
        }
        System.out.println("Informe o Nome do Autor Principal: ");
        aux2 = input.nextLine();
        setAutorPrincipal(aux2);
    }
    
    @Override
    public void rem_pa(){//Remoção de uma produção academica
        
        super.rem_pa();
        int aux1 = -1;
        String aux2 = null;
        
        setNomeConferencia(aux2);
        setAutorPrincipal(aux2);
        int i = 4;
        while(i > 0){
            setAutores(aux2, aux1);
            i--;
        }
    }
    
    @Override
    public void M_Inicial(){//função de apoio para ed_pa()
        
        super.M_Inicial();
        System.out.println("Nome da Conferencia(4);\n"
                + "Autor Principal(5);\n"
                + "Nome de um Autor(6);\n"
                + "Identificação de um Autor(7);\n"
                + "Adicionar um Autor(8);"
                + "Sair(9).");
    }
    
    private void ed_aut(int opcao) {//função de apoio para ed_pa() sobre autores

        int aux1;
        String aux2;
        
        if(opcao == 8){
            if(getId_autores(3) == 0){
                System.out.println("Informe o Nome do Novo  Orientando: ");
                aux2 = input.nextLine();
                System.out.println("Informe o Numero da Matricula(somente numeros): ");
                aux1 = input.nextInt();
                setAutores(aux2, aux1);
                input.nextLine();
            }else{
                System.out.println("Impossivel adicionar novos autor");
                System.out.println("Capacidade Maxima atingida");
            }
        }else{
            System.out.println("Informe o Numero Orientando: ");
            int i = input.nextInt();
            input.nextLine();
            if(i == 0){
                System.out.println("Esta posição esta reservada para um professor");
            }
            if(opcao == 6 ){
                System.out.println("Informe o Novo Nome do Autor: ");
                aux2 = input.nextLine();
                aux1 =  getId_autores(i);
                setAutores(aux2, aux1, i);
            }else{
                System.out.println("Informe o Novo Numero da Identificação de um Autor(somente numeros): ");
                aux1 = input.nextInt();
                aux2 = getAutores(i);
                setAutores(aux2, aux1, i);
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
                System.out.println("Informe o Novo Nome da Conferencia: ");
                aux2 = input.nextLine();
                setNomeConferencia(aux2);
            }else if(opcao == 5){
                System.out.println("Informe o Novo Nome do Autor Principal: ");
                aux2 = input.nextLine();
                setAutorPrincipal(aux2);
            }else if(opcao > 5 && opcao < 9){
                ed_aut(opcao);
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
