class Circle extends Shape

{

double r;

Circle(double radius)

{

r = radius;

}

public double getR() {

return r;

}

public void setR(double r) {

this.r = r;

}

public double area()

{

double area = 0;

if(r >= 0)

{

area = 3.14 * r * r;

}

else

{

System.out.println("You Entered Negetive Radius");

area = 0;

}

return area;

}

}
