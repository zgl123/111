package FKK;

import org.junit.Assert;

import fankk.Money;
import junit.framework.TestCase;


public class MoneyTest extends TestCase { //TestCase的子类 
	 public void testjiekou() { //把测试代码放在testjiekou中 
	 Money m12CHF= new Money(12, "CHF"); //本行和下一行进行一些初始化 
	 Money m14CHF= new Money(14, "CHF");
	 Money expected= new Money(26, "CHF");//预期的结果   

	 System.out.println("-------接口测试--------");
	 Money result= m12CHF.add(m14CHF); //运行被测试的方法
	 System.out.println("ADD()方法测试成功");
	 System.out.println("两个相同数据equals()方法测试成功，出现failures,并且测试失败");
     Assert.assertTrue(m12CHF.equals(m12CHF)); 	 
     Assert.assertTrue(expected.equals(result)); //判断运行结果是否与预期的相同 
	 } 
	public void testBoder(){
		 Money m12CHF= new Money(12, "CHF");
		 Money m14CHF= new Money(0, "CHF");
	     System.out.println("-------边界条件测试--------");
		 Money result= m12CHF.add(m14CHF);
		 Money expected= new Money(26, "CHF");
		 Assert.assertTrue(expected.equals(result));
	}
	public void testfalse(){
        System.out.println("-------容错性测试--------");
		System.out.println("定义错误数据");
		 Money m14CHF= new Money(-1, "CHF");
		 if( m14CHF.amount()>0)
		 Assert.assertTrue(true);
		 else  Assert.assertTrue(false);
	}
}
