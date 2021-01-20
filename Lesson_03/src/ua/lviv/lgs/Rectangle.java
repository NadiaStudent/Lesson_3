package ua.lviv.lgs;

public class Rectangle {
private double width;
private double length;

Rectangle(){}

Rectangle(double newWidth, double newLength){
	this.setWidth(newWidth);
	this.setLength(newLength);
}
 double getWidth() {return width;}
void setWidth(double width) {this.width = width;}

double getLength() {return length;}
void setLength(double length) {this.length = length;}
}