
package extra_descontos;

import java.util.Scanner;


public class Extra_descontos {

   
    public static void main(String[] args) {
        
        Scanner ler= new Scanner(System.in);
        
     System.out.println("Introduce número de unidades vendidas: ");
     double unidades=ler.nextDouble();
     System.out.println("Introduce precio do artigo: ");
     double precio=ler.nextDouble();
     
     
     
        Contas obj=new Contas(precio, unidades); 
        
   
      obj.senDesconto();
    
      obj.descontos();
    
    
    }
    
}
