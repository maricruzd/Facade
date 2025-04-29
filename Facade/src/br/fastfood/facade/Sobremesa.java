package br.fastfood.facade;

import br.fastfood.model.ItemCombo;

public class Sobremesa implements ItemCombo {
    
    private String nome;
    private double preco;

    @Override
    public String getNome() {
        return nome;
    }
    @Override
    public double getPreco() {
        return preco;
    }
    public Sobremesa (String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

}