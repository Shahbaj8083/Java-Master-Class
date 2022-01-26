package com.company;

public class Main {

    public static void main(String[] args) {
	Printer printer=new Printer(50,true);
    printer.printPages(13);
        System.out.println(printer.getPagesPrinted());
        System.out.println(printer.addToner(50));
    }
}
