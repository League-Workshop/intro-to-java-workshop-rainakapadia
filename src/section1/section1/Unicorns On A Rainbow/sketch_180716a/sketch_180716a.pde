 PImage rainbow;
  PImage unicorn;
  void setup(){

 size(800,800);
  rainbow= loadImage("rainbow.jpeg");
  rainbow.resize(width,height);
  
  unicorn= loadImage("unicorn.png");
  unicorn.resize(500,480);


}
void draw(){
background(rainbow);
  image(unicorn,mouseX,mouseY);
}