public class CarroEletrico extends Carro{
    double ef_eletrico;
    
    public CarroCombustao(int ID_carro,String Nome_carro, String Marca_carro,int ano_carro,String categoria_carro) {
        
        super(ID_carro,Nome_carro,Marca_carro,ano_carro,categoria_carro);
        this.ef_eletrico =  ef_eletrico;
    }

    public cadastrarViagem(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite a distãncia total da viagem em km");
        double DKM= teclado.nextDouble();
        
        System.out.println("Digite o preço da gasolina total ")
        double PGL = teclado.nextDouble();
        
        System.out.println("digite a sua velocidade média e/ou a velocidade autorizada da via");
        double VM = teclado.nextDouble();
        
        double gasto_gasolina = DKM / ef_combustao
        double gasto_valor_total = gasto_gasolina  * PGL
        double gasto_tempo = DKM /VM


        System.out.println("A distância de: " + DKM + " km será percorrida em " + gasto_tempo + " horas, e você gastará: R$ " + gasto_valor_total);

        
        
        ///validação usando ifs, retornar texto
        
        
        
        

}
    
    
};