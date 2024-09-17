/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.flyweight;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * @author isaias-vitor
 */
public class TreeFactory {
    // Mapa que armazena as árvores já criadas para evitar duplicatas
    private static Map<String, Tree> treeMap = new HashMap<>();

    // Método que retorna uma instância de árvore (pode ser nova ou reutilizada)
    public static Tree getTree(String type, String color, String texture) {
        String key = type + "-" + color + "-" + texture; // Cria uma chave única para a árvore

        // Se não existir uma árvore com esse tipo, cor e textura, criamos uma nova
        if (!treeMap.containsKey(key)) {
            Tree tree = new Tree(type, color, texture); // Criação de nova árvore
            treeMap.put(key, tree); // Armazena a nova árvore no mapa
            System.out.println("Criando nova árvore: " + key);
        }

        // Retorna a árvore, seja nova ou reutilizada
        return treeMap.get(key);
    }
}
