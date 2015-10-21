package ccccccc;

public class volume
{
public boolean fun(int n)
{
	 if(n>10) {
		  	System.out.println("不在计算范围");
		  	return false;
		}
		else if(n<0){
			System.out.println("数据错误");
			return false;
		}
double r=0,v=0;
v=4*3.14159/3*n*n*n;
System.out.println("球体积为："+v);
 return true;
}
}