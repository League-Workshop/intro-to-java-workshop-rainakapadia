int x= 328;
int y= 272;
int acceleration=5;
void setup(){
PImage catPic;
size(800,800);
catPic=loadImage("catPic.jpeg");
catPic.resize(width,height);
background(catPic);
}
void keyPressed(){
  x-=5*acceleration;
  y+=5*acceleration;
}

void draw(){
  if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#CB1B1B);
noStroke();
ellipse(x,y,50,50);
}