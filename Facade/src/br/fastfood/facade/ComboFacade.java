package br.fastfood.facade;

import br.fastfood.model.*;

public class ComboFacade {
    private Combo combo;

    public void criarCombo(int codigo) {

        switch (codigo) {
            case 1:
                combo = new Combo(
                        new Burger("X-Burger", 13.0),
                        new Bebida("Soda", 5.0),
                        new Sobremesa("Milkshake", 7.0)
                );
                break;
            case 2:
                combo = new Combo(
                        new Burger("X-Salada", 15.0),
                        new Bebida("Suco Natural", 7.0),
                        new Sobremesa("Sundae", 4.0)
                );
                break;
            case 3:
                combo = new Combo(
                        new Burger("X-Tudo", 20.0),
                        new Bebida("Coca-Cola", 4.0),
                        new Sobremesa("Casquinha", 2.5)
                );
                break;
            default:
                System.out.println("Combo inválido!");
                combo = null;
        }
    }

    public void exibirItens() {
        if (combo == null) {
            System.out.println("Nenhum combo selecionado.");
            return;
        }
        System.out.println("Seu combo:");
        System.out.println("- " + combo.getBurger());
        System.out.println("- " + combo.getBebida());
        System.out.println("- " + combo.getSobremesa());
    }

    public double getPrecoTotal() {
        return combo.getPreco();
    }

}