package PooInterface;

public class Quadrado implements FigurasGeo {

    int lado;

    @override
    public double getArea() {
        int arena = lado * lado;
        return arena;
    }

    @override
    public double getNome() {
        return "Quadrado";
    }

    @override
    public double getPerimetro(){
        int perimetro = 4*
        return perimetro;
    }
}
