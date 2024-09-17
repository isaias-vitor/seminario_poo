/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

/**
 *
 * @author isaias-vitor
 */
public class Tree {
    private String type;    // Tipo da árvore (ex: Carvalho, Pinheiro)
    private String color;   // Cor das folhas da árvore
    private String texture; // Textura da casca da árvore

    // Construtor para definir os atributos da árvore
    public Tree(String type, String color, String texture) {
        this.type = type;
        this.color = color;
        this.texture = texture;
    }

    // Método para exibir as características da árvore em uma determinada posição
    // Note que as coordenadas x e y não fazem parte do estado compartilhado
    public void display(int x, int y) {
        System.out.println("Exibindo " + type + " na posição (" + x + ", " + y + 
            ") com cor " + color + " e textura " + texture);
    }
}
