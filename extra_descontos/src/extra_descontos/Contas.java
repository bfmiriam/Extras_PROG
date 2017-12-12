
package extra_descontos;


public class Contas {
    
    public double precio, unidades;
    public double ptotal;
    
public Contas(){
    
}
public Contas(double precio, double unidades){
    this.precio=precio;
    this.unidades=unidades; 
    ptotal=precio*unidades;
}
public void senDesconto(){
   
     System.out.println("O precio total sen desconto é: "+ptotal);
    
}

public void descontos(){
    if(unidades>100){
        if (unidades<200){
            if (precio>4000){
                System.out.println("Precio con desconto do 5%: "+(ptotal-unidades*precio*0.05)); 
            }
            else {
                System.out.println("Precio con desconto do 2%: "+(ptotal-unidades*precio*0.02));  
            }
            
        }
        else if(precio>=4000){
            System.out.println("Precio con desconto do 10%: "+(ptotal-unidades*precio*0.1));
            }
            else{
            System.out.println("Precio con desconto do 8%: "+(ptotal-unidades*precio*0.08));
            }
         
    }
    else{
        System.out.println("Non hai descontos");
    }
}









/**public void descontos(){
    if(unidades>100){
        if ((unidades<200)){
            if (precio>4000){
                System.out.println("Precio con desconto do 5%: "+(ptotal-unidades*precio*0.05)); 
            }
            else {
                System.out.println("Precio con desconto do 2%: "+(ptotal-unidades*precio*0.02));  
            }
            
        }
        else if(precio>=4000){
            System.out.println("Precio con desconto do 10%: "+(ptotal-unidades*precio*0.1));
            }
            else{
            System.out.println("Precio con desconto do 8%: "+(ptotal-unidades*precio*0.08));
            }
         
    }
    else{
        System.out.println("Non hai descontos");
    }*/





        

            
      
    
    

            
            

}
