public class MovimentoLivre extends Atividade {

  MovimentoLivre(String nome, float carga, int repeticoes){
    this.nome = nome;
    this.carga = carga;
    this.repeticoes = repeticoes;
  }

  public void relatorioExercicio() {
    System.out.println("\n\n--------Exercicio--------");
    System.out.println("Nome do treino: " + nome);
    System.out.println("Carga: " + carga);
    System.out.println("Numero de Repeticoes: " + repeticoes);
    System.out.println("-----------------------------");
  }
}
