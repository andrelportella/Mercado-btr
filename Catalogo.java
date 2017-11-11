package caixasupermercado;

import java.util.HashMap;

public class Catalogo {

    HashMap<Integer, Especif> hashEspecProduto;

    public Catalogo() {
        hashEspecProduto = new HashMap();
        Especif e1 = new Especif(01, "Arroz", 5.00f);
        Especif e2 = new Especif(02, "Feijão", 6.00f);
        Especif e3 = new Especif(03, "Macarrão", 3.00f);

        hashEspecProduto.put(01, e1);
        hashEspecProduto.put(02, e2);
        hashEspecProduto.put(03, e3);

    }

    public Especif buscaprod(int cod) {
        return hashEspecProduto.get(cod);

    }

}
