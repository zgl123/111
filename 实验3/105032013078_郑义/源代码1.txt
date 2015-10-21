package hhhhhh;

import javax.print.attribute.standard.RequestingUserName;

public class shuixianhua {
    public boolean Flowa(int a,int b){
    	if(b>1000) {
    	  	System.out.println("不在计算范围");
    	  	return false;
    	}
    	else if(a<0){
    		System.out.println("数据错误");
    		return false;
    	}
        System.out.println(a+"~"+b+"之间的水仙花数是：");
        for(int custNo=a;custNo<=b;custNo++){
            int geWei=custNo%10;
            int shiWei=custNo/10%10;
            int baiWei=custNo/100%10;
            if(custNo==geWei*geWei*geWei+shiWei*shiWei*shiWei+baiWei*baiWei*baiWei){
                System.out.println(custNo);
            }
        } return true;
    }
   
}
