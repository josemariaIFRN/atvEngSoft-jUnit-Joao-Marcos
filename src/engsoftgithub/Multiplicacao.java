/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engsoftgithub;

/**
 *
 * @author João Marcos Silva e Araújo
 * @author José Maria Bernardo Bezerra
 * @version 1.0
 * @since 28/07/2016
 * A classe Multiplicacao foi criada contendo métodos de multiplicação
 * entre valores passados por parâmetro pelo usuário.
 */
public class Multiplicacao {
    
    public void multiplicar(int num1, int num2){
        // Exibe na tela a multiplicação dos dois parâmetros passados pelo usuário.
        System.out.println(num1 * num2);
    }// fim multiplicar()
    
    public String multiplicarN1(int num1){
        // Retorna a multiplicação de um número passado por parâmetro com ele mesmo.
        return num1 + num1+"";
    }// fim multiplicarN1()
    
    public float multiplicarN2(int num2){
        // Retorna a multiplicação de um número passado por parâmetro com ele mesmo.
        return num2 + num2;
    }// fim multiplicarN2()
    
}// fim classe Multiplicacao
