/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemploIterator;

/**
 *
 * @author isaias-vitor
 */

class Channel {
    private String name;
    private ChannelTypeEnum type;
    
    public Channel(String name, ChannelTypeEnum type) {
        this.name = name;
        this.type = type;
    }
    
    public String getName() {
        return name;
    }
    
    public ChannelTypeEnum getType() {
        return type;
    }
}
