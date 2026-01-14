package chapter12.clone;

public class Point {
	
	int x;
	int y;

	public Point(int x, int y) {
		
		this.x = x;
		this.y = y;
	}

	// toString -> 주소값을 갖는 객체의 주소를 받는게 아니라 그 안에 있는 결과값을 불러옴 
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
