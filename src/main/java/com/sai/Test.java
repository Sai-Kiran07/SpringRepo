package com.sai;

public class Test {

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    private int mark;
    Test(){
        System.out.println("Inside test...");
    }
	void test() {
		System.out.println("Testing..");
	}
}
