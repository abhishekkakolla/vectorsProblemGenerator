package vectorParts;

public class Vector {

	// Vector properties
	private double x;
	private double y;
	private double z;
	
	// constructor that creates random vector
	public Vector() 
	{
		this.x = (int) (Math.random() * 15 + 1);
		this.y = (int) (Math.random() * 15 + 1);
		this.z = (int) (Math.random() * 15 + 1);
	}
	
	// constructor that creates a specific vector
	
	public Vector(double x, double y, double z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	
	// get x value
	public double getX()
	{
		return x;
	}
	
	// set x value
	public void setX(double value)
	{
		x = value;
	}
		
	
	// get y value
	public double getY()
	{
		return y;
	}
	
	// set y value
	public void setY(double value)
	{
		y = value;
	}
			
	
	// get z value
	public double getZ()
	{
		return z;
	}
	
	// set z value
	public void setZ(double value)
	{
		z = value;
	}
			
	
	// magnitude of vector
	public double getMagnitude()
	{
		return Math.sqrt((x*x) + (y*y) + (z*z));
	}
	
	// add 2 vectors
	public Vector add(Vector other) 
	{
		Vector addedVector = new Vector();
		addedVector.setX(this.x + other.getX());
		addedVector.setY(this.y + other.getY());
		addedVector.setZ(this.z + other.getZ());
		return addedVector; 
	}
	
	public Vector subtract(Vector other) 
	{
		Vector addedVector = new Vector();
		addedVector.setX(this.x - other.getX());
		addedVector.setY(this.y - other.getY());
		addedVector.setZ(this.z - other.getZ());
		return addedVector; 
	}
	
	
	// dot product 2 vectors
	public double dotProduct(Vector other)
	{
		return this.x * other.getX() + this.y * other.getY() + this.z * other.getZ();
	}
	
	
	// cross product 2 vectors
	public Vector crossProduct(Vector other)
	{
		Vector crossedVector = new Vector();
		crossedVector.x = this.y * other.getZ() - other.getY() * this.z;
		crossedVector.y = this.z * other.getX() - other.getZ() * this.x;
		crossedVector.z = this.x * other.getY() - other.getX() * this.y;
		return crossedVector;
	}
	
	
	// scalar multiplication 
	public Vector multiply(int scalar)
	{
		Vector temp = new Vector();
		temp.x = scalar * this.x;
		temp.y = scalar * this.y;
		temp.z = scalar * this.z;
		return temp;
	}
	
	
	// toString methods for vectors
	public String toString()
	{
		return "(" + (int) x + "," + (int) y + "," + (int) z + ")";
	}
	
	public String toStringDouble()
	{
		return "(" + Math.round(x * 100.0)/100.0 + "," + Math.round(y * 100.0)/100.0 + "," + Math.round(z*100.0)/100.0 + ")";
	}
	
	public String getAlgebraicForm()
	{
		String temp = "";
		if (x != 0)
		{
			temp += (int) x + "i + ";
		}
		if (y != 0)
		{
			temp += (int)y + "j + ";
		}
		if (z != 0)
		{
			temp += (int)z + "k ";
		}
		return temp;
	}
	
}
