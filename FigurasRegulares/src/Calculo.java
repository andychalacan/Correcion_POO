import java.util.Scanner;
public class Calculo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el lado del cuadrado");
        double ladocuadrado = scanner.nextDouble();
        System.out.println("Ingrese el ancho del rectangulo");
        double anchorectangulo = scanner.nextDouble();
        System.out.println("Ingrese el largo del rectangulo");
        double largorectangulo = scanner.nextDouble();
        System.out.println("Ingresa el radio del circulo");
        double radiocirculo = scanner.nextDouble();
        System.out.println("Ingresa el lado 1 del triangulo");
        double lado1triangulo = scanner.nextDouble();
        System.out.println("Ingresa el lado 2 del triangulo");
        double lado2triangulo = scanner.nextDouble();
        System.out.println("Ingresa el lado 3 del triangulo");
        double lado3triangulo = scanner.nextDouble();
        System.out.println("Ingresa el largo del triangulo");
        double alturatriangulo = scanner.nextDouble();
        System.out.println("Ingresa la base del triangulo");
        double basetriangulo = scanner.nextDouble();

        Triangulo triangulo=new Triangulo(lado1triangulo,lado2triangulo,lado3triangulo,alturatriangulo,basetriangulo);
        Triangulo triangulo1 =new Triangulo(triangulo.ladot1,triangulo.ladot2,triangulo.ladot3,triangulo.base,triangulo.largot);
        Circulo circulo=new Circulo(radiocirculo);
        Cuadrado cuadrado=new Cuadrado(ladocuadrado);
        Rectangulo rectangulo=new Rectangulo(anchorectangulo,largorectangulo);
        Cuadrado cuadrado1 =new Cuadrado(cuadrado.getCuadra());
        Rectangulo rectangulo1 =new Rectangulo(rectangulo.getRectan(), rectangulo.getRectal());
        Circulo circulo1 =new Circulo(circulo.getCircu());
        cuadrado1.perimetrocua();
        cuadrado1.areacua();
        rectangulo1.perimetrorec();
        rectangulo1.arearec();
        circulo1.perimetrocir();
        circulo1.areacir();
        triangulo1.perimetrotri();
        triangulo1.areatri();
        scanner.close();
    }
}
