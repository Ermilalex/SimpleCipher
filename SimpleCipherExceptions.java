/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecipher;

/**
 *
 * @author Drass
 */
class WrongSwappedException extends Exception {
    public String toString(){
        return "\n Некорректная изменяемая буква";
    }
}

class WrongSwapperException extends Exception {
    public String toString(){
        return "\n Некорректная изменяющая буква";
    }
}

class SwapLimitException extends Exception {
    public String toString(){
        return "\n Произведено максимальное число замен";
    }
}