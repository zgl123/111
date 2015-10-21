import junit.framework.TestCase;


public class wanshuTest extends TestCase{

    wanshu mu = new wanshu();
	public void testbodar() {
	    System.out.println("-------边界条件测试--------");
	    boolean flag=mu.fun(2, 12032);
	    System.out.println(flag);
	}
    public void testjiekou(){
        System.out.println("-------接口测试--------");
        boolean flag=mu.fun(100, 999);
        System.out.println(flag);
    }
    public void testfalse(){
        System.out.println("-------容错性测试--------");
        boolean flag=mu.fun(-100, 100);
        System.out.println(flag);
    } 

}
