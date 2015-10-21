package bbbbb;

import junit.framework.TestCase;

public class yhTest extends TestCase{

    yh mu = new yh();
	public void testbodar() {
	    System.out.println("-------边界条件测试--------");
	    boolean flag=mu.fun(1005);
	    System.out.println(flag);
	}
    public void testjiekou(){
        System.out.println("-------接口测试--------");
        boolean flag=mu.fun(5);
        System.out.println(flag);
    }
    public void testfalse(){
        System.out.println("-------容错性测试--------");
        boolean flag=mu.fun(-2);
        System.out.println(flag);
    }
}
