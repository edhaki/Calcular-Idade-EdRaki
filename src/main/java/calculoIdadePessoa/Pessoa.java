package calculoIdadePessoa;

/**
 *
 * @author Ederson .A Silva
 */
public class Pessoa {
    //Criei algumas classes privada referente a uma pessoa.
    private String nome;
    private int anoNascimento;
    private float altura = 0.0f;
    private int anoAtual = 2022;    
    private int calcularIdade;

    /*Cada Variavel tem sua funcionalidade pois o objetivo final é calcular idade
    e mostrar os atributos na tela.*/
    
    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public void setCalcularIdade(int calcularIdade) {
        this.calcularIdade = calcularIdade ;
    }
   
    
    
    public void setNome(String nome) {
        this.nome = nome;
    }

   
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getAnoAtual() {
        return anoAtual;
    }
  
    public int getCalcularIdade() {
        return (this.anoAtual - anoNascimento);
    /*Peguei valor do anoAtual que já está armazenado e subtrai pelo nascimento
    que é setado pelo cliente.
    */
    }

    public String getNome() {
        return nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }
     public float getAltura() {
        return altura;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }


}
