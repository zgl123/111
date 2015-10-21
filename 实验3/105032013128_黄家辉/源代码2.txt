package dddddddd;
	import java.awt.Point;
public class point {
	 public boolean fun(int a,int b,int x,int y) {
		 if(a>10||b>10||x>10||y>10) {
			  	System.out.println("不在计算范围");
			  	return false;
			}
			else if(a<0||b<0||y<0||x<0){
				System.out.println("数据错误");
				return false;
			}
		Point p1 = new Point(a, b);
		Point p2 = new Point(x, y);
		// 两点间距离
        
		double jili = Math.sqrt(Math.abs((p1.getX() - p2.getX())
		* (p1.getX() - p2.getX())+(p1.getY() - p2.getY())
		* (p1.getY() - p2.getY())));
		System.out.println("两点间的距离是:" + jili);
	 return true;	
	 }

}
