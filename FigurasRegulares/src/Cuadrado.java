
public class Cuadrado {

    double ladoc;

    public Cuadrado(double ladoc){
        this.ladoc=ladoc;
    }
    public double getCuadra(){
        return ladoc;
    }

    public void perimetrocua(){
        System.out.println("El perimetro del cuadrado es de: "+(4*ladoc));
    }
    public void areacua(){
        System.out.println("El area del cuadrado es de: "+(ladoc*ladoc));
    }

}