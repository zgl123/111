public class Mul{
	
public int mul(int x,int y) {
	
	    if(x<0||y<0) {
	    	System.out.println("���ڼ��㷶Χ");
	    	return -1;
	    }
	    else 
        return x*y;
    }
    public double divide(double x,double y){
    	if(y==0) {
    		System.out.println("���ݴ���");
    		return -1;
    	}
    	else 
        return x/y;
    }
}