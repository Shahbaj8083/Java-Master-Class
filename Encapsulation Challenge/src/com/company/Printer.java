package com.company;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>-1 && tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }else {
            this.tonerLevel=-1;
        }
        this.duplex = duplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount>100){
                return -1;
            }else
                return this.tonerLevel;
        }
        return -1;
    }
    public int printPages(int page){
        int pagesToPrint=page;
        if(this.duplex){
            pagesToPrint=(page/2+page%2);
            System.out.println("Printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }
    public int getPagesPrinted(){
        return this.pagesPrinted;
    }
}
