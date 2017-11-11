
package caixasupermercado;
import java.util.Scanner;
import java.util.ArrayList;
public class Registradora {
  
    
    
    private Catalogo CatLog;
    Venda minhaVenda;
    float valortotal;
    
    
    public Registradora ()
    {
         CatLog = new Catalogo ();     
    }
    
    
    public void iniciarVenda()
    {
    
     minhaVenda = new Venda();
          
    }
    
    public void incluirVenda(int idprod, int qtd)
    {
        
    Especif  e = CatLog.buscaprod(idprod);
    minhaVenda.IncluirItemdeVenda(e, qtd);
          
    }

   
    public float concluirVenda() 
    {
    
    float total = minhaVenda.getTotal();
    return total;
   
     
    }

    void valorPagamento(float valor) 
    {   
 
    float valortroco = (valor - valortotal);
    System.out.println(valortroco);  
      
    }
    
    public void pagamento(float valorPago)
    {
        
        minhaVenda.efetuarPagamento(valorPago);
        
    } 
    
    public Float getTroco()
    {
        
        float troco = minhaVenda.getTroco();
        return troco;
        
    }
}
