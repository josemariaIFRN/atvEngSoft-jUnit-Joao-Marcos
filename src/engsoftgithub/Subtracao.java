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
 * A classe Subtracao foi criada contendo métodos de subtração entre valores
 * passados por parâmetro pelo usuário.
 */
public class Subtracao {
    
    public int subtrair(int num1, int num2){
        // Exibe na tela a soma dos dois parâmetros passados pelo usuário.
        return num1 - num2;
    }//fim subtrair()
    
    public int subtrairN1(int num1){
        // Retorna a subtração de um número passado por parâmetro com ele mesmo.
        return num1 - num1;
    }//fim subtrairN1()
    
    public float subtrairN2(int num2){
        // Retorna a subtração de um número passado por parâmetro com ele mesmo.
        return num2 - num2;
    }//fim subtrairN2()
    
}// fim classe Subtracao
