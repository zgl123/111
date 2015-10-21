
public class prime {
	public boolean isprime(int n){
	if(n>1000) {
	  	System.out.println("不在计算范围");
	  	return false;
	}
	else if(n<0){
		System.out.println("数据错误");
		return false;
	}
	boolean isPrime = true;
	for (int i = 2; i<= n/2; i+=2){
	    if(n%i == 0){
	        isPrime = false;
	        break;
	    }
	}
	return isPrime;
	}
}
