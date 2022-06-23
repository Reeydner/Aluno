public class Main {
  public static void main(String[] args) {
    Aluno aluno = new Aluno("Joao", 25);
    Float carga = (float) 100.00;
    Float peso = (float) 80.00;
    Float altura = (float) 1.75;

    aluno.ficha.addAvaliacao(peso, altura);
    
    aluno.ficha.treino.addExercicioAparelho("Treino 1", carga, 10, "Maquina 1");
    aluno.ficha.treino.addExercicioMovimentoLivre("Treino 2", carga, 15);
    aluno.ficha.treino.addExercicioAparelho("Treino 3", carga, 20, "Maquina 2");

    aluno.ficha.relatorio();

  }
}
