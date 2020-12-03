package sistemaprodutividadeacademica;

import java.util.Scanner;
import java.time.Duration;
import java.time.LocalDateTime;

/*falta:
* ajeitar gerenciarStatus e checaVariaveis;
* Datas;
* Participantes;
* formataçoes de estetica em imp_c;
*/

public class Projeto {
    
    private int id;
    private String status;
    private String titulo;
    private String dataInicio;
    private String dataTermino;
    private String objetivo;
    private String descricao;
    private String agenciaFinanciadora;
    private double valorFinanciado;
    private String[] participantes;
    
    Scanner input = new Scanner(System.in);
    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return id;
    }
    
    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return status;
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
    public void setObjetivo(String objetivo){
        this.objetivo = objetivo;
    }
    
    public String getObjetivo(){
        return objetivo;
    }
    
    public void setDataInicio(String dataInicio){
        this.dataInicio = dataInicio;
    }
    
    public String getDataInicio(){
        return dataInicio;
    }
    
    public void setDataTermino(String dataTermino){
        this.dataTermino = dataTermino;
    }
    
    public String getDataTermino(){
        return dataTermino;
    }
    
    public void setAgenciaFinanciadora(String agenciaFinanciadora){
        this.agenciaFinanciadora = agenciaFinanciadora;
    }
    
    public String getAgenciaFinanciadora(){
        return agenciaFinanciadora;
    }
    
    public void setValorFinanciado(double valorFinanciado){
        this.valorFinanciado = valorFinanciado;
    }
    
    public double getValorFinanciado(){
        return valorFinanciado;
    }
    
    public void setParticipantes(String[] participantes){
        this.participantes = participantes;
    }
    
    public String[] getParticipantes(){
        return participantes;
    }
    
    public void imp_p(){//Imprimir os dados de um projeto
        
        if(getId() != -1){
            System.out.println("Identificação: " + getId());
            System.out.println("Status: " + getStatus());
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Objetivo: " + getObjetivo());
            System.out.println("Descrição: " + getDescricao());
            //Data de Inicio
            //Data de Termino
            System.out.println("Agencia Financiadora: " + getAgenciaFinanciadora());
            System.out.println("Valor Financiado: " + getValorFinanciado());
            //Participantes
        }else{
            System.out.println("Projeto não existente");
        }
    }
    
    public void add_p(int ficha){//Adição de um projeto
        
        double aux1;
        String aux2;
        
        setId(ficha);
        setStatus("Em elaboração");
        System.out.println("Informe o Titulo: ");
        aux2 = input.nextLine();
        setTitulo(aux2);
        System.out.println("Informe o Objetivo: ");
        aux2 = input.nextLine();
        setObjetivo(aux2);
        System.out.println("Informe a Descrição: ");
        aux2 = input.nextLine();
        setDescricao(aux2);
        //Data de Inicio
        //Data de Termino
        System.out.println("Informe a Agencia Financiadora: ");
        aux2 = input.nextLine();
        setAgenciaFinanciadora(aux2);
        System.out.println("Informe o Valor Financiado: ");
        aux1 = input.nextDouble();
        setValorFinanciado(aux1);
        input.nextLine();
        //Participantes
        System.out.println();
    }
    
    public void rem_p(){//Remoção de um projeto
        
        double aux1 = -1.0;
        String aux2 = null;
        int aux3 = -1;

        setId(aux3);
        setStatus(aux2);
        setTitulo(aux2);
        setObjetivo(aux2);
        setDescricao(aux2);
        //Data de Inicio
        //Data de Termino
        setAgenciaFinanciadora(aux2);
        setValorFinanciado(aux1);
        //Participantes
    }
    
    public boolean checaVariaveis(){//função de apoio para gerenciarStatus()
        
        int soma = 0;
        if ((getTitulo() != " ") && (getDescricao() != " ") && (getObjetivo() != " ")){
            soma++;
        }
        /*if ((getDataInicio()) && (getDataTermino())){
            soma++;
        }*/
        if ((getAgenciaFinanciadora() != " ") && (getValorFinanciado() != 0.0)){
            soma++;
        }
        /*if (getParticipantes()){
            soma++;
        }*/
        if (soma == 4){
            return true;
        }else{
            return false;
        }
    }
    
    public void gerenciarStatus(){//Altera o status do projeto
        
        int aux;
        if (getStatus() == "Em elaboração"){
            System.out.println("Deseja Iniciar o projeto? sim(1) ou não(2): ");
            aux = input.nextInt();
            input.nextLine();
            if ((aux == 1) && checaVariaveis()){
                setStatus("Em andamento");
            }else{
                System.out.println("Não foi possivel alterar o status.");
                System.out.println("Alguma(s) das variaveis não foi preenchida corretamente.");
            }
        }else if (getStatus() == "Em andamento"){
            System.out.println("Deseja Finalizar o projeto? sim(1) ou não(2): ");
            aux = input.nextInt();
            input.nextLine();
            if ((aux == 1) && true){//falta relacionar com PA
                setStatus("Concluído");
            }else{
                System.out.println("Não foi possivel alterar o status.");
                System.out.println("O projeto não possui publicações associadas.");
            }
        }   
    }
    
    public void M_Inicial(){//função de apoio para ed_p()
        
        System.out.println("Informe o campo que deseja alterar:");
        System.out.println("Status(1);\n"
                + "Titulo(2);\n"
                + "Objetivo(3);\n"
                + "Descrição(4);\n"
                + "Data de Inicio(5);\n"
                + "Data de Termino(6);\n"
                + "Agencia Financiadora(7);\n"
                + "Valor Financiado(8);\n"
                + "Participantes(9);\n"
                + "Sair(10).");
    }
    
    public void ed_p(){//Alterar detalhes de um projeto
        
        int opcao = 1;
        double aux1;
        String aux2;
        
        while(opcao != 10){
            
            M_Inicial();
            opcao = input.nextInt();
            input.nextLine();
            switch(opcao){
                case 1:
                    gerenciarStatus();
                    break;
                case 2:
                    System.out.println("Informe o Novo Titulo: ");
                    aux2 = input.nextLine();
                    setTitulo(aux2);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Informe o Novo Objetivo: ");
                    aux2 = input.nextLine();
                    setObjetivo(aux2);
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Informe a Nova Descrição: ");
                    aux2 = input.nextLine();
                    setDescricao(aux2);
                    System.out.println();
                    break;
                case 5:
                    //Data de Inicio
                    break;
                    
                case 6:
                    //Data de Termino
                    break;
                case 7:
                    System.out.println("Informe a Nova Agencia Financiadora: ");
                    aux2 = input.nextLine();
                    setAgenciaFinanciadora(aux2);
                    System.out.println();
                    break;
                case 8:
                    System.out.println("Informe o Novo Valor Financiado: ");
                    aux1 = input.nextDouble();
                    setValorFinanciado(aux1);
                    System.out.println();
                    break;   
                case 9:
                    //Participantes
                    break; 
                case 10:
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
