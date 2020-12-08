package sistemaprodutividadeacademica;

import java.util.Scanner;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*falta:
* formataçoes de estetica em imp_c;
*/

public class Projeto {
    
    private int id;
    private String status;
    private String titulo;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private String objetivo;
    private String descricao;
    private String agenciaFinanciadora;
    private double valorFinanciado;
    private String[] participantes = new String[6];
    private int[] id_participantes = new int[6];
    private static int indice = 0;
    
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
    
    public void setDatas(LocalDate dataInicio, LocalDate dataTermino){
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }
    
    public LocalDate getDataInicio(){
        return dataInicio;
    }
    
    public LocalDate getDataTermino(){
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
    
    //sobrecarga de metodos
    public void setParticipantes(String participantes, int id_participantes){
        this.participantes[indice] = participantes;
        this.id_participantes[indice] = id_participantes;
        indice++;
    }
    
    public void setParticipantes(String participantes, int id_participantes, int pos){
        this.participantes[pos] = participantes;
        this.id_participantes[pos] = id_participantes;
    }
    //sobrecarga de metodos
    public String getParticipantes(int i){
        return participantes[i];
    }
    
    public int getId_participantes(int i){
        return id_participantes[i];
    }
    
    public void imp_p(){//Imprimir os dados de um projeto
        
        if(getId() != -1){
            System.out.println("Identificação: " + getId());
            System.out.println("Status: " + getStatus());
            System.out.println("Titulo: " + getTitulo());
            System.out.println("Objetivo: " + getObjetivo());
            System.out.println("Descrição: " + getDescricao());
            System.out.println("Data de Inicio: " + getDataInicio());
            System.out.println("Data de Termino: " + getDataTermino());
            System.out.println("Agencia Financiadora: " + getAgenciaFinanciadora());
            System.out.println("Valor Financiado: " + getValorFinanciado());
            int i = 0;
            System.out.println("Colaboradore: ");
            while(i<6){
                System.out.println("Nome: " + getParticipantes(i) + "Identificação: " + getId_participantes(i));
                i++;
            }
        }else{
            System.out.println("Projeto não existente");
        }
    }
    
    public boolean diferencaDatas(LocalDate data1, LocalDate data2){//calcula difereça de datas
        
        Period periodo = Period.between(data1, data2);
        if(periodo.isNegative() == false && periodo.isZero() == false){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean datas(){//Função de apoio para add_p sobre datas
        
        String dadosInicio;
        String dadosTermino;
        System.out.println("Informe a Data de Inicio (no formato ISO, yyyy-MM-dd): ");
        dadosInicio = input.nextLine();
        LocalDate datai = LocalDate.parse(dadosInicio);
        System.out.println("Informe a Data de Termino (no formato ISO, yyyy-MM-dd): ");
        dadosTermino = input.nextLine();
	LocalDate datat = LocalDate.parse(dadosTermino);
        if(diferencaDatas(datai, datat)){
            setDatas(datai, datat);
            return true;
        }else{
            System.out.println("Datas Invalidas.");
            return false;
        } 
    }
    
    public void add_p(int ficha){//Adição de um projeto
        
        double aux1;
        String aux2;
        int aux3;
        int i = 0;
        int k = 0;
        
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
        do{
        }while(datas());
        System.out.println("Informe a Agencia Financiadora: ");
        aux2 = input.nextLine();
        setAgenciaFinanciadora(aux2);
        System.out.println("Informe o Valor Financiado: ");
        aux1 = input.nextDouble();
        setValorFinanciado(aux1);
        input.nextLine();
        //Participantes
        while(true){
            System.out.println("Informe a quantidade de Professores (de 1 a 6): ");
            k = input.nextInt();
            input.nextLine();
            if(k == 0){
                System.out.println("Um projeto de pesquisa deve ter pelo "
                        + "menos um professor como participante.");
            }else{
                if((6-k) != 0){
                    System.out.println("Informe a quantidade de Estudantes(de 1 a " + (6-k) + "): ");
                    i = input.nextInt();
                    input.nextLine();
                }
                while(k > 0){//Professores
            
                    System.out.println("Informe o Nome do Professor: ");
                    aux2 = input.nextLine();
                    System.out.println("Informe o Numero da Identificação Profissional(somente numeros): ");
                    aux3 = input.nextInt();
                    setParticipantes(aux2, aux3);
                    input.nextLine();
                    k--;
                }
                while(i > 0){//Alunos
            
                    System.out.println("Informe o Nome do Estudante: ");
                    aux2 = input.nextLine();
                    System.out.println("Informe o Numero da Matricula(somente numeros): ");
                    aux3 = input.nextInt();
                    setParticipantes(aux2, aux3);
                    input.nextLine();
                    i--;
                }
                break;
            }
        }
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
        setDatas(LocalDate.of(1969, 10, 29), LocalDate.of(5042, 10, 29));
        setAgenciaFinanciadora(aux2);
        setValorFinanciado(aux1);
        int i = 6;
        while(i > 0){
            setParticipantes(aux2, aux3);
            i--;
        }
    }
    
    public boolean checaVariaveis(){//função de apoio para gerenciarStatus()
        
        int soma = 0;
        if ((getTitulo() != " ") && (getDescricao() != " ") && (getObjetivo() != " ")){
            soma++;
        }
        //convertendo de localdate para string
        if ((getDataInicio().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) != " ") && 
                (getDataTermino().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")) != " ")){
            soma++;
        }
        if ((getAgenciaFinanciadora() != " ") && (getValorFinanciado() != 0.0)){
            soma++;
        }
        int i = 0;
        int k = 0;
        while(i < 6){
            if ((getParticipantes(i) != " ") && (getId_participantes(i) != 0)){
                k++;
            }
            i++;
        }
        if (k >= 2){
            soma++;
        }
        if (soma == 4){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean checaProducaoAcademica(){
        
        ProducaoAcademica pbc[] = new Publicacao[5];
        int i = 0;
        while(i < 5){
            if(getTitulo().equals(pbc[i].getProjetoAssociado())){
                    return true;
            }
            i++;
        }
        return false;
    }
    
    public void gerenciarStatus(){//Altera o status do projeto
        
        int aux;
        if (getStatus().equals("Em elaboração")){
            System.out.println("Deseja Iniciar o projeto? sim(1) ou não(2): ");
            aux = input.nextInt();
            input.nextLine();
            if ((aux == 1) && checaVariaveis()){
                setStatus("Em andamento");
            }else{
                System.out.println("Não foi possivel alterar o status.");
                System.out.println("Alguma(s) das variaveis não foi preenchida corretamente.");
            }
        }else if (getStatus().equals("Em andamento")){
            System.out.println("Deseja Finalizar o projeto? sim(1) ou não(2): ");
            aux = input.nextInt();
            input.nextLine();
            if ((aux == 1) && checaProducaoAcademica()){
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
                + "Data(5);\n"
                + "Agencia Financiadora(6);\n"
                + "Valor Financiado(7);\n"
                + "Participantes(8);\n"
                + "Sair(9).");
    }
    
    public int ed_par_aux(){//Função auxiliar de ed_par
        
        int i;
        System.out.println("Informe o Numero de Colaboradores: ");
        i = input.nextInt();
        input.nextLine();
        if(i == 0){
            System.out.println("Esta posição esta reservada para um professor");
        }
        return i;
    }
    
    public void ed_par(){//Função auxiliar de ed_p sobre colaboradores
        
        int aux1, opcao, i;
        String aux2;
        
        while(true){
            System.out.println("Informe o que deseja fazer:");
            System.out.println("Adicionar Novo Colaborador(1);");
            System.out.println("Alterar Nome do Colaborador(2);");
            System.out.println("Alterar Identificação do Colaborador(3);");
            opcao = input.nextInt();
            input.nextLine();
            if(opcao == 1){
                if(getId_participantes(5) == 0){
                    System.out.println("Informe o Nome do Novo Colaborador: ");
                    aux2 = input.nextLine();
                    System.out.println("Informe o Numero da Identificação(somente numeros): ");
                    aux1 = input.nextInt();
                    setParticipantes(aux2, aux1);
                    input.nextLine();
                }else{
                    System.out.println("Impossivel adicionar novos colaboradores");
                    System.out.println("Capacidade Maxima atingida");
                }
                break;
            }else if(opcao == 2){
                i = ed_par_aux();
                System.out.println("Informe o Novo Nome do Colaborador: ");
                aux2 = input.nextLine();
                aux1 =  getId_participantes(i);
                setParticipantes(aux2, aux1, i);
            }else if(opcao == 3){
                i = ed_par_aux();
                System.out.println("Informe o Novo Numero da Identificação(somente numeros): ");
                aux1 = input.nextInt();
                aux2 = getParticipantes(i);
                setParticipantes(aux2, aux1, i);
                input.nextLine();
            }else{
                System.out.println("Opção Invalida.");
            }    
        }
    }
    
    public void ed_dt(){////Função auxiliar de ed_p sobre datas
        
        String data;
        System.out.println("Informe se é a data do inicio(1) ou de termino(2)");
        int i = input.nextInt();
        input.nextLine();
        if(i == 1){
            System.out.println("Informe a Nova Data de Inicio (no formato ISO, yyyy-MM-dd): ");
            data = input.nextLine();
            LocalDate datai = LocalDate.parse(data);
            if(diferencaDatas(datai, getDataTermino())){
                setDatas(datai, getDataTermino());
            }else{
                System.out.println("Datas Invalidas.");
        }
        }else if(i == 2){
            System.out.println("Informe a Nova Data de Termino (no formato ISO, yyyy-MM-dd): ");
            data = input.nextLine();
            LocalDate datat = LocalDate.parse(data);
            if(diferencaDatas(getDataInicio(), datat)){
                setDatas(getDataInicio(), datat);
            }else{
                System.out.println("Datas Invalidas.");
            }
        }else{
            System.out.println("Opção Invalida.");
        }
    }
    
    public void ed_p(){//Alterar detalhes de um projeto
        
        int opcao = 1;
        double aux1;
        String aux2;
        
        while(opcao != 9){
            
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
                    ed_dt();
                    break;
                case 6:
                    System.out.println("Informe a Nova Agencia Financiadora: ");
                    aux2 = input.nextLine();
                    setAgenciaFinanciadora(aux2);
                    System.out.println();
                    break;
                case 7:
                    System.out.println("Informe o Novo Valor Financiado: ");
                    aux1 = input.nextDouble();
                    setValorFinanciado(aux1);
                    System.out.println();
                    break;   
                case 8:
                    ed_par();
                    break; 
                case 9:
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
