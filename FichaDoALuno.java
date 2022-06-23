import java.util.ArrayList;
import java.util.List;

public class FichaDoALuno {
  Treino treino = new Treino();
  List<AvaliacaoFisica> avaliacoes = new ArrayList<>();

  public void relatorio() {
    Float imc = avaliacoes.get(avaliacoes.size() - 1).calcularIMC();
    System.out.println("\n\n---------IMC--------");
    System.out.println("IMC do Aluno: " + imc);
    System.out.println("--------------------");
    List<Atividade> lista = this.treino.pegarTodosExercicios();
    lista.forEach(exer -> {
      exer.relatorioExercicio();
    });
  }

  public void addAvaliacao (float peso, float altura) {
    Boolean add = false;
    add = this.avaliacoes.add(new AvaliacaoFisica(peso, altura));
    if(add) {
      System.out.println("Avaliacao adicionado com sucesso");
    } else {
      System.out.println("ERROR: Nao foi possivel adicionar avaliacao");
    }
  }

  public void removeAvaliacao(int id) {
    this.avaliacoes.remove(id);
    System.out.println("Avaliacao removido com sucesso");
  }
}
