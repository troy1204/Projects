class Triangle extends Shape
{
    double s1,s2, s3;

    Triangle(double s1,double s2, double s3)
    {       
        setDim(s1,s2,s3);
    }

    public double getS1() {        
        return s1;
    }
    public double getS2() {
        return s2;
    }
    public double getS3() {
        return s3;
    }

    public void setDim(double side1,double side2, double side3)
    {        
        this.s1 = side1;
        this.s2 = side2;
        this.s3 = side3;
    }

    public double area()
    {
        double area = 0;
        if(s1 > 0 && s2 > 0 && s3 > 0)
        {
            double s = (s1 + s2 + s3)/2.0d;
            double x = (s * (s-s1) * (s-s2) * (s-s3));
            area = Math.sqrt(x);
        }
        else
        {
            System.out.println("You Entered Negetive Length or Width");
            area = 0;   
        }
        return area;
    }
}