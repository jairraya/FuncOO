package rh;

/**
 *
 * @author JairRaya
 */

/*Esta classe não deve ser compilada.
Para testá-la é necessário que esta seja chamada de outra classe que tenha o método main
*/

public class Funcionario {
    
    // atributos ou variáveis privadas da classe. Somente podem ser usadas na classe.
    private int matricula;
    private String nome;
    private String cargo;
    private double salario;
    
    //construtor com parâmetros
    public Funcionario (int matricula, String nome, String cargo, double salario){
        this.matricula = matricula;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    //construtor sem parâmetros
    public Funcionario (){
    }
    
    //métodos para os construtores com e sem parâmetros
    //métodos set inserem valores nos atributos (ou variáveis)
    //métodos get obtêm valores inseridos nos atributos (variáveis)
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public int getMatricula(){
        return matricula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public String getCargo(){
        return cargo;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
    
    
    //este método calcula um reajuste salarial
    public void ajustarSalario(double percentual){
        double reajuste = this.salario * (double) percentual/100;
        this.salario += reajuste;
    }
    
}