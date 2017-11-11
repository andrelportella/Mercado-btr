package caixasupermercado;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

public class Venda {

    ArrayList listadeitens;
    Pagamento paga;

    public Venda() 
    {
        
        listadeitens = new ArrayList();
        
    }

    public void IncluirItemdeVenda(Especif e, int qtd) 
    {

        Scanner scanner = new Scanner(System.in);

        ItemDeVenda Item1 = new ItemDeVenda(e, qtd);
        listadeitens.add(Item1);

    }

    public float getTotal() 
    {
        
        float tot=0;
        Iterator i = listadeitens.iterator();
        while (i.hasNext()) {

            ItemDeVenda proximoItemDeVenda = (ItemDeVenda) i.next();
            tot = tot+proximoItemDeVenda.subTotal();
            
        }
        return tot;

    }
    
    public Float getTroco()
    {
        
        float tot = this.getTotal();
        float val = this.paga.valor;
        return (val-tot);
        
    }
    
    public void efetuarPagamento(float valorPago)
    {
        
        this.paga = new Pagamento(valorPago);
        
    }

}
