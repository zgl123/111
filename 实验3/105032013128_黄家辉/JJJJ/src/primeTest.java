import junit.framework.TestCase;

public class primeTest extends TestCase{
        
	    prime mu = new prime();
		public void testbodar() {
		    System.out.println("-------边界条件测试--------");
		    boolean flag=mu.isprime(1005);
		    System.out.println(flag);
		}
	    public void testjiekou(){
	        System.out.println("-------接口测试--------");
	        boolean flag=mu.isprime(9);
	        System.out.println(flag);
	    }
	    public void testfalse(){
	        System.out.println("-------容错性测试--------");
	        boolean flag=mu.isprime(-2);
	        System.out.println(flag);
	    }
}
