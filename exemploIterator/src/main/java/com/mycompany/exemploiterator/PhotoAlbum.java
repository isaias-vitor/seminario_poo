/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploiterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author isaias-vitor
 */

class PhotoAlbum implements Iterable<String> {
    private String[] photos;
    private int size = 0;

    // Construtor que define a capacidade do álbum
    public PhotoAlbum(int capacity) {
        photos = new String[capacity];
    }

    // Método para adicionar fotos ao álbum
    public void addPhoto(String photo) {
        if (size < photos.length) {
            photos[size++] = photo;
        } else {
            System.out.println("O álbum está cheio! Não é possível adicionar mais fotos.");
        }
    }

    // Implementação do método iterator() que retorna um PhotoIterator
    @Override
    public Iterator<String> iterator() {
        return new PhotoIterator();
    }

    // Classe interna que implementa o Iterator de forma explícita
    private class PhotoIterator implements Iterator<String> {
        private int currentIndex = 0;

        // Verifica se há uma próxima foto no álbum
        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        // Retorna a próxima foto
        @Override
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException("Não há mais fotos no álbum.");
            }
            return photos[currentIndex++];
        }

        // Remover foto não é suportado
        @Override
        public void remove() {
            throw new UnsupportedOperationException("Remoção de fotos não é suportada.");
        }
    }
}