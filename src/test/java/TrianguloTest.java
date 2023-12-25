import org.example.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TrianguloTest {

    @Test
    public void testeEscaleno(){

        Triangulo trianguloEscaleno = new Triangulo();

        Assertions.assertEquals(trianguloEscaleno.checaTriangulo(3,4,5),
                "Os lados informados formam um triângulo!" + " " + "O triângulo é ESCALENO!");
    }

    @Test
    public void testeIsosceles(){

        Triangulo trianguloIsosceles = new Triangulo();

        Assertions.assertEquals(trianguloIsosceles.checaTriangulo(5,5,4),
                "Os lados informados formam um triângulo!" + " " + "O triângulo é ISÓSCELES!");

    }

    @Test
    public void testeEquilatero(){

        Triangulo trianguloEquilatero = new Triangulo();

        Assertions.assertEquals(trianguloEquilatero.checaTriangulo(5,5,5),
                "Os lados informados formam um triângulo!" + " " + "O triângulo é EQUILÁTERO!");
    }

    @Test
    public void testeIsocelesPermutacaoA(){

        Triangulo permutaA = new Triangulo();

        Assertions.assertEquals(permutaA.checaTriangulo(6,6,10),
                "Os lados informados formam um triângulo!" + " " + "O triângulo é ISÓSCELES!");
    }

    @Test
    public void testeIsocelesPermutacaoB(){

        Triangulo permutaB = new Triangulo();

        Assertions.assertEquals(permutaB.checaTriangulo(6,10,6),
                "Os lados informados formam um triângulo!" + " " + "O triângulo é ISÓSCELES!");
    }

    @Test
    public void testeIsocelesPermutacaoC(){

        Triangulo permutaC = new Triangulo();

        Assertions.assertEquals(permutaC.checaTriangulo(10,6,6),
                "Os lados informados formam um triângulo!" + " " + "O triângulo é ISÓSCELES!");
    }

    @Test
    public void testeZero(){

        Triangulo zero = new Triangulo();

        Assertions.assertEquals(zero.checaTriangulo(0,5,5),
                "Os lados informados NÃO formam um triângulo! Pelo menos um valor zero foi informado! Valor zero não é permitido!");
    }

    @Test
    public void testeNegativo(){

        Triangulo negativo = new Triangulo();

        Assertions.assertEquals(negativo.checaTriangulo(-5,5,5),
                "Os lados informados NÃO formam um triângulo! Pelo menos um valor negativo foi informado! Valor zero não é permitido!");
    }

    @Test
    public void testeSomaIgualPermutaA(){

        Triangulo somaA = new Triangulo();

        Assertions.assertEquals(somaA.checaTriangulo(4,4,8),
                "Os lados informados NÃO formam um triângulo! A soma de dois lados é igual ao valor do terceiro lado!");
    }

    @Test
    public void testeSomaIgualPermutaB(){

        Triangulo somaB = new Triangulo();

        Assertions.assertEquals(somaB.checaTriangulo(4,8,4),
                "Os lados informados NÃO formam um triângulo! A soma de dois lados é igual ao valor do terceiro lado!");
    }

    @Test
    public void testeSomaIgualPermutaC(){

        Triangulo somaC = new Triangulo();

        Assertions.assertEquals(somaC.checaTriangulo(8,4,4),
                "Os lados informados NÃO formam um triângulo! A soma de dois lados é igual ao valor do terceiro lado!");
    }

    @Test
    public void testeSomaMenorPermutaA(){

        Triangulo somaA = new Triangulo();

        Assertions.assertEquals(somaA.checaTriangulo(4,4,9),
                "Os lados informados NÃO formam um triângulo! A soma de dois lados é menor do que o terceiro lado!");
    }

    @Test
    public void testeSomaMenorPermutaB(){

        Triangulo somaB = new Triangulo();

        Assertions.assertEquals(somaB.checaTriangulo(4,9,4),
                "Os lados informados NÃO formam um triângulo! A soma de dois lados é menor do que o terceiro lado!");
    }

    @Test
    public void testeSomaMenorPermutaC(){

        Triangulo somaC = new Triangulo();

        Assertions.assertEquals(somaC.checaTriangulo(9,4,4),
                "Os lados informados NÃO formam um triângulo! A soma de dois lados é menor do que o terceiro lado!");
    }

    @Test
    public void testeTresZeros(){

        Triangulo trianguloComTresZeros = new Triangulo();

        Assertions.assertEquals(trianguloComTresZeros.checaTriangulo(0,0,0),
                "Os lados informados NÃO formam um triângulo! Os três lados têm valor zero! Valor zero não é permitido!");
    }
}
