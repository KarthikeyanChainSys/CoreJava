package com.chainsys.entrypoint;

import com.chainsys.exceptions.*;
/***
 * @author karthi251199
 * @version 1.0
 * @category Classroom lessons
 * Purpose: entry point class for the entire project
 */
public class Startup {

	/***
	 * Purpose portable executable entry point for the lessons
	 * @param args type string
	 * return void
	 */
	  public static void main(String[] args) {
		  //DemoA.taskA();
		  DemoTrace.m1();
		  
		  
		  /* Calculator calculator = null;
          int result = 0;
          System.out.println("Before Try- Catch-finally");
try {
      calculator = new Calculator();
  result = calculator.divide(100, 25);
  System.out.println(result);
}catch(Exception err){
      String msg = err.getMessage();
      System.out.println(msg);
}

finally {
      System.out.println("Inside Finally");
}
System.out.println("After Try- catch-finally");
}*/
  }
}