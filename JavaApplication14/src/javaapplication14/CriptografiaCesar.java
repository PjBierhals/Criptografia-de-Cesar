/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication14;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author pjbie
 */
public class CriptografiaCesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        – Para criptografar: En
(x) = (x + n) mod 26
– Para descriptografar: En
(x) = (x - n) mod 26

         */

        Scanner ler = new Scanner(System.in);
        char alfabeto[] = {
            'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
            'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', ' '
        };//armazena as letra do alfabeto mais o espaço
        
        char alfaAux[];//vetor que armazena cada caracter da frase

        int numerosLetras[];//vetor que armazena numero das letras
        int numerosLetrasEncriptados[];//vetor que armazena numeros encriptados
        int numerosLetrasDesencriptados[];
        int tamanhoVetor;
        int numeroLetraChave = 0;

        System.out.println("Digite uma palavra?");
        String palavraOuFrase = ler.nextLine();

        System.out.println("Escolha uma letra?");
        char letraChave = ler.nextLine().charAt(0);

        tamanhoVetor = palavraOuFrase.length();//retorna o tamanho do vetor
        
        //inicia os vetores
        alfaAux = new char[tamanhoVetor];
        numerosLetras = new int[tamanhoVetor];
        numerosLetrasEncriptados = new int[tamanhoVetor];
        numerosLetrasDesencriptados = new int[tamanhoVetor];

        //procura o numero correspondete da letra chave no alfabeto
        //passando o caracte para maiúscula
        for (int k = 0; k < alfabeto.length; k++) {
            if (Character.toUpperCase(letraChave) == alfabeto[k]) {
                numeroLetraChave = k;
            }

        }

        //pega a palavra e armazena no vetor auxiliar
        for (int i = 0; i < palavraOuFrase.length(); i++) {

            alfaAux[i] = palavraOuFrase.charAt(i);
        }

        //pega cada caracter do vetor e subistitui por o numero correspondete
        for (int i = 0; i < alfaAux.length; i++) {
            char aux = alfaAux[i];
            for (int k = 0; k < alfabeto.length; k++) {
                if (Character.toUpperCase(aux) == alfabeto[k]) {
                    numerosLetras[i] = k;
                }

            }
        }

        System.out.println("Numero Letra Chave= " + numeroLetraChave);
        //printa os numeros correspondentes as letra
        System.out.println(Arrays.toString(numerosLetras) + " = substituição numeros por letras");

        //faz a criptaçao e armazena os número no vetor
        for (int i = 0; i < alfaAux.length; i++) {
            //pega o numero da letra soma com o numero da letra chave e divide por 27 trazendo so o resto para a posição do vetor
            numerosLetrasEncriptados[i] = numerosLetras[i] + numeroLetraChave % 27;
        }
        System.out.println(Arrays.toString(numerosLetrasEncriptados) + " = numeros Encriptados");

        //faz a desencriptaçao e armazena os número no vetor
        for (int i = 0; i < alfaAux.length; i++) {

            numerosLetrasDesencriptados[i] = numerosLetrasEncriptados[i] - numeroLetraChave % 27;
        }
        System.out.println(Arrays.toString(numerosLetrasDesencriptados) + " = Numeros desencriptados");

        //pega cada numero caracter do vetor e subistitui por a letra  correspondete
        for (int i = 0; i < numerosLetrasDesencriptados.length; i++) {
            int numAux = numerosLetrasDesencriptados[i];
            for (int k = 0; k < alfabeto.length; k++) {
                if (numAux == k) {
                    alfaAux[i] = alfabeto[k];
                }

            }
        }
        System.out.println(alfaAux);
    }
}
