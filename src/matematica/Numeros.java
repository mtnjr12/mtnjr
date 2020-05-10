/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matematica;

/**
 *A classe matematica faz operaçoes matematicas básicas
 * @author exercicio de POOII
 * @since 04/05/2020
 * @version 1.0
 * @see java.lang.Math
 */
public class Numeros {
    /**
 *O método {@code numeroPar } verificar se um nuero par
 * @param n Valor do numero a ser verificado
 * @return true or false
 * @see Math
 */
    public Boolean numeroPar (int n){
        return n%2==0;
    }
    public int areaQuadrado(int lado){
        return lado*lado;
    }
    public Boolean numeroDivisivel (int dividendo, int divisor){
        return dividendo%divisor==0;
    }
}
