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
float x=random(26, 374);
float y=random(26, 374);
int moveRight=1;
int moveDown=1;
public void setup()
{
  size(400, 400);
  background(0);
  frameRate(200);
}
public void draw()
{
  ball();
}
public void ball()
{
  background(0);
  float r=random(0, 255);
  float g=random(0, 255);
  float b=random(0, 255);
  fill(r, g, b);
  ellipse(x, y, 50, 50);
  if (x<26)
    moveRight=1;
  if (x>374)
    moveRight=2;
  if (y<26)
    moveDown=1;
  if (y>374)
    moveDown=2;
  if (moveRight<2)
    x++;
  if (moveRight>1)
    x--;
  if (moveDown<2)
    y++;
  if (moveDown>1)
    y--;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
