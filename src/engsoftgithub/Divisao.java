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
 * A classe Divisao foi criada contendo métodos de divisão
 * entre valores passados por parâmetro pelo usuário.
 */
public class Divisao {

    public void dividir(int num1, int num2) {
        // Exibe na tela a divisão dos dois parâmetros passados pelo usuário.
        System.out.println(num1 / num2);
    }//fim dividir()

    public String dividirN1(int num1) {
        // Retorna a divisão de um número passado por parâmetro com ele mesmo.
        return num1 + num1 + "";
    }//fim dividirN1()

    public float dividirN2(int num2) {
        // Retorna a subtração de um número passado por parâmetro com ele mesmo.
        return num2 + num2;
    }//fim dividirN2()

}// fim classe Divisao
