package com.sai;

public class CycleTest {
    public int getCmark() {
        return cmark;
    }

    public void setCmark(int cmark) {
        this.cmark = cmark;
    }

    private int cmark;
    CycleTest(){
        System.out.println("Inside Cycle test..");
    }
}
