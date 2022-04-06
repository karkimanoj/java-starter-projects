package javapractice;

public class Point2D
{
    protected Double x;
    protected Double y;
 
    public Point2D()
    {
        x = 0.00;
        y = 0.00;    
    }

    public Point2D(Double xDouble, Double yDouble)
    {
        x = xDouble;
        y = yDouble;    
    }
    
    public String toString()
    {
        return "(" + x + ", " + y + ")";
    }

    public Double distance(Point2D secondPoint)
    {
        return Math.sqrt((secondPoint.x - x)*(secondPoint.x - x) + (secondPoint.y -y)*(secondPoint.y -y));
    }
}