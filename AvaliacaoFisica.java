public class AvaliacaoFisica {
  float peso;
  float altura;
  
  AvaliacaoFisica(float peso, float altura) {
    this.peso = peso;
    this.altura = altura;
  }

  public float calcularIMC() {
    float imc = (peso / (altura * altura));
    return imc;
  }
}
