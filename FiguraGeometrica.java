public abstract class FiguraGeometrica implements CalculosGeometricos{
  
    private String cor;
    private int id;
    private static int totalFiguras = 0;
   
    public FiguraGeometrica(String cor)
    {
        this.cor = cor;
        this.id = ++totalFiguras;
    }

    public static int getTotalFiguras()
    {
        return totalFiguras;
    }

    public String getCor()
    {
        return cor;
    }

    public int getId()
    {
        return id;
    }

    public void setCor(String cor )
    {
        this.cor = cor;
    }

    public void setId(int id)
    {
        this.id = id;
    }

}

