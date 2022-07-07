
package calculoIdadePessoa;

/**
 *
 * @author Ederson .A Silva
 */
public class Main {

    
    /*Objetivo do programa é mostrar todos os dados do cliente tipo Pessoa
    como nome, altura, ano de nascimento e por fim calcular sua idade.
    */
   
    public static void main(String[] args) {
        
    
    Pessoa humano = new Pessoa();
    
    humano.setNome("Ederson Alves da Silva");
    humano.setAltura(1.71f);
    humano.setAnoNascimento(1993);
    
    
    
    
    
    System.out.println("Seu nome é :" + humano.getNome());
    System.out.println("Sua altura é :" + humano.getAltura());
    System.out.println("Seu Nascimento é : " + humano.getAnoNascimento());
    System.out.println("Sua Idade é:"+ humano.getCalcularIdade());
    /*Metodo da resolução do problema está na classe Pessoa orientado a 
    objeto na linha 41.
    */
    
    }
    
    
}
