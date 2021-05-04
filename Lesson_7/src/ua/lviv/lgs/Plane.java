package ua.lviv.lgs;

public abstract class Plane {

	private int length;
	private int height;
	private int weight;

	private PlaneControl planeControl = new PlaneControl();

	public Plane(int length, int height, int weight) {
		this.length = length;
		this.height = height;
		this.weight = weight;
	}

	public void startEngines() {
		int countdown = 20 + (int) (Math.random() * (68 + 1));
		System.out.println("Запускаю двигуни. Взліт можливий  через " + countdown + " сек");
	}

	public void takeoffPlane() {
		double distance = (Math.random() * 1000);
		System.out.println("Починаю зліт. Літак  с повними баками пролетить " + distance + " км");
	}

	public void landingPlane() {
		System.out.println("Сідаю.Починаю зниження ");
	}

	public void moveUp() {
		planeControl.moveUp();
	}

	public void moveDown() {
		planeControl.moveDown();
	}

	public void moveLeft() {
		planeControl.moveLeft();
	}

	public void moveRight() {
		planeControl.moveRight();
	}
}
