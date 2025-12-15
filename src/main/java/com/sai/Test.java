package com.sai;

import java.beans.ConstructorProperties;

public class Test {
	
	private CycleTest cycle;
	
	@ConstructorProperties({"cycle","mark"})
    public Test(CycleTest cycle, int mark) {
		super();
		this.cycle = cycle;
		this.mark = mark;
		System.out.println("Inside test's parameterized constructor...");
	}

	public void setCycle(CycleTest cycle) {
		this.cycle = cycle;
	}

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
	
	void display() {
		cycle.distribute();
	}
}
