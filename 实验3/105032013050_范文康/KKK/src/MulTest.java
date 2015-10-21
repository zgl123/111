import junit.framework.TestCase;

public class MulTest extends TestCase{
    Mul mu = new Mul();
	public void testbodar() {
	    System.out.println("-------边界条件测试--------");
	    int flag=mu.mul(-2,-3);
	    System.out.println(flag);
	}
    public void testjiekou(){
        System.out.println("-------接口测试--------");
        int flag=mu.mul(2,3);
        System.out.println(flag);
    }
    public void testfalse(){
        System.out.println("-------容错性测试--------");
        double flag=mu.divide(2.0, 0.0);
        System.out.println(flag);
    }
}


