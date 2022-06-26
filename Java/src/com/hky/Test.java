package com.hky;

public class Test {
    public static void main(String[] args) {
        BlackAndWhitePrint blackAndWhitePrint = new BlackAndWhitePrint();
        blackAndWhitePrint.print();

        ColorPrint colorPrint = new ColorPrint();
        colorPrint.print();
        colorPrint.print("蓝色");
        colorPrint.print("粉色");
        colorPrint.print("黄色");
    }
}
