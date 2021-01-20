package ua.lviv.lgs;

public class RectangleCalc {

	public static void main(String[] args) {
		Rectangle pershyi = new Rectangle(7.8,5);
		Rectangle drugyi = new Rectangle();
		drugyi.setWidth(4);
		drugyi.setLength(125);
		
		System.out.println("Площа прямокутника= "+pershyi.getLength() * pershyi.getWidth());
		System.out.println("Периметр прямокутника= "+2*(pershyi.getLength() + pershyi.getWidth()));
		System.out.println("Площа прямокутника= "+drugyi.getLength() * drugyi.getWidth());
		System.out.println("Периметр прямокутника= "+2*(drugyi.getLength() + drugyi.getWidth()));
	
	}

}
