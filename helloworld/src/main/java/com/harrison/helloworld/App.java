package com.harrison.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
	private Output op1;
	
    public Output getOp1() {
		return op1;
	}

	public void setOp1(Output op1) {
		this.op1 = op1;
	}
	
	public void setMsg() {
		op1.setMsg("Hello World");
	}
	
	public String printMsg() {
		return op1.getMsg();
	}

	public static void main( String[] args ) {
        System.out.println("Hello World");
    }
}
