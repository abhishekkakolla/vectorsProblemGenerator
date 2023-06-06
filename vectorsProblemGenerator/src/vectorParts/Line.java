package vectorParts;

public class Line {

	// Properties of a line
	private Vector positionVector;
	private Vector directionVector;
	
	
	// Properties of general line
	private String pointP_x;
	private String pointP_y;
	private String pointP_z;
	
	
	// constructor for random Line
	public Line() 
	{
		this(new Vector(), new Vector());
		
	}
	
	// constructor for a specific Line
	public Line(Vector directionVector, Vector positionVector)
	{
		this.positionVector = positionVector;
		this.directionVector = directionVector;
		pointP_x =  (int) this.positionVector.getX() + " + " + (int) this.directionVector.getX() + "t";
		pointP_y =  (int) this.positionVector.getY() + " + " + (int) this.directionVector.getY() + "t";
		pointP_z =  (int) this.positionVector.getZ() + " + " + (int) this.directionVector.getZ() + "t";
	}
	
	// constructor for a random line with a specific positionVector
	public Line (Vector positionVector)
	{
		this(new Vector(), positionVector);
	}
	
	// getter method for properties of a line
	
	
	public Vector getPositionVector()
	{
		return positionVector;
	}
	
	public Vector getDirectionVector()
	{
		return directionVector;
	}
	
	
	// toString method for a line
	public String toString()
	{
		String temp;
		temp = positionVector.toString() + " + " +  "t" + directionVector.toString();
		return temp;
	}
	
	public String getGeneralPointForm()
	{
		
		String temp;
		temp = "(" + pointP_x + "," + pointP_y + "," + pointP_z + ")";
		return temp;
		
	}
	
	public String getGeneralX()
	{
		return pointP_x;
	}
	
	public String getGeneralY()
	{
		return pointP_y;
	}
	
	public String getGeneralZ()
	{
		return pointP_z;
	}
	
	
	
}
