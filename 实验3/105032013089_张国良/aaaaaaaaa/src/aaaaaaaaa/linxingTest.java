package aaaaaaaaa;

import junit.framework.TestCase;

public class linxingTest extends TestCase{
    linxing mu = new linxing();
	public void testbodar() {
	    System.out.println("-------�߽���������--------");
	    boolean flag=mu.fun(1005);
	    System.out.println(flag);
	}
    public void testjiekou(){
        System.out.println("-------�ӿڲ���--------");
        boolean flag=mu.fun(9);
        System.out.println(flag);
    }
    public void testfalse(){
        System.out.println("-------�ݴ��Բ���--------");
        boolean flag=mu.fun(-2);
        System.out.println(flag);
    }


}
