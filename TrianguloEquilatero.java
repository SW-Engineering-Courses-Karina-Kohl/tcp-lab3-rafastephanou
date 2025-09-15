public class TrianguloEquilatero extends FiguraGeometrica{

    private double lado;

    public double getLado(){
        return lado;
    }

    public setLado(double lado){
        this.lado = lado;
    }

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public double calcularArea(){
        double area = (Math.pow(lado,2) * Math.sqrt(3,2))/4;
        return area;
    }

    public double calcularPerimetro(){
        double perimetro = 3 * lado;
        return perimetro;    
    }

    public String retornaTipoFigura(){
        return "Triângulo Equilátero";
    }

    // Implenentar get info e get details
}