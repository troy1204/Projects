#include <iostream> 
using namespace std;
 
class Shape {
   protected:
      int width, height;
   public:
      Shape( int a=0, int b=0)
      {
         width = a;
         height = b;
      }
      // pure virtual function
      virtual int area() = 0;
};
class Rectangle: public Shape{
   public:
      Rectangle( int a=0, int b=0) : Shape(a, b) { }
      int area ()
      { 
         cout << "Rectangle class area :" <<endl;
         return (width * height); 
      }
};
class Square: public Shape{
   public:
      Square( int a=0, int b=0) : Shape(a, b) { }
      int area ()
      { 
         cout << "Square class area :" <<endl;
         return (width * width); 
      }
};
class Triangle: public Shape{
   public:
      Triangle( int a=0, int b=0):Shape(a, b) { }
      int area ()
      { 
         cout << "Triangle class area :" <<endl;
         return (width * height / 2); 
      }
};

class ShapeList{
	protected:
		vector<Shape> sh;
		int numOfSh;
		int x = 1;
		int y = 1;
		int area = 0;
	public:
		ShapeList(int c){
			numOfSh = c;
		}
		int totalArea(){
			for(int k=0; k<numOfSh; k++){
				if(numOfSh % 2 == 0){
					x = x*k*2;
					y = y*k*2;
					sh.push_back(Rectangle rec(10,7));
					area = area + shape->area();
				}
				else if(numOfSh % 3 == 0){
					x = x*k*3;
					y = y*k*3;
					sh.push_back(Triangle rec(10,7));
					area = area + shape->area();
				}
				else{
					x = x*k*5;
					y = y*k*5;
					sh.push_back(Square rec(10,7));
					area = area + shape->area();
				}
			}
		}
	}
}}  

// Main function for the program
int main( )
{
	cout << "Enter number of shapes : ";
	cin >> nos;
	ShapeList shl = new ShapeList(nos);


   /*Shape *shape;
   Rectangle rec(10,7);
   Triangle  tri(10,5);
   Square  sq(10,10);
   int t = 0;
   int s = 0;
   int r = 0;
   int tot = 0;

   // store the address of Rectangle
   shape = &rec;
   // call rectangle area.
   t =  shape->area();
   cout << t << "\n";
  
   // store the address of Triangle
   shape = &tri;
   // call triangle area.
   s = shape->area();
   cout << s << "\n";
   
   // store the address of Square
   shape = &sq;
   // call Square area.
   r = shape->area();
   cout << r << "\n";
   
   tot = t + s + r;
   cout << "total = " << tot; */
   
   return 0;
}