package br.fastfood.facade;

import br.fastfood.model.ItemCombo;

public class Burger implements ItemCombo {
    private String nome;
    private double preco;

    public Burger(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}

