package caixasupermercado;

class ItemDeVenda {

    Especif prod;
    int qtd;

    public ItemDeVenda(Especif prod, int qtd) {

        
        this.prod = prod;
        this.qtd = qtd;
        
    }
    
    public Float subTotal(){
        
    return(prod.getPreco() * this.qtd);
    
    }

}
