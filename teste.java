package teste;

import dados.DadosGraduacao;

import dados.Graduacao;

import dados.DadosPosGraduacao;

class Teste {
  public static void main(String[] args) {
   
    Graduacao dado = new DadosGraduacao(5, 5,0,5);
    
    Graduacao dado2 = new DadosPosGraduacao(0,3,0,10);
    
    Graduacao dado3 = new DadosGraduacao();
    
    
    
    System.out.println(dado.getAprovado());
    System.out.println(dado.getMedia());
    
    
    System.out.println(dado2.getAprovado());
    System.out.println(dado2.getMedia());
    
    
    
    dado3.setNotaProva1(2);
    dado3.setNotaProva2(7);
    dado3.setNotaReposicao(0);
    dado3.setNotaExame(9);
    
    
    System.out.println(dado3.getAprovado());
    System.out.println(dado3.getMedia());
    
    
    
  }
}
