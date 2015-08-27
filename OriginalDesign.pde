//1 is true, 2 is false
int x=int(random(41, 359));
int y=int(random(41, 359));
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
  float r=int(random(0, 255));
  float g=int(random(0, 255));
  float b=int(random(0, 255));
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