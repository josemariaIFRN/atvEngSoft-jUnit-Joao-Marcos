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
 * A classe Soma foi criada contendo métodos de soma entre valores passados
 * por parâmetro pelo usuário.
 */
public class Soma {
    
    public void somar(int num1, int num2){
        // Exibe na tela a soma dos dois parâmetros passados pelo usuário.
        System.out.println(num1 + num2);
    }// fim somar()
    
    public String somarN1(int num1){
        // Retorna a soma de um número passado por parâmetro com ele mesmo.
        return num1 + num1+"";
    }// fim somarN1()
    
    public float somarN2(int num2){
        // Retorna a soma de um número passado por parâmetro com ele mesmo.
        return num2 + num2;
    }// fim somarN2()
    
}// fim classe Soma
