import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

//1 is true, 2 is false
int x=PApplet.parseInt(random(41, 359));
int y=PApplet.parseInt(random(41, 359));
boolean moveRight=false;
boolean moveDown=false;
public void setup()
{
  size(400, 400);
  background(0);
  frameRate(200);
}
public void draw()
{
  background(0);
  block();
  ball();
  border();
}
public void ball()
{
  float r=PApplet.parseInt(random(0, 255));
  float g=PApplet.parseInt(random(0, 255));
  float b=PApplet.parseInt(random(0, 255));
  stroke(0);
  strokeWeight(1);
  fill(r, g, b);
  ellipse(x, y, 50, 50);
  if(get(x+31,y)!=color(0))
  	moveRight=false;
  if(get(x-31,y)!=color(0))
  	moveRight=true;
  if(get(x,y+31)!=color(0))
  	moveDown=false;
  if(get(x,y-31)!=color(0))
  	moveDown=true;
  if(!moveRight)
  {
  	x--;
  }
  else
  {
  	x++; 
  }
  if(!moveDown)
  {
  	 y--;
  }
  else 
  {
  	 y++;
  }
}
public void block()
{
	stroke(255);
	fill(255);
	rect(mouseX-10,mouseY-10,20,20);
}
public void border()
{
	stroke(255);
  strokeWeight(20);
  noFill();
  rect(0,0,400,400);
}












// void setup()
// {
// 	size(270,270);
// 	background(96);
// }
// void draw()
// {
// 	goomy();
// 	ears();
// 	shade();
// }
// void goomy()
// {
// 	stroke(32);
// 	strokeWeight(7);
// 	fill(229,204,255);
// 	//body
// 	ellipse(120,150,200,190);
// 	//eyes
// 	ellipse(78,132,6,12);
// 	ellipse(130,133,6,12);
// 	//ears
// 	// beginShape();
// 	// curveVertex(103,123);
// 	// curveVertex(48,78);
// 	// curveVertex(38,52);
// 	// curveVertex(52,48);
// 	// endShape();
// }
// void ears()
// {
// 	beginShape();
// 	curveVertex(103,123);
// 	curveVertex(48,78);
// 	curveVertex(38,52);
// 	curveVertex(52,48);
// 	endShape();
// }
// void shade()
// {

// }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
