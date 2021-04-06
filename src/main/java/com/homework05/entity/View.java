package com.homework05.entity;

import java.nio.channels.Pipe;

public abstract class View {
    private Clickable Clicable;
    public Clickable getClicable() {
        return this.Clicable;
    }
    public void setClicable(Clickable clickable){
        this.Clicable=clickable;
    }
}

