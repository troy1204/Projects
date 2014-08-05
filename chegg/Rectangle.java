public class Rectangle {
    private double length, width;

    // constructor without paramters
    public Rectangle()
    {
      setLength( 1.0 );
      setWidth( 1.0 );
    }

    // constructor with length and width supplied
    public Rectangle( double theLength, double theWidth )
    {
        setLength( theLength );
        setWidth( theWidth );
    }

    // validate and set length
    public void setLength( double theLength )
    {
         length = ( theLength > 0.0 && theLength < 20.0 ? theLength : 1.0 );
    }

    // validate and set width
    public void setWidth( double theWidth )
    {
          width = ( theWidth > 0 && theWidth < 20.0 ? theWidth : 1.0 );
    }

    // get value of length
    public double getLength()
    {
          return length;
    }

    // get value of width
    public double getWidth()
    {
         return width;
    }

    // calculate rectangle's perimeter
    public double perimeter()
    {
         return 2 * length + 2 * width;
    }

    // calculate rectangle's area
    public double area()
    {
         return length * width;
    }

    // convert to String
    public String toRectangleString ()
    {
         return ( " Length: " + length + "\n" + " Width: " + width + "\n" +
            " Perimeter: " + perimeter() + "\n" + " Area: " + area() );

    }
}