//Program to calculate the area of Circle, Rectangle and Triangle
//using Constructors
//Coder: Ashi777

class AreaUsingConstructors
{
	public static void main(String[] args)
	{
		Rectangle obj1 = new Rectangle(4,6);
		Circle obj2 = new Circle(7);
		Triangle obj3 = new Triangle(5,8);
	}
}

class Rectangle
{
	int length, breadth;
	Rectangle(int length, int breadth)
	{
		this.length=length;
		this.breadth=breadth;
		System.out.println("Area of rectangle is :"+(length*breadth));
	}
}

class Circle
{
	int radius;
	Circle(int radius)
	{
		this.radius=radius;
		System.out.println("Area of circle is :"+(3.14*radius*radius));
	}
}

class Triangle
{
	int height, base;
	Triangle(int height, int base)
	{
		this.height=height;
		this.base=base;
		System.out.println("Area of triangle is :"+(height*base)/2);
	}
}
