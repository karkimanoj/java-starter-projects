package javapractice;

public class Point3DGeneric <T extends Number> 
{
	 protected T x, y, z;
	 
	
	public Point3DGeneric(T xDouble, T yDouble, T zDouble) 
    {
            x = xDouble;
            y = yDouble;
            z = zDouble;
    }
	
	public String toString()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    
}
