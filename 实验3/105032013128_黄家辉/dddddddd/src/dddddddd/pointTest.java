package dddddddd;


import junit.framework.TestCase;

public class pointTest extends TestCase{

	  point mu = new point();
		public void testbodar() {
		    System.out.println("-------�߽���������--------");
		    boolean flag=mu.fun(12,12,12,21);
		    System.out.println(flag);
		}
	    public void testjiekou(){
	        System.out.println("-------�ӿڲ���--------");
	        boolean flag=mu.fun(2,1,3,4);
	        System.out.println(flag);
	    }
	    public void testfalse(){
	        System.out.println("-------�ݴ��Բ���--------");
	        boolean flag=mu.fun(-2,-41,-3,-4);
	        System.out.println(flag);
	    }
}
