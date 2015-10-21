package fankk;

public class Money{ 
	 private int fAmount;//��� 
	 private String fCurrency;//�������� 

	 public Money(int amount, String currency) { 
	 fAmount= amount; 
	 fCurrency= currency; 
	 } 

	 public int amount() { 
	 if(fAmount<0) {System.out.println("���ݴ���"); return -1;}
	 return fAmount; 
	 } 

	 public String currency() { 
	 return fCurrency; 
	 } 

	 public Money add(Money m) {//��Ǯ 
	 if(m.amount()>0&&m.currency()!=null){
		 System.out.println("��Ǯ�ɹ�");
		 return new Money(amount()+m.amount(), currency()); 
	 }
	 else {
		 System.out.println("��Ǯʧ��");
		 return m;
	 }
	 
	 } 

	 public boolean equals(Object anObject) {//�ж�Ǯ���Ƿ���� 
	 if (anObject instanceof Money) { 
	 Money aMoney= (Money)anObject; 
	 return aMoney.currency().equals(currency()) 
	 && amount() == aMoney.amount(); 
	 } 
	 return false; 
	 } 
	 } 