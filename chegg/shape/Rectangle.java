class Rectangle extends Shape

{

double l,w;

Rectangle(double l,double w)

{

setDim(l,w);

}

public double getL() {

return l;

}

public double getW() {

return w;

}

public void setDim(double len,double wid)

{

this.l = len;

this.w = wid;

}

public double area()

{

double area = 0;

if(l > 0 && w > 0)

{

area = l * w;

}

else

{

System.out.println("You Entered Negetive Length or Width");

area = 0;

}

return area;

}

}
