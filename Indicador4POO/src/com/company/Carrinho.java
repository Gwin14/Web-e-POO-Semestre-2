package com.company;

import java.util.ArrayList;

public class Carrinho {

    private ArrayList<ItemDeCompra> items = new ArrayList<>();
    private Cliente cliente;

    public void adicionar(Produto prod, int qtd) {
        ItemDeCompra itemExistente = buscarItem(prod);

        if (itemExistente != null) {
            itemExistente.setQuantidade(itemExistente.getQuantidade() + qtd);
        } else {
            items.add(new ItemDeCompra(qtd, prod));
        }
    }

    public void remover(Produto prod, int qtd) {
        ItemDeCompra item = buscarItem(prod);

        if (item != null) {
            item.setQuantidade(item.getQuantidade() - qtd);
            if (item.getQuantidade() <= 0) {
                items.remove(item);
            }
        }
    }

    public void eliminar(Produto prod) {
        ItemDeCompra item = buscarItem(prod);
        if (item != null) {
            items.remove(item);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemDeCompra i : items) {
            total += i.getProduto().getPreco() * i.getQuantidade();
        }
        return total;
    }

    public ItemDeCompra buscarItem(Produto prod) {
        for (ItemDeCompra i : items) {
            if (i.getProduto().equals(prod)) {
                return i;
            }
        }
        return null;
    }

    // Getters e Setters
    public ArrayList<ItemDeCompra> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemDeCompra> items) {
        this.items = items;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
