package dados;

/**
 *@author Anderson Sena 
 */

public class DadosGraduacao extends Graduacao
{
  
  private double mediaDoAluno;
  
  private double notaProva1;
  
  private double notaProva2;
  
  private double notaDoExame;
  
  private double notaReposicao;
  
  private boolean aprovado;
  
  
  public DadosGraduacao(double aNotaProva1, double aNotaProva2, double aNotaReposicao, double aNotaDoExame)
  {

    this.notaProva1 = aNotaProva1;
    this.notaProva2 = aNotaProva2;
    this.notaDoExame = aNotaDoExame;
    this.notaReposicao = aNotaReposicao;
    
    }
  
  public DadosGraduacao(){}
  


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
  private void AprovacaoAluno()
  {
   
   calculaMediaDoAluno();
    
   if (mediaDoAluno < 7){
      
     calculaMediaComExame();
     AprovacaoComExame();

   	}
   else
   {
     aprovado = true; 
   	} 
  }
  
  /**
   * Verifica se o aluno foi aprovado depois do exame
   */
  private void AprovacaoComExame()
  {
    
   if (mediaDoAluno < 5)
   {
      
     aprovado = false;

   	}
   else
   {
     aprovado = true;  
  	} 
  }
  
  
  /**
   * Verifica se aluno possui uma nota de reposição
   */
  private void verificaSeNotaReposicaoMaior()
  {
    
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
    
    notaProva1 = aNotaProva1;
    
  }
  
  
  public void setNotaProva2(double aNotaProva2)
  {
    
    notaProva2 = aNotaProva2;
    
  }
  
  
  public void setNotaReposicao(double aNotaReposicao)
  {
    
    notaReposicao = aNotaReposicao;
    
  }
  
  public void setNotaExame(double aNotaDoExame)
  {
    
    notaDoExame = aNotaDoExame;
    
  }  
  
  
  
  public boolean getAprovado()
  {
    AprovacaoAluno();
    return aprovado;
  }
  
  public double getMedia()
  {
    return mediaDoAluno;
  }

  
}