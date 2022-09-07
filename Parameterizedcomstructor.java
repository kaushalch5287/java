import java.lang.*;


class Parameterizedcomstructor{
	public static void main(String args[]){
		Rectangle R = new Rectangle();
		Rectangle S = new Rectangle(10,20);
		System.out.println("area of rectangle using fuction = " + R.rectarea());
		System.out.println("area of rectangle using fuction call = " + S.rectarea());
}}

class Rectangle{
	int length,width ;
	Rectangle(){
		length = 0 ;
		width  = 0 ; }
	Rectangle(int x,int y){
		length = x;
		width = y; }
	int rectarea(){
		return (length*width); }
}