
package Aulas;

import java.util.Scanner;


public class Aula_20 {

    
    public static void main(String[] args) {
     Scanner input= new Scanner (System.in);

        System.out.println("Insira um numero inteiro:");
    int numero= input.nextInt();
     
    if(numero%2 ==0){
        System.out.println("NUMERO PAR");

    }else if(numero%2!=0){ // numero dividido por 2 e o resto diferente de 0.
        System.out.println("NUMERO IMPAR");
  
}

    }
    
}
