public class TrianguloEquilatero extends FiguraGeometrica{

    private double lado;

    public double getLado(){
        return lado;
    }

    public void setLado(double lado){
        this.lado = lado;
    }

    public TrianguloEquilatero(String cor, double lado){
        super(cor);
        this.lado = lado;
    }

    public double calcularArea(){
        return (Math.pow(lado,2) * Math.sqrt(3))/4.0;
    }

    public double calcularPerimetro(){
        return 3 * lado;
    }

    @Override
    public String getTipoFigura(){
        return "Triângulo Equilátero";
    }

    @Override
    public String getDetalhes(){
    return "Tipo: " + getTipoFigura() + "\nCor: " + getCor() + "\nLado: " + lado +  "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
   }
}