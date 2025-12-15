package com.sai;

public class CycleTest {
    public int getCmark() {
        return cmark;
    }

    public void setCmark(int cmark) {
        this.cmark = cmark;
    }
    
    void distribute() {
    	System.out.println("Distributing paper....");
    }

    private int cmark;
    CycleTest(){
        System.out.println("Inside Cycle test..");
    }
}
