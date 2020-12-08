# Classes:

  SistemaProdutividadeAcademica;
    
    # Funções: 
    
      Main;
      
      M_Inicial: Função de apoio para "main";
      
      ConsultaColaborador: Função para manipular a classe colaborador e suas subclasses;
      
      ConsultaProjeto: Função para manipular a classe projeto
      
      ConsultaProducaoAcademica: Função para manipular a classe ProducaoAcademica e suas subclasses
      
  Colaborador; (Super classe)
  
    # Funções: 
    
      M_Inicial: Função de apoio para "ed_c";
      
      add_c: Adição de um Colaborador;
      
      imp_c: Impressão dos Dados de um Colaborador;
      
      ed_c: Alteração dos Dados de um Colaborador;
      
      rem_c: Remoção de um Colaborador;
      
   Estudante; (Sub classe)
  
    # Funções Sobrescritas: 
    
      M_Inicial: Função de apoio para "ed_c";
      
      add_c: Adição de um Colaborador do tipo Estudante;
      
      imp_c: Impressão dos Dados de um Colaborador do tipo Estudante;
      
      ed_c: Alteração dos Dados de um Colaborador do tipo Estudante;
      
      rem_c: Remoção de um Colaborador do tipo Estudante;
      
   ProfessorPesquisador; (Sub classe)
  
    # Funções Sobrescritas: 
    
      M_Inicial: Função de apoio para "ed_c";
      
      add_c: Adição de um Colaborador do tipo Professor;
      
      imp_c: Impressão dos Dados de um Colaborador do tipo Professor;
      
      ed_c: Alteração dos Dados de um Colaborador do tipo Professor;
      
      rem_c: Remoção de um Colaborador do tipo Professor;       
      
  Projeto;
  
    # Funções: 
    
      M_Inicial: Função de apoio para "ed_p";
      
      add_p: Adição de um Projeto;
      
      datas: Função de apoio para add_p sobre datas;
      
      diferencaDatas: Calcula difereça de datas;
      
      imp_p: Impressão dos Dados de um Projeto;
      
      ed_p: Alteração dos Dados de um Projeto;
      
      ed_dt: Função auxiliar de ed_p sobre datas;
      
      ed_par: Função auxiliar de ed_p sobre colaboradores;
      
      ed_par_aux: Função auxiliar de ed_par;
      
      rem_p: Remoção de um Projeto;
      
      checaVariaveis: Função de apoio para gerenciarStatus;
      
      checaProducaoAcademica: Função de apoio para gerenciarStatus sobre projeto associado de uma publicação;
      
      gerenciarStatus: Altera o status do projeto;
      
    # Sobrecarga de Metodos:
     
      setParticipantes(String participantes, int id_participantes)
      setParticipantes(String participantes, int id_participantes, int pos)
     
  ProduçãoAcademica; (Super classe)
  
    # Funções: 
    
      M_Inicial: Função de apoio para "ed_pa";
      
      add_pa: Adição de uma Produção Academica;
      
      imp_pa: Impressão dos Dados de uma Produção Academica;
      
      ed_pa: Alteração dos Dados de uma Produção Academica;
      
      rem_pa: Remoção de uma Produção Academica; 
      
      checaProjeto: Fução de apoio para add_pa e ed_pa sobre projeto associado;
      
  Publicacao; (Sub classe)
  
    # Funções Sobrescritas: 
      
      M_Inicial: Função de apoio para "ed_pa";
      
      add_pa: Adição de uma Produção Academica do tipo Publicação;
      
      imp_pa: Impressão dos Dados de uma Produção Academica do tipo Publicação;
      
      ed_pa: Alteração dos Dados de uma Produção Academica do tipo Publicação;
      
      rem_pa: Remoção de uma Produção Academica do tipo Publicação;
      
    # Funções: 
    
      ed_aut: Função de apoio para ed_pa() sobre autores;
      
    # Sobrecarga de Metodos:
    
      setAutores (String autores, int id_autores)
      setAutores (String autores, int id_autores, int pos)
    
  Orientacao; (Sub classe)
  
    # Funções Sobrescritas: 
      
      M_Inicial: Função de apoio para "ed_pa";
      
      add_pa: Adição de uma Produção Academica do tipo Orientação;
      
      imp_pa: Impressão dos Dados de uma Produção Academica do tipo Orientação;
      
      ed_pa: Alteração dos Dados de uma Produção Academica do tipo Orientação;
      
      rem_pa: Remoção de uma Produção Academica do tipo Orientação;
      
    # Funções: 
    
      ed_ori: Função de apoio para ed_pa() sobre orientandos;
      
    # Sobrecarga de Metodos:
    
      setOrientandos (String orientandos, int matricula)
      setOrientandos (String orientandos, int matricula, int pos)  
