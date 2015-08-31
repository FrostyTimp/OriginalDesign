int x=(int)(Math.random()*315)+41;
int y=(int)(Math.random()*315)+41;
boolean moveRight=false;
boolean moveDown=false;
void setup()
{
  size(400, 400);
  background(0);
  frameRate(200);
}
void draw()
{
  background(0);
  block();
  ball();
  border();
}
void ball()
{
  float r=(int)(Math.random()*256);
  float g=(int)(Math.random()*256);
  float b=(int)(Math.random()*256);
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
void block()
{
	stroke(255);
	fill(255);
	rect(mouseX-10,mouseY-10,20,20);
}
void border()
{
	stroke(255);
  strokeWeight(20);
  noFill();
  rect(0,0,400,400);
}
