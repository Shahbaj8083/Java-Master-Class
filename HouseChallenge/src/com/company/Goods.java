package com.company;

public class Goods {
    private int furnitures;
    private int freeze;
    private int cooler;

    public Goods(int furnitures, int freeze, int cooler) {
        this.furnitures = furnitures;
        this.freeze = freeze;
        this.cooler = cooler;
    }

    public int getFurnitures() {
        return furnitures;
    }

    public int getFreeze() {
        return freeze;
    }

    public int getCooler() {
        return cooler;
    }

    public void setFurnitures(int furnitures) {
        this.furnitures = furnitures;
    }

    public void setFreeze(int freeze) {
        this.freeze = freeze;
    }

    public void setCooler(int cooler) {
        this.cooler = cooler;
    }
}
