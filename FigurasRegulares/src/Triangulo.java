public class Triangulo {
    double ladot1;
    double ladot2;
    double ladot3;
    double largot;
    double base;

    public Triangulo(double ladot1,double ladot2,double ladot3, double largot, double base){
        this.ladot1=ladot1;
        this.ladot2=ladot2;
        this.ladot3=ladot3;
        this.largot=largot;
        this.base=base;
    }
    public double getTrian1(){
        return ladot1;
    }
    public double getTrian2(){
        return ladot2;
    }
    public double getTrian3(){
        return ladot3;
    }
    public double getTrianl(){
        return largot;
    }
    public double getTrianb(){
        return base;
    }

    public void perimetrotri(){
        System.out.println("El perimetro del rectangulo es de: "+(ladot1+ladot2+ladot3));
    }
    public void areatri(){
        System.out.println("El area del rectangulo es de: "+((largot*base)/2));
    }
}
