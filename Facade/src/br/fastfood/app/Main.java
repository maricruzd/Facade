// após implementar as classes solicitada remova os comentarios
// pa
package br.fastfood.app;
import br.fastfood.facade.ComboFacade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("=== Menu de Combos ===");
        System.out.println("1 – Combo Simples");
        System.out.println("2 – Combo Natural");
        System.out.println("2 – Combo Premium");
        System.out.print("Combo selecionado: ");
        int escolha = in.nextInt();


        ComboFacade facade = new ComboFacade();
        facade.criarCombo(escolha);
        facade.exibirItens();
        System.out.printf("Total a pagar: R$ %.2f%n", facade.getPrecoTotal());



    }
}