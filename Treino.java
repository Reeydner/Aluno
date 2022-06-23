import java.util.ArrayList;
import java.util.List;

public class Treino {
  List<Atividade> exercicios = new ArrayList<>();
  
  public Atividade exibirExercicio(int id) {
    Atividade ex = this.exercicios.get(id);
    if (ex != null) {
      ex.relatorioExercicio();
    }
    return ex;
  }

  public List<Atividade> pegarTodosExercicios() {
    return this.exercicios;
  }

  public void addExercicioAparelho (String nome, float carga, int repeticoes, String tipo) {
    Boolean add = false;
    add = this.exercicios.add(new Aparelho(nome, carga, repeticoes, tipo));
    if(add) {
      System.out.println("Exercicio " + nome + " adicionado com sucesso");
    } else {
      System.out.println("ERROR: Nao foi possivel adicionar exercicio");
    }
  }

  public void addExercicioMovimentoLivre (String nome, float carga, int repeticoes) {
    Boolean add = false;
    add = this.exercicios.add(new MovimentoLivre(nome, carga, repeticoes));
    if(add) {
      System.out.println("Exercicio " + nome + " adicionado com sucesso");
    } else {
      System.out.println("ERROR: Nao foi possivel adicionar exercicio");
    }
  }

  public void removeExercicio(int id) {
    Atividade ativ = this.exercicios.get(id);
    this.exercicios.remove(id);
    System.out.println("Exercicio " + ativ.nome + " removido com sucesso");
  }
}
