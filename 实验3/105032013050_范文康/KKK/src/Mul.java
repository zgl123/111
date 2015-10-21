public class Mul{
	
public int mul(int x,int y) {
	
	    if(x<0||y<0) {
	    	System.out.println("不在计算范围");
	    	return -1;
	    }
	    else 
        return x*y;
    }
    public double divide(double x,double y){
    	if(y==0) {
    		System.out.println("数据错误");
    		return -1;
    	}
    	else 
        return x/y;
    }
}