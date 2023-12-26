package org.example;

public class Triangulo {

    private boolean eTriangulo(int a, int b, int c){

        return (a + b > c) &&
                (b + c > a) &&
                (a + c > b);

    }

    private boolean eEquilatero(int a, int b, int c){

        return (a == b) &&
                (a == c);

    }

    private boolean eIsosceles(int a, int b, int c){

        return (a == b) ||
                (b == c) ||
                (a == c);
    }

    private boolean tresZeros(int a, int b, int c){

        return (a == 0) && (b == 0) && (c == 0);

    }

    private boolean umZero(int a, int b, int c){

        return (a == 0) || (b == 0) || (c == 0);

    }

    private boolean valorNegativo(int a, int b, int c){

        return (a < 0) || (b < 0) || (c < 0);

    }

    private boolean somaDeDoisLadosIgual (int a, int b, int c){

        return ((a + b) == c) ||
                ((b + c) == a) ||
                ((a + c) == b);

    }

    private boolean somaDeDoisLadosMenor(int a, int b, int c){

        return ((a + b) < c) ||
                ((b + c) < a) ||
                ((a + c) < b);

    }

    public String checaTriangulo(int a, int b, int c) {

        if (eTriangulo(a, b, c)) {


            if (eEquilatero(a, b, c)) {

                return "Os lados informados formam um triângulo! O triângulo é EQUILÁTERO!";

            } else if (eIsosceles(a, b, c)) {

                return "Os lados informados formam um triângulo! O triângulo é ISÓSCELES!";

            } else {

                return  "Os lados informados formam um triângulo! O triângulo é ESCALENO!";

            }
        } else if (tresZeros(a, b, c)) {

            return "Os lados informados NÃO formam um triângulo! Os três lados têm valor zero! Valor zero não é permitido!";

        } else if (umZero(a, b, c)) {

            return "Os lados informados NÃO formam um triângulo! Pelo menos um valor zero foi informado! Valor zero não é permitido!";

        } else if (valorNegativo(a, b, c)) {

                return "Os lados informados NÃO formam um triângulo! Pelo menos um valor negativo foi informado! Valor negativo não é permitido!";

        } else if(somaDeDoisLadosIgual (a, b, c)){

            return "Os lados informados NÃO formam um triângulo! A soma de dois lados é igual ao valor do terceiro lado!";

        } else if(somaDeDoisLadosMenor(a, b, c)){

            return "Os lados informados NÃO formam um triângulo! A soma de dois lados é menor do que o terceiro lado!";

        }

        return "Os lados informados NÃO formam um triângulo!";
    }

    public static void main(String[] args) {

        System.out.println("Testes Unitários");

    }
}