public abstract class Carro {
    int ID_carro;
    String Nome_carro;
    String Marca_carro;
    int ano_carro;
    String categoria_carro;
    


  public Carro(int ID_carro,String Nome_carro,String Marca_carro, int ano_carro, String categoria_carro){
      
      super();
      this.ID_carro = ID_carro;
      this.Nome_carro = Nome_carro;
      this.Marca_carro = Marca_carro;
      this.ano_carro = ano_carro;
      this.categoria_carro = categoria_carro;
  }
  
  public abstract double cadastrarViagem();
     
    
}


