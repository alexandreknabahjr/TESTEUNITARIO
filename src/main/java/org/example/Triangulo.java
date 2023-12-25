package org.example;
import java.util.Scanner;

public class Triangulo {

    public String checaTriangulo(int a, int b, int c) {

        if ((a + b > c) &&
                (b + c > a) &&
                (a + c > b)) {


            if ((a == b) &&
                    (a == c)) {

                return "Os lados informados formam um triângulo! O triângulo é EQUILÁTERO!";

            } else if ((a == b) ||
                    (b == c) ||
                    (a == c)) {

                return "Os lados informados formam um triângulo! O triângulo é ISÓSCELES!";

            } else {

                return  "Os lados informados formam um triângulo! O triângulo é ESCALENO!";

            }
        } else if ((a == 0) && (b == 0) && (c == 0)) {

            return "Os lados informados NÃO formam um triângulo! Os três lados têm valor zero! Valor zero não é permitido!";

        } else if ((a == 0) || (b == 0) || (c == 0)) {

            return "Os lados informados NÃO formam um triângulo! Pelo menos um valor zero foi informado! Valor zero não é permitido!";

        } else if ((a < 0) || (b < 0) || (c < 0)) {

                return "Os lados informados NÃO formam um triângulo! Pelo menos um valor negativo foi informado! Valor zero não é permitido!";


        } else if(((a + b) == c) ||
                ((b + c) == a) ||
                ((a + c) == b)){

            return "Os lados informados NÃO formam um triângulo! A soma de dois lados é igual ao valor do terceiro lado!";

        } else if(((a + b) < c) ||
                ((b + c) < a) ||
                ((a + c) < b)){

            return "Os lados informados NÃO formam um triângulo! A soma de dois lados é menor do que o terceiro lado!";

        }

        return "Os lados informados NÃO formam um triângulo!";
    }

    public static void main(String[] args) {

        Scanner ladoAObj = new Scanner(System.in);
        System.out.println("Digite o lado A do triângulo: ");
        int ladoA = ladoAObj.nextInt();

        Scanner ladoBObj = new Scanner(System.in);
        System.out.println("Digite o lado B do triângulo: ");
        int ladoB = ladoBObj.nextInt();

        Scanner ladoCObj = new Scanner(System.in);
        System.out.println("Digite o lado C do triângulo: ");
        int ladoC = ladoCObj.nextInt();

        Triangulo triangulo = new Triangulo();

        String resultado = triangulo.checaTriangulo(ladoA, ladoB, ladoC);

    }
}