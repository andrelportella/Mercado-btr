/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixasupermercado;

/**
 *
 * @author 152051761
 */
class Especif {

    int idprod;
    String nomeprod;
    float valorprod;

    @Override
    public String toString() {
        return "Especif" + "idprod" + idprod + "nomeprod" + nomeprod + "valorprod" + valorprod;
    }

    public Especif(int idprod, String nomeprod, float valorprod) {
        this.idprod = idprod;
        this.nomeprod = nomeprod;
        this.valorprod = valorprod;

    }
    
     public float getPreco(){
        return this.valorprod;
        
    }

}
