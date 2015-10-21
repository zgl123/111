package bbbbb;

public class yh {
		 public boolean fun(int n){
			 if(n>10) {
	    		  	System.out.println("不在计算范围");
	    		  	return false;
	    		}
	    		else if(n<0){
	    			System.out.println("数据错误");
	    			return false;
	    		}
	         
		  int a[][]=new int[5][5];
		  for (int i=0;i<a.length ;i++ )
		  {
		   for (int j=0;j<a[i].length ;j++ )
		   {
		    if (j==0||i==j)
		    {
		       a[i][j]=1;
		    }
		     else{
		      if (i>j)
		      {
		       a[i][j]=a[i-1][j]+a[i-1][j-1];
		      }
		       }
		      }
		  }
		  for (int i=0;i<a.length ;i++ )
		  {
		   for (int j=0;j<a[i].length ;j++ )
		   {
		     if (i>=j)
		     {
		       System.out.print(a[i][j]+"\t");
		     }
		   }
		             System.out.println();
		  }return true;
		}
		}
