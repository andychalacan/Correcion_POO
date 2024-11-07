public class Rectangulo {
    double anchor;
    double alturar;

    public Rectangulo(double anchor,double alturar){
        this.anchor=anchor;
        this.alturar=alturar;
    }
    public double getRectan(){
        return anchor;
    }
    public double getRectal(){
        return alturar;
    }

    public void perimetrorec(){
        System.out.println("El perimetro del rectangulo es de: "+(anchor+alturar+anchor+alturar));
    }
    public void arearec(){
        System.out.println("El area del rectangulo es de: "+(alturar*anchor));
    }
}
