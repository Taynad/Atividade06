public class Horista extends Empregado {
      // declarando atributos
      private double horas;
      private double v1_horas;
   
      // construtores
      public Horista(String nome, String endereco, double horas, double v1_horas) {
          super(nome, endereco);
          this.horas = horas;
          this.v1_horas = v1_horas;
         
          // atributo declarado na classe local
          this.horas = horas;
      }
   
      // sobrecarga de construtor
      public Horista() {    
      }
   
      // métodos acessores
      public double getHoras() {
          return horas;
      }
   
      public void setHoras(double horas) {
          this.horas = horas;
      }
   
      // método calculo de salario horista
      public void calcularSalario(){
          salario = horas * v1_horas;
      }
   
      // método para imprimir
      public void imprimir_H(){
          System.out.println("=========================");
          System.out.println("Nome: " + getNome());
          System.out.println("Endereço: " + getEndereço());
          System.out.println("Salario: " + getSalario());
          System.out.println("Valor Inss: " + calcularInss());
          System.out.println("=========================\n");
   
   
      }
   
    
}
