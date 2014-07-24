public class Shapes
{
    public static void main(String args[])
    {
        Circle cir = new Circle(5);
        Rectangle rect = new Rectangle(5,8);
        Triangle tri = new Triangle(4,13,15);
        shapeDetails(rect);
        shapeDetails(cir);
        shapeDetails(tri);
    }
    public static void shapeDetails(Shape type)
    {
        if(type instanceof Rectangle)
        {
            Rectangle r = (Rectangle)type;
            System.out.println("This rectangle has a length of "+r.getL()+" and a width of "+r.getW()+" and an area of "+r.area());
        }
        else if(type instanceof Circle)
        {
            Circle c = (Circle)type;
            System.out.println("This Circle has a Radius of "+c.getR()+" and an area of "+c.area());

        }
        else
        {
            Triangle t = (Triangle)type;
            System.out.println("This Triangle has a side1 of "+t.getS1()+" side2 of " + t.getS2()+" and a side3 of "+t.getS3()+" and an area of "+t.area());
        }

    }
}
