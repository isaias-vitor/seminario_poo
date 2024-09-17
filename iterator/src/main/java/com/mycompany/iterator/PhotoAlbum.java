/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 *
 * @author isaias-vitor
 */
class PhotoAlbum implements Iterable<String> {

    private List<String> photos = new ArrayList<>();

    public void addPhoto(String photo) {
        photos.add(photo);
    }

    @Override
    public Iterator<String> iterator() {
        return photos.iterator();
    }
}
