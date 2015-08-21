//1 is true, 2 is false
float x=random(26, 374);
float y=random(26, 374);
int moveRight=1;
int moveDown=1;
void setup()
{
  size(400, 400);
  background(0);
  frameRate(200);
}
void draw()
{
  ball();
}
void ball()
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
