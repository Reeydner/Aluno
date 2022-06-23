public class Aparelho extends Atividade {
  String tipo;

  Aparelho(String nome, float carga, int repeticoes, String tipo) {
    this.nome = nome;
    this.carga = carga;
    this.repeticoes = repeticoes;
    this.tipo = tipo;
  }

  public void relatorioExercicio() {
    System.out.println("\n\n--------Exercicio--------");
    System.out.println("Nome do treino: " + nome);
    System.out.println("Carga: " + carga);
    System.out.println("Numero de Repeticoes: " + repeticoes);
    System.out.println("Aparelho: " + tipo);
    System.out.println("-----------------------------");
  }
}
