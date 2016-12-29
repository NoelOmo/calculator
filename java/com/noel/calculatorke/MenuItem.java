package com.noel.calculatorke;

/**
 * Created by Noel on 12/28/2016.
 */
public class MenuItem {
    private final int name;
    private final int imageResource;


    public MenuItem(int name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public int getName() {
        return name;
    }

    public int getImageResource() {
        return imageResource;
    }

}
