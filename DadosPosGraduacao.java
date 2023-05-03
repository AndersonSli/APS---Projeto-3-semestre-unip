package dados;

/**
 *@author Anderson Sena 
 */

public class DadosPosGraduacao extends Graduacao {

  
  private double mediaDoAluno;
  
  private double notaProva1;
  
  private double notaProva2;
  
  private double notaDoExame;
  
  private double notaReposicao;  
  
  private boolean aprovado;
  
  
  public DadosPosGraduacao(double aNotaProva1, double aNotaProva2, double aNotaReposicao, double aNotaDoExame)
  {

    this.notaProva1 = aNotaProva1;
    this.notaProva2 = aNotaProva2;
    this.notaDoExame = aNotaDoExame;
    this.notaReposicao = aNotaReposicao;
    
    }
  
  public DadosPosGraduacao(){}

  /**
   * Calcula media da prova1 e prova2
   */
  private void calculaMediaDoAluno()
  {
      verificaSeNotaReposicaoMaior();	
      this.mediaDoAluno = (notaProva1 + notaProva2)/2;
  
  	}
  
  /**
   * Calcula media com nota do exame
   */
  private void calculaMediaComExame()
  {
    
    this.mediaDoAluno = (mediaDoAluno + notaDoExame)/2;
    
  	}
  
  /**
   * Verifica se o aluno foi aprovado sem exame, caso não tenha, chama as funções calculaMediaComExame() e getAprovacaoComExame()
   */
  private double AprovacaoAluno()
  {
   
   calculaMediaDoAluno();
    
   if (mediaDoAluno < 5){
      
     calculaMediaComExame();
     getAprovacaoComExame();

   	}
   else
   {
      
     System.out.println("Aprovado");
     aprovado = true;
      
   	} 
  return mediaDoAluno;
  }
  
  /**
   * Verifica se o aluno foi aprovado depois do exame
   */
  private double getAprovacaoComExame()
  {
    
   if (mediaDoAluno < 5)
   {
      
     aprovado = false;

   	}
   else
   {
     
     aprovado = true;
      
  	} 
  return mediaDoAluno;
  }
  
  /**
   * Verifica se aluno possui uma nota de reposição
   */
  private void verificaSeNotaReposicaoMaior(){
    
   if (notaProva1 < notaReposicao || notaProva2 < notaReposicao)
   {
     if (notaProva1 < notaReposicao && notaProva1 < notaProva2)
     {
        notaProva1 = notaReposicao;
     }
     else if (notaProva2 < notaReposicao && notaProva2 < notaProva1)  
     {
         notaProva2 = notaReposicao;
     }
    }
    
  }
  
  
  
  public void setNotaProva1(double aNotaProva1)
  {
    
    this.notaProva1 = aNotaProva1;
    
  }
  
  public void setNotaProva2(double aNotaProva2)
  {
    
    this.notaProva2 = aNotaProva2;
    
  }
  
  public void setNotaReposicao(double aNotaReposicao)
  {
    
    this.notaReposicao = aNotaReposicao;
    
  }
  
  public void setNotaExame(double aNotaDoExame)
  {
    
    this.notaDoExame = aNotaDoExame;
    
  }
  

  public boolean getAprovado(){
    AprovacaoAluno();
    return aprovado;
  }
  
  
  public double getMedia()
  {
    return mediaDoAluno;
  } 
  
 
}
