package	javapractice;

public class Point3D extends Point2D
{
    protected Double z;

    public Point3D(Double xDouble, Double yDouble, Double zDouble) 
    {
            super(xDouble, yDouble);
            z = zDouble;
    }

    @Override
    public String toString()
    {
        return "(" + x + ", " + y + ", " + z + ")";
    }
    
    public Double distance(Point3D secondPoint)
    {
        
        return Math.cbrt((secondPoint.x - x)*(secondPoint.x - x) + (secondPoint.y -y)*(secondPoint.y -y) + (secondPoint.z -z)*(secondPoint.z -z) );
    }
}