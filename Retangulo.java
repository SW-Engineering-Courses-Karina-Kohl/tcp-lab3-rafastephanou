public class Retangulo extends FiguraGeometrica {
   private double altura;
   private double largura; 

   public double getAltura(){
    return altura;
   }

   public double getLargura(){
    return largura;
   }

   public void setAltura(double altura){
    this.altura = altura;
   }

   public void setLargura(double largura){
    this.largura = largura;
   }

   public Retangulo(String cor, double altura, double largura){
    super(cor);
    this.altura = altura;
    this.largura = largura;
   }

    @Override
   public double calcularArea()
   {
    double area = altura * largura;
    return area;
   }

    @Override
   public double calcularPerimetro(){
    double perimetro = (altura + largura) * 2;
    return perimetro;
   }

    @Override
   public String getTipoFigura(){
    return "Retângulo";
   }

   //get detalhes
}
