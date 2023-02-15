
/**
 * Write a description of class Plotter here.
 *
 * @author (William Chung)
 * @version (16/2/23)
 */
public class Plotter
{
    // instance variables - replace the example below with your own
    Coordinate point;

    /**
     * Constructor for objects of class Plotter
     */
    public Plotter()
    {
        // initialise instance variables
        point = new Coordinate();
        point.x=3;
        point.y=7;
        System.out.println("Coordinate location is: "+point.x+","+point.y);
    }
} 