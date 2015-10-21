package aaaaaaaaa;

public class linxing { 
	  
    /**
     * @param args
     */ 
    public boolean fun(int n) { 
    	
    		if(n>1000) {
    		  	System.out.println("不在计算范围");
    		  	return false;
    		}
    		else if(n<0){
    			System.out.println("数据错误");
    			return false;
    		}
         
        for(int i = 0; i < n - 1; i++) 
        { 
            for(int x = i + 1; x < n; x++) 
            { 
                System.out.print(" "); 
            } 
            for(int y = 0; y < (i + 1) * 2 - 1; y++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        for(int i = 0; i < n; i++) 
        { 
            for(int x = 0; x < i; x++) 
            { 
                System.out.print(" "); 
            } 
            for(int y = i; y < 2 * n - i - 1; y++) 
            { 
                System.out.print("*"); 
            } 
            System.out.println(); 
        } 
 
          return true;
    	}
    }