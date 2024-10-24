package Ex2;

import java.util.Scanner;

public class PrincipalQuadrado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o lado do 1ª quadrado: ");
        double lado = sc.nextDouble();
        Quadrado q1 = new Quadrado(lado);

        System.out.println("-------------------------------------------------------");
        System.out.println("Área do 1º quadrado: " + q1.area());
        System.out.println("Perímetro do 1º quadrado: " + q1.perimetro());
        System.out.println("-------------------------------------------------------");


        System.out.println("Digite o lado do 2ª quadrado: ");
        lado = sc.nextDouble();
        Quadrado q2 = new Quadrado(lado);

        System.out.println("-------------------------------------------------------");
        System.out.println("Área do 2º quadrado: " + q2.area());
        System.out.println("Perímetro do 2º quadrado: " + q2.perimetro());
        System.out.println("-------------------------------------------------------");

        System.out.println("Digite o lado do 3ª quadrado: ");
        lado = sc.nextDouble();
        Quadrado q3 = new Quadrado(lado);

        System.out.println("-------------------------------------------------------");
        System.out.println("Área do 3º quadrado: " + q3.area());
        System.out.println("Perímetro do 3º quadrado: " + q3.perimetro());


    }
}
