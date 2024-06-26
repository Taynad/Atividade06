public class Mensalista extends Empregado {
     // declarando atributos
     private String cargo;
 
 
     // construtores
     public Mensalista(String nome, String endereco, String cargo) {
         super(nome, endereco);
         this.cargo = cargo;
     }
  
     // sobrecarga de construtor
     public Mensalista() {
        
     }
  
     // método acessor
     public String getCargo() {
         return cargo;
     }
  
     public void setCargo(String cargo) {
         this.cargo = cargo;
     }
  
  
    
     public void calcularSalario (){
         if (cargo.equals("Junior")){
             salario = 2500;
  
         }else if (cargo.equals("Pleno")){
             salario = 3500;
  
         }else if(cargo.equals("Senior")){
             salario = 5500;
         }else {
             System.out.println("Dado incorreto");
         }
     }
  
  
     // método para imprimir
     public void imprimir_M() {
         System.out.println("=========================");
         System.out.println("Nome: " + getNome());
         System.out.println("Endereço: " + getEndereço());
         System.out.println("Cargo: " + getCargo());
         System.out.println("Salario: " + getSalario());
         System.out.println("Valor Inss: " + calcularInss());
         System.out.printf("Valor Irpf: %.2f \n", calcularIrpf());
         System.out.println("=========================\n");
     }
  
    
    
    
}
