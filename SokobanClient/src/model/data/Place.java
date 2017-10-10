package model.data;

import java.io.Serializable;

public class Place implements Serializable {
	private int x, y;

	public Place() {

	}

	public Place(int x, int y) {
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {

		String s = "(" + Integer.toString(x) + "," + Integer.toString(y) + ")";
		return s;

	}

}
