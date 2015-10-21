package dddddddd;


import junit.framework.TestCase;

public class pointTest extends TestCase{

	  point mu = new point();
		public void testbodar() {
		    System.out.println("-------边界条件测试--------");
		    boolean flag=mu.fun(12,12,12,21);
		    System.out.println(flag);
		}
	    public void testjiekou(){
	        System.out.println("-------接口测试--------");
	        boolean flag=mu.fun(2,1,3,4);
	        System.out.println(flag);
	    }
	    public void testfalse(){
	        System.out.println("-------容错性测试--------");
	        boolean flag=mu.fun(-2,-41,-3,-4);
	        System.out.println(flag);
	    }
}
