/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exemploiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author isaias-vitor
 */
public class ExemploIterator {

    public static void main(String[] args) {
        // Criando um novo álbum de fotos com capacidade para 5 fotos
        PhotoAlbum album = new PhotoAlbum(5);

        // Adicionando fotos ao álbum
        album.addPhoto("Foto 1: Paisagem");
        album.addPhoto("Foto 2: Praia");
        album.addPhoto("Foto 3: Montanha");
        album.addPhoto("Foto 4: Cidade");

        // Obtendo o iterador explícito do álbum
        Iterator<String> photoIterator = album.iterator();

        // Usando o Iterator explicitamente para percorrer as fotos
        System.out.println("Percorrendo as fotos do álbum:");
        while (photoIterator.hasNext()) {
            String photo = photoIterator.next();
            System.out.println(photo);
        }

        // Tentando acessar além do limite para mostrar o comportamento do Iterator
        try {
            photoIterator.next(); // Isso lançará uma exceção, pois não há mais fotos
        } catch (NoSuchElementException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
