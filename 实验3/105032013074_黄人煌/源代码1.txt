package fankk;

public class Money{ 
	 private int fAmount;//余额 
	 private String fCurrency;//货币类型 

	 public Money(int amount, String currency) { 
	 fAmount= amount; 
	 fCurrency= currency; 
	 } 

	 public int amount() { 
	 if(fAmount<0) {System.out.println("数据错误"); return -1;}
	 return fAmount; 
	 } 

	 public String currency() { 
	 return fCurrency; 
	 } 

	 public Money add(Money m) {//加钱 
	 if(m.amount()>0&&m.currency()!=null){
		 System.out.println("加钱成功");
		 return new Money(amount()+m.amount(), currency()); 
	 }
	 else {
		 System.out.println("加钱失败");
		 return m;
	 }
	 
	 } 

	 public boolean equals(Object anObject) {//判断钱数是否相等 
	 if (anObject instanceof Money) { 
	 Money aMoney= (Money)anObject; 
	 return aMoney.currency().equals(currency()) 
	 && amount() == aMoney.amount(); 
	 } 
	 return false; 
	 } 
	 } 