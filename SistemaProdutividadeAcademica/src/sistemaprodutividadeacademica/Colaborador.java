package sistemaprodutividadeacademica;

import java.util.Scanner;

/*falta:
* Diferenciar os colaboradores(alunos de graduação, alunos
de mestrado, alunos de doutorado, professores e pesquisadores);
* Adiconar uma indentificação para os colaboradores;
*/

public class Colaborador {
    
    private String nome;
    private String email;
    private String endereco;
    private int telefone;
    private int cpf;
    
    Scanner input = new Scanner(System.in);
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    public String getEndereco(){
        return endereco;
    }
    
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public int getTelefone(){
        return telefone;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public int getCpf(){
        return cpf;
    }
    
    public void imp_c(){//Imprimir os dados de um colaborador
        
        if(getNome() != null){
            System.out.println("Nome: " + getNome());
            System.out.println("Email: " + getEmail());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("CPF: " + getCpf());
            System.out.println("Endereço: " + getEndereco());
        }
    }
    
    public void add_c(){//Adição de um colaborador
        
        int aux1;
        String aux2;
        
        System.out.println("Informe o Nome Completo: ");
        aux2 = input.nextLine();
        setNome(aux2);
        System.out.println("Informe o Email: ");
        aux2 = input.nextLine();
        setEmail(aux2);
        System.out.println("Informe o Telefone(somente numeros): ");
        aux1 = input.nextInt();
        setTelefone(aux1);
        input.nextLine();
        System.out.println("Informe o CPF(somente numeros): ");
        aux1 = input.nextInt();
        setCpf(aux1);
        input.nextLine();
        System.out.println("Informe o Endereço: ");
        aux2 = input.nextLine();
        setEndereco(aux2);
        System.out.println();
    }
    
    public void rem_c(){//Remoção de um colaborador
        
        int aux1 = -1;
        String aux2 = null;

        setNome(aux2);
        setEmail(aux2);
        setTelefone(aux1);
        setCpf(aux1);
        setEndereco(aux2);
    }
    
    public void M_Inicial(){//função de apoio
        
        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Nome Completo(1);\n"
                + "Email(2);\n"
                + "Telefone(3);\n"
                + "CPF(4);\n"
                + "Endereço(5);\n"
                + "Sair(6).");
    }
    
    public void ed_c(){//Alterar detalhes de um colaborador
        
        int opcao = 1;
        int aux1;
        String aux2;
        
        while(opcao != 6){
            
            M_Inicial();
            opcao = input.nextInt();
            switch(opcao){
                case 1:
                    System.out.println("Informe o Novo Nome Completo: ");
                    aux2 = input.nextLine();
                    setNome(aux2);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Informe o Novo Email: ");
                    aux2 = input.nextLine();
                    setEmail(aux2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o Novo Telefone: ");
                    aux1 = input.nextInt();
                    setTelefone(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe o Novo CPF: ");
                    aux1 = input.nextInt();
                    setCpf(aux1);
                    input.nextLine();
                    System.out.println();
                    break;
                case 5:
                    System.out.println("Informe o Novo Endereço: ");
                    aux2 = input.nextLine();
                    setEndereco(aux2);
                    System.out.println();
                    break;
                case 6:
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
