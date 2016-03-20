package com.harrison.helloworld;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args ) {
		Output op = new Output();
		op.setMsg("Hello World");
        System.out.println(op.getMsg());
    }
}