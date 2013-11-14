package logicGatePlan;

public class Plan {
	private int width;
	private int height;
	
	public Plan(int width, int height)
	{
		this.setWidth(width);
		this.setHeight(height);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
}
