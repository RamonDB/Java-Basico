package aulas.oo.part02.construtores.exemplo003;

public class Carro {

   private String marca;
   private String modelo;
   private String ano ;
   private String variante;
   private String dono;


    public Carro() {
   }

    public Carro(String marca, String ano, String modelo) {
        this.marca = marca;
        this.ano = ano;
        this.modelo = modelo;
    }


    public String getCarro(){
       return "A marca do carro é " + marca + ", o modelo do carro é " + modelo + ", o ano do carro é " + ano;
   }
}
