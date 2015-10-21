package ccccccc;

import junit.framework.TestCase;

public class volumeTest extends TestCase{
	  volume mu = new volume();
		public void testbodar() {
		    System.out.println("-------边界条件测试--------");
		    boolean flag=mu.fun(1005);
		    System.out.println(flag);
		}
	    public void testjiekou(){
	        System.out.println("-------接口测试--------");
	        boolean flag=mu.fun(6);
	        System.out.println(flag);
	    }
	    public void testfalse(){
	        System.out.println("-------容错性测试--------");
	        boolean flag=mu.fun(-2);
	        System.out.println(flag);
	    }
}
