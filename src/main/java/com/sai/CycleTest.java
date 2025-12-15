package com.sai;

public class CycleTest {
	
    public CycleTest(int cmark) {
		super();
		this.cmark = cmark;
		System.out.println(cmark + "Using Const arg");
	}

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
