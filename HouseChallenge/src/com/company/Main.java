package com.company;

public class Main {

    public static void main(String[] args) {
	Wall wall1=new Wall(true,2);

    Goods goods1=new Goods(4,1,1);

    Room room=new Room(wall1,goods1);
        System.out.println(room.getGoods().getCooler());
        System.out.println(room.getWall().wallCharacter());
    }
}
