
public class wanshu {
		public  boolean fun(int a,int b) {
	    	if(b>1000) {
	    	  	System.out.println("���ڼ��㷶Χ");
	    	  	return false;
	    	}
	    	else if(a<0){
	    		System.out.println("���ݴ���");
	    		return false;
	    	}
	        System.out.println(a+"~"+b+"֮��������ǣ�");
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

