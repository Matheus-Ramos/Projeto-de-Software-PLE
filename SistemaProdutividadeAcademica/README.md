# Classes:

  SistemaProdutividadeAcademica;
    
    # Funções: 
    
      Main;
      
      M_Inicial: Função de apoio para "main";
      
      ConsultaColaborador: Função para manipular a classe colaborador e suas subclasses;
      
      ConsultaProjeto: Função para manipular a classe projeto e suas subclasses
      
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
      
      imp_p: Impressão dos Dados de um Projeto;
      
      ed_p: Alteração dos Dados de um Projeto;
      
      rem_p: Remoção de um Projeto;
      
      checaVariaveis: Função de apoio para gerenciarStatus;
      
      gerenciarStatus: Altera o status do projeto;
  
  ProduçãoAcademica; (Super classe)
  
    # Funções: 
    
      M_Inicial: Função de apoio para "ed_pa";
      
      add_pa: Adição de uma Produção Academica;
      
      imp_pa: Impressão dos Dados de uma Produção Academica;
      
      ed_pa: Alteração dos Dados de uma Produção Academica;
      
      rem_pa: Remoção de uma Produção Academica; 
      
  Publicacao; (Sub classe) 
  
  Orientacao; (Sub classe) 
