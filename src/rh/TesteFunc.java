package rh;

/**
 *
 * @author JairRaya
 */

/*
Baseado no livro TERUEL, Evandro Carlos.
Programação Orientada a Objetos com Java. São Paulo: Uninove Editora, 2016. pp 79-103
*/

import java.text.DecimalFormat;

public class TesteFunc {
    
    public static void main (String[] args){              
        
        Funcionario func1; //cria o objeto func1 da classe Funcionario
        Funcionario func2; //cria o objeto func2 da classe Funcionario
        
        // instancia o objeto func1 chamando o construtor com parâmetros
        //da classe Funcionario.java
        func1 = new Funcionario(11111,"Maria","Programadora 1",10000.11);
        
        System.out.println("Dados do objeto func1 da classe Funcionario:");
        System.out.println("Nome = " +func1.getNome());
        System.out.println("Matrícula = " +func1.getMatricula());
        System.out.println("Cargo = " +func1.getCargo());
        System.out.println("Salário = R$" +func1.getSalario());
         
        // instancia o objeto func2 chamando o construtor vazio
        // da classe Funcionario.java
        func2 = new Funcionario();
        
        //para armazenar valores no objeto func2 devem ser utilizados
        // os métodos setter para o construtor sem parâmetros
        func2.setMatricula (22222); // inclui o valor no atributo matricula
        func2.setNome("João"); // inclui o valor no atributo nome
        func2.setCargo("Programador 2"); // inclui o valor no atributo cargo
        func2.setSalario(10000.22); // inclui o valor no atributo salario
        
        //para obter valores armazenados no objeto func2 devem ser utilizados
        //os métodos getter
        System.out.println("Dados do objeto func2 da classe Funcionario:");
        System.out.println("Nome = " + func2.getNome());
        System.out.println("Matrícula = " + func2.getMatricula());
        System.out.println("Cargo = " + func2.getCargo());
        System.out.println("Salário = R$" + func2.getSalario());
        
        // define formato com 2 dígitos decimais
        DecimalFormat doisDigitos = new DecimalFormat( "0.00" );
        
        //aplica reajuste salarial
        System.out.println("O salário da funcionária " + func1.getNome() +
                            " era R$" + func1.getSalario() + " e obteve 10% de reajuste ");
        
        System.out.println("O salário do funcionária " + func2.getNome() +
                            " era R$" + func2.getSalario() + " e obteve 10% de reajuste ");
        
        func1.ajustarSalario(10);
        System.out.println("Seu salário reajustado passou a ser R$" + doisDigitos.format(func1.getSalario()));
        
        func2.ajustarSalario(10);
        System.out.println("Seu salário reajustado passou a ser R$" + doisDigitos.format(func2.getSalario()));
      
    }
    
}