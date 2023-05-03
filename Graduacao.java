package dados;

/**
 *@author Anderson Sena
 */

public class Graduacao 
{
  
  private double mediaDoAluno;
  
  private double notaProva1;
  
  private double notaProva2;
  
  private double notaDoExame;
  
  private double notaReposicao;
  
  private boolean aprovado;
  
  
  public Graduacao(double aNotaProva1, double aNotaProva2, double aNotaReposicao, double aNotaDoExame)
  {

    this.notaProva1 = aNotaProva1;
    this.notaProva2 = aNotaProva2;
    this.notaDoExame = aNotaDoExame;
    this.notaReposicao = aNotaReposicao;
    
    }
  
  public Graduacao(){}
  


  /**
   * Calcula media da prova1 e prova2
   */
  private void calculaMediaDoAluno(){}
  
  
  
  /**
   * Calcula media com nota do exame
   */
  private void calculaMediaComExame(){}
  
  
  
  
  /**
   * Verifica se o aluno foi aprovado sem exame, caso não tenha, chama as funções calculaMediaComExame() e getAprovacaoComExame()
   */
  private void AprovacaoAluno(){}
  
  
  
  
  /**
   * Verifica se o aluno foi aprovado depois do exame
   */
  private void AprovacaoComExame(){}
  
  
  
  
  
  /**
   * Verifica se aluno possui uma nota de reposição
   */
  private void verificaSeNotaReposicaoMaior(){}
  
  
  
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
