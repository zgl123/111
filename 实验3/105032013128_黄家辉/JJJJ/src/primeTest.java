import junit.framework.TestCase;

public class primeTest extends TestCase{
        
	    prime mu = new prime();
		public void testbodar() {
		    System.out.println("-------�߽���������--------");
		    boolean flag=mu.isprime(1005);
		    System.out.println(flag);
		}
	    public void testjiekou(){
	        System.out.println("-------�ӿڲ���--------");
	        boolean flag=mu.isprime(9);
	        System.out.println(flag);
	    }
	    public void testfalse(){
	        System.out.println("-------�ݴ��Բ���--------");
	        boolean flag=mu.isprime(-2);
	        System.out.println(flag);
	    }
}
