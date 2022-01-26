package com.company;

public class Room {
    private Wall wall;
    private Goods goods;

    public Room(Wall wall, Goods goods) {
        this.wall = wall;
        this.goods = goods;
    }

    public Wall getWall() {
        return wall;
    }

    public Goods getGoods() {
        return goods;
    }
}
