import junit.framework.TestCase;


public class wanshuTest extends TestCase{

    wanshu mu = new wanshu();
	public void testbodar() {
	    System.out.println("-------�߽���������--------");
	    boolean flag=mu.fun(2, 12032);
	    System.out.println(flag);
	}
    public void testjiekou(){
        System.out.println("-------�ӿڲ���--------");
        boolean flag=mu.fun(100, 999);
        System.out.println(flag);
    }
    public void testfalse(){
        System.out.println("-------�ݴ��Բ���--------");
        boolean flag=mu.fun(-100, 100);
        System.out.println(flag);
    } 

}
