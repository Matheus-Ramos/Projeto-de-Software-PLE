package sistemaprodutividadeacademica;

import java.util.Scanner;

/*falta:
* formataçoes de estetica em imp_c;
*/

public class Colaborador {
    
    private String nome;
    private String email;
    private String endereco;
    private long telefone;
    private long cpf;
    private int id;
    
    Scanner input = new Scanner(System.in);
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
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
    
    public void setTelefone(long telefone){
        this.telefone = telefone;
    }
    
    public long getTelefone(){
        return telefone;
    }
    
    public void setCpf(long cpf){
        this.cpf = cpf;
    }
    
    public long getCpf(){
        return cpf;
    }
    
    public void imp_c(){//Imprimir os dados de um colaborador
        
        if(getId() != -1){
            System.out.println("Identificação: " + getId());
            System.out.println("Nome: " + getNome());
            System.out.println("Email: " + getEmail());
            System.out.println("Telefone: " + getTelefone());
            System.out.println("CPF: " + getCpf());
            System.out.println("Endereço: " + getEndereco());
        }else{
            System.out.println("Funcionario não existente");
        }
    }
    
    public void add_c(int ficha){//Adição de um colaborador
        
        long aux1;
        String aux2;
        
        setId(ficha);
        System.out.println("Informe o Nome Completo: ");
        aux2 = input.nextLine();
        setNome(aux2);
        System.out.println("Informe o Email: ");
        aux2 = input.nextLine();
        setEmail(aux2);
        System.out.println("Informe o Telefone(somente numeros): ");
        aux1 = input.nextLong();
        setTelefone(aux1);
        input.nextLine();
        System.out.println("Informe o CPF(somente numeros): ");
        aux1 = input.nextLong();
        setCpf(aux1);
        input.nextLine();
        System.out.println("Informe o Endereço: ");
        aux2 = input.nextLine();
        setEndereco(aux2);
    }
    
    public void rem_c(){//Remoção de um colaborador
        
        int aux1 = -1;
        String aux2 = null;

        setId(aux1);
        setNome(aux2);
        setEmail(aux2);
        setTelefone(aux1);
        setCpf(aux1);
        setEndereco(aux2);
    }
    
    public void M_Inicial(){//função de apoio para ed_c()
        
        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Nome Completo(1);\n"
                + "Email(2);\n"
                + "Telefone(3);\n"
                + "CPF(4);\n"
                + "Endereço(5);");
    }
    
    public void ed_c(int opcao){//Alterar detalhes de um colaborador
        
        long aux1;
        String aux2;
        
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
                aux1 = input.nextLong();
                setTelefone(aux1);
                input.nextLine();
                System.out.println();
                break;
            case 4:
                System.out.println("Informe o Novo CPF: ");
                aux1 = input.nextLong();
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
        }
    }
}
