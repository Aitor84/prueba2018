package aitor.ejemplo1;

public class Punto {
	
	private int x, y;

	public Punto(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Punto() {
		this(1, 1); //x = 1, y = 1;
	}

@Override
public String toString() {
	return "ejemplo1 [x=" + x + ", y=" + y + "]";
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + x;
	result = prime * result + y;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Punto other = (Punto) obj;
	if (x != other.x)
		return false;
	if (y != other.y)
		return false;
	return true;
}
}
