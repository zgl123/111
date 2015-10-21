
public class wanshu {
		public  boolean fun(int a,int b) {
	    	if(b>1000) {
	    	  	System.out.println("不在计算范围");
	    	  	return false;
	    	}
	    	else if(a<0){
	    		System.out.println("数据错误");
	    		return false;
	    	}
	        System.out.println(a+"~"+b+"之间的完数是：");
			for (int i = a; i <= b; i++) {

				int temp = 0;

				for (int n = 1; n < i / 2 + 1; n++) {
					if (i % n == 0) {
						temp += n;
					}
				}
				if (temp == i) {
					System.out.print(i + " ");
				}
			}
			return true;
		}
	}

