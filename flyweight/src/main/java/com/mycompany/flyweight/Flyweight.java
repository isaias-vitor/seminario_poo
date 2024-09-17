/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.flyweight;

/**
 *
 * @author isaias-vitor
 */
public class Flyweight {

    public static void main(String[] args) {
        // Solicitamos à fábrica de árvores (TreeFactory) uma árvore do tipo Carvalho
        // Como é a primeira solicitação com essas características, ela criará uma nova árvore
        Tree tree1 = TreeFactory.getTree("Carvalho", "Verde", "Rugosa");
        tree1.display(10, 20); // Exibimos a árvore na posição (10, 20)

        // Agora solicitamos uma árvore do mesmo tipo, cor e textura
        // Neste caso, a fábrica reutilizará a árvore existente
        Tree tree2 = TreeFactory.getTree("Carvalho", "Verde", "Rugosa");
        tree2.display(30, 40); // Exibimos a árvore na posição (30, 40)

        // Solicitamos uma árvore diferente (outro tipo ou textura)
        // Uma nova instância será criada
        Tree tree3 = TreeFactory.getTree("Pinheiro", "Verde", "Lisa");
        tree3.display(50, 60); // Exibimos a nova árvore na posição (50, 60)
    }
}
