public class Circulo {
    double pi=3.15;
    double radio;

    public Circulo(double radio){
        this.radio=radio;
    }
    public double getCircu(){
        return radio;
    }

    public void perimetrocir(){
        System.out.println("El perimetro del cuadrado es de: "+(pi*(radio*2)));
    }
    public void areacir(){
        System.out.println("El area del cuadrado es de: "+(pi*(radio*radio)));
    }

}


