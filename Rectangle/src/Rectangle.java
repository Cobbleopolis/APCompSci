import java.util.Random;


public class Rectangle {
	
	static Random rand = new Random();
	
	public int width;
	public int height;
	
	public int area;
	public int perim;
	
	public Rectangle(){
		width = 5;
		height = 5;
	}
	
	public Rectangle(int w,int h){
		width = w;
		height = h;
	}
	
	
	public void setLength(int i){
		width = i;
	}
	
	public void setWidth(int i){
		height = i;
	}
	public int computeArea(){
		area = width * height;
		return area;
	}
	
	public int computePerimeter(){
		perim = (width + height) * 2;
		return perim;
	}
	
//	public int getArea(){
//		return area;
//	}
	
}
