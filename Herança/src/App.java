public class App {
    public static void main(String[] args) throws Exception {
        // declarando atributos
        Mensalista men1, men2;
        Horista hora1, hora2;
 
        //------------------Empregados mensalistas---------------------------------
 
        men1 = new Mensalista("Julia", "Rua Vinte e dois","Junior"); // instanciando a classe e passando valores
       
        // calculando salario
        men1.calcularSalario();
 
        // calculando inss
        men1.calcularInss();
 
        // calculando irpf
        men1.calcularIrpf();
 
        // imprimindo
        men1.imprimir_M();
 
        men2 = new Mensalista("Vitor", "Avenida Brasil","Pleno");
 
        //calculando salario
        men2.calcularSalario();
 
        //calculando Inss
        men2.calcularInss();
 
        //calculando Irpf
        men2.calcularIrpf();
 
        // imprimindo
        men2.imprimir_M();
 
 
        //--------------------- empregados horistas---------------------------------------
        hora1 = new Horista("Cristina", "Rua Paralelepípedo", 30,46);
 
        // calculando salario
        hora1.calcularSalario();
 
        //calculando Inss
        hora1.calcularInss();
 
        // imprimindo
        hora1.imprimir_H();
 
        hora2 = new Horista("Brunna", "Estrada Lajeado velho", 40,70);
 
        // calculando salario
        hora2.calcularSalario();
 
        //calculando Inss
        hora2.calcularInss();
 
 
        // imprimindo
        hora2.imprimir_H();
 
    
    }
}
