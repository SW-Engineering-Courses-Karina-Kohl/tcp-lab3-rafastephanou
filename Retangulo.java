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
    return altura * largura;
   }

    @Override
   public double calcularPerimetro(){
   return (altura + largura) * 2;

   }

    @Override
   public String getTipoFigura(){
    return "Retângulo";
   }

   @Override
   public String getDetalhes(){
    return "Tipo: " + getTipoFigura() + "\nCor: " + getCor() + "\nAltura: " + altura + "\nLargura: " + largura + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
   }


}
