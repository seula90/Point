package Point;

public class ColorPoint extends Point {
	private String color;
	
	public ColorPoint(int x, int y, String color){
	//	setX(x);
	//	setY(y);
		super(x,y);
		this.color=color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void show() {
		System.out.println("좌표 [x= "+getX()+", y= "+getY()+"]에 "+this.color+"점을 그렸습니다.");
	}

	
}
