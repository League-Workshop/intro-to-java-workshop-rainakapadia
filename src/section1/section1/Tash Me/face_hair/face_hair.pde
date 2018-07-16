PImage mustache;
PImage face;
PImage hat;
void setup(){
  face= loadImage("face.jpeg");
  size(800,800);
  face.resize(width,height);
  mustache= loadImage("mustache.png");
  hat= loadImage("hat.png");
}
void draw(){
  background(face);
  
  if(mousePressed){
  image(mustache,mouseX-265,mouseY-150);
 }
 if(mouseButton== RIGHT){
   image(hat,mouseX-50, mouseY-500);
 }
}
  
  