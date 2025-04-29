package br.fastfood.facade;

import br.fastfood.model.ItemCombo;

public class Combo {
    private Burger burger;
    private Bebida bebida;
    private Sobremesa sobremesa;

    public Combo(Burger burger, Bebida bebida, Sobremesa sobremesa) {
        this.burger = burger;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public double getPreco(){
        return burger.getPreco() + bebida.getPreco() + sobremesa.getPreco();
    }

    public String getBurger() {
        return burger.getNome();
    }

    public String getBebida() {
        return bebida.getNome();
    }

    public String getSobremesa() {
        return sobremesa.getNome();
    }
}
